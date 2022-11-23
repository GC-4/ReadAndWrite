package com.rcv.readdata;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataPractice2 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fileout = new FileOutputStream ("/Users/Garima/eclipse-workspace/ReadAndWrite/src/com/rcv/properties/WriteData2.properties",true);
		Properties property = new Properties();
		property.setProperty("FirstName", "Garima");
		property.setProperty("LastName", "Chauhan");
		property.setProperty("Address", "Santa Clara");
		property.setProperty("Purpose", "Job");
		property.save(fileout, "This Is Practice File");
		
		System.out.println(property.get("LastName"));
		
	}

}
