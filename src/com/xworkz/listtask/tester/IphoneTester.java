package com.xworkz.listtask.tester;
import java.util.*;
public class IphoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		List<String> collection=new ArrayList<>();  
		        
		        collection.add("Iphone11");  
		        collection.add("iphoneXR");  
		        collection.add("iphone12pro"); 
		        
		        List<String> collection1=new ArrayList<>();  
		        collection1.add("iphone12pro");  
		        collection1.add("Iphone11");  
		        collection1.add("iphoneXR");  
		        
		         if(collection.containsAll(collection1)) {
		        System.out.println("its same");  
		         }else {
		        	System.out.println("not same "); 
		         }
		   
	}

}
