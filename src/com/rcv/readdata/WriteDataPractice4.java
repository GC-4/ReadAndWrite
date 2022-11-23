package com.rcv.readdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataPractice4 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileout = new FileOutputStream("/Users/Garima/eclipse-workspace/ReadAndWrite/src/com/rcv/properties/WriteDataPractice4.properties",true);
		Properties property = new Properties();
		property.setProperty("fruit", "apple");
		property.setProperty("color", "green");
		property.setProperty("taste", "sweet");
		property.setProperty("demand", "high");
		property.setProperty("fruit", "orange");
		property.setProperty("color", "orange");
		property.setProperty("taste", "sweet and sour");
		property.setProperty("demand", "very high");
		property.save(fileout, "Comments");
		
	
		FileInputStream filein = new FileInputStream("/Users/Garima/eclipse-workspace/ReadAndWrite/src/com/rcv/properties/WriteDataPractice4.properties");
		property.load(filein);
		System.out.println(property.get("fruit"));
	
	}

}
