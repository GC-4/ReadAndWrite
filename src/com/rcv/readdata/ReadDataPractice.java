package com.rcv.readdata;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataPractice {

	public static void main(String[] args) throws IOException {
	
	FileInputStream fis = new FileInputStream("/Users/Garima/eclipse-workspace/ReadAndWrite/src/com/rcv/properties/TestData.properties");		
	
	Properties p = new Properties();
	
	p.load(fis);
	
	System.out.println(p.get("website"));
	}

}
