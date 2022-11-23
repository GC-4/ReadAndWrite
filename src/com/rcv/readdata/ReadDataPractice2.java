package com.rcv.readdata;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.management.OperatingSystemMXBean;
import java.util.Properties;

public class ReadDataPractice2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/Garima/eclipse-workspace/ReadAndWrite/src/com/rcv/properties/TestData2.properties");

		Properties property = new Properties();
		
		property.load(fis);
		
		System.out.println(property.getProperty("Country"));
		System.out.println("Today it is sunny and not cloudy");
		
	}

}
