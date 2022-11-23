package com.rcv.readdata;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataPractice4 {

	public static void main(String[] args) throws IOException {
		FileInputStream filein = new FileInputStream ("/Users/Garima/eclipse-workspace/ReadAndWrite/src/com/rcv/properties/TestData.properties");
		Properties property = new Properties();
		property.load(filein);
		System.out.println(property.get("Country"));
		
	}

}
