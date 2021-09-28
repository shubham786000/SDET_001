package com.crm.genericUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFileUtility {
	/*
	 * this methods read the data from json file @throws throwable
	 * 
	 */
	 public String readDataFromJSON(String key) throws IOException, ParseException
	 {
		 // read the data from json file 
		 FileReader file = new FileReader("./commonData.json");
		 
		 //convert the json file into java 
		 JSONParser jsonobj = new JSONParser();
		Object jObj = jsonobj.parse(file);
		 //type cast to java obj to hashmap
		 
		 HashMap map = (HashMap)jObj;
		 String value = map.get(key).toString();
		
		// return the value
		 return value;
		
	}
}
		 
		 
		 
		 
	 


