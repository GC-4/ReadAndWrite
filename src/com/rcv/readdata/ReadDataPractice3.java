package com.rcv.readdata;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataPractice3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/Garima/eclipse-workspace/ReadAndWrite/src/com/rcv/properties/ReadData3.properties");
		Properties property = new Properties();
		property.load(fis);
		System.out.println(property.get("LastName"));
	}

}
