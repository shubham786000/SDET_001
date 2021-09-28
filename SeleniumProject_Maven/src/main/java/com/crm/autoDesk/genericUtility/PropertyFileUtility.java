package com.crm.autoDesk.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
	// this method contains method to read data from property file 
	
		public String getPropertyFileData(String key) throws Throwable {
			
			FileInputStream fis = new FileInputStream("./Excelsheet/Product.xlsx");
			Properties p = new Properties();
			p.load(fis);
			String value = p.getProperty(key);
			return value;
		}
		

}
