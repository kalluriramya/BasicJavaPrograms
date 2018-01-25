package com.util.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SystemProperties {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.list(System.out);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("mysystem.properties");
			p.store(fos, null); 
			fos.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
