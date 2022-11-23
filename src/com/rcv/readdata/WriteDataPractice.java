package com.rcv.readdata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataPractice {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileout = new FileOutputStream("/Users/Garima/eclipse-workspace/ReadAndWrite/src/com/rcv/properties/TestData.properties",true);
		Properties property = new Properties();
		
		// whenever I try to write anything other than string,string, it gives an error
		property.setProperty("Country","India");
		property.setProperty("Country","USA");
		
		//property.setProperty(1, "Garima");
		
		//in save, I get error every time
		property.save(fileout, "");
		
	}

}
