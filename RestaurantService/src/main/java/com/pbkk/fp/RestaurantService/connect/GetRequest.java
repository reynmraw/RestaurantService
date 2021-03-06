package com.pbkk.fp.RestaurantService.connect;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mysql.cj.xdevapi.JsonArray;

public class GetRequest {
	public static void main(String[] args) {
		 try {
		   String access_token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOjIsInVzZXJfdHlwZSI6InVzZXIiLCJ1c2VyX25hbWUiOiJjdXN0b21lciIsInNjb3BlIjpbInJlYWRfcmVzdGF1cmFudCJdLCJleHAiOjE1NTg0NzIzODcsImF1dGhvcml0aWVzIjpbIlVzZXIiXSwianRpIjoiMGFkNTgzYzQtNmRkNS00MmY0LWExYWItMzAyMzA4MzU2Y2FhIiwiY2xpZW50X2lkIjoicmVzdGF1cmFudCJ9.B9T2-cgSWqdAkIfak57ne23WfpuhxkhzXDHff_zEdZw";
		   String url = "https://rendoru.com/kuliah/pbkk/restaurants";
		   URL obj = new URL(url);
		   HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		   // optional default is GET
		   con.setRequestMethod("GET");
		   con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:27.0) Gecko/20100101 Firefox/27.0.2 Waterfox/27.0");
		   con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		   con.setRequestProperty("Authorization", "Bearer "+ access_token);
		   int responseCode = con.getResponseCode();
		   System.out.println("\nSending 'GET' request to URL : " + url);
		   System.out.println("Response Code : " + responseCode);
		   BufferedReader in = new BufferedReader(
		   new InputStreamReader(con.getInputStream()));
		   String inputLine;
		   StringBuffer response = new StringBuffer();
		   while ((inputLine = in.readLine()) != null) {
			   //int i = inputLine.indexOf("{");
			   //int o = inputLine.indexOf("}");
			   response.append(inputLine);
		   }
		   in.close();
		   //print result
		   System.out.println(response.toString());
		   
		   /*try {
			   String inputLine;
			   StringBuffer response = new StringBuffer();
			   while ((inputLine = in.readLine()) != null) {
				   int i = inputLine.indexOf("{");
				   response.append(inputLine.substring(i));
			   }
			   in.close();
			   //print result
			   System.out.println(response.toString());
			   //response = response.substring(i);
			   JSONObject obj_JSONObject = new JSONObject(response.toString());
			   JSONObject obj_JsonObject2 = (JSONObject)obj_JsonObject2.get("id");
			   //JSONArray obj_JSONArray = obj_JSONObject.getJSONArray("id");
			   //System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		   
		   //List listID = new ArrayList();
		   Map<Integer, String> mapResto = new HashMap<>();
			
			  JSONArray jsonArray = new JSONArray(response.toString()); 
			  for (int i = 0; i < jsonArray.length(); i++) { 
				  if (jsonArray.get(i) instanceof JSONObject) {
					  JSONObject jsonObj = (JSONObject)jsonArray.get(i);
					  Integer idresto = (Integer)jsonObj.get("id");
					  String namaresto = (String)jsonObj.get("nama");
					  //listID.add(idresto);
					  mapResto.put(idresto, namaresto);
					  //System.out.println(idresto);
					  //System.out.println(namaresto); 
					  } 
				  }
			  System.out.println(Arrays.asList(mapResto));
			 
	   
	   /*JSONObject jsonObj = new JSONObject(response.toString());
	   System.out.println(jsonObj.getString("id\n"));
	   System.out.println(jsonObj.getString("name\n"));*/
	   } catch (Exception e) {
	    System.out.println(e);
		  }
	}
}
