package com.crm.genericUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadDataFromJSONFile {
	public static void main(String[] args) throws Throwable {
		
		JSONParser jsonparser =  new JSONParser();
		FileReader reader = new FileReader("./employee.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject empjsonobj = (JSONObject)obj;
		
		String fname =(String) empjsonobj.get("firstName");
		String lname =(String) empjsonobj.get("lastName");
		
		System.out.println("first name:" + fname);
		System.out.println("last name:" + lname);
				
		JSONArray array =(JSONArray)empjsonobj.get("address");
		for(int i=0; i<array.size(); i++)
		{
			JSONObject address = (JSONObject) array.get(i);
			
			String street = (String) address.get("street");
			String city = (String) address.get("city");
			String state = (String) address.get("state");
			
			System.out.println("Address of " + i +"is......");
			System.out.println("street:" + street);
			System.out.println("city:" + city);
			System.out.println("state:" + state);
			
		}
		
		
		
	}

}
