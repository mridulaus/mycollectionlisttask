package com.xworkz.listtask.main;

import java.io.Serializable;

public class CafeDTO  implements Serializable , Comparable<CafeDTO>{
	private String name;
	private String location ;
	private String famousFood;
	private float rating ;
	public CafeDTO(String name, String location, String famousFood, float rating) {
		System.out.println("invoking parameter constructor");
		this.name = name;
		this.location = location;
		this.famousFood = famousFood;
		this.rating = rating;
	}
	public CafeDTO() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFamousFood() {
		return famousFood;
	}
	public void setFamousFood(String famousFood) {
		this.famousFood = famousFood;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "CafeDTO [name=" + name + ", location=" + location + ", famousFood=" + famousFood + ", rating=" + rating
				+ "]";
	}
	
	
	@Override
	public int compareTo(CafeDTO ref) {
		// TODO Auto-generated method stub
		     String  otherRef  = ref.getName();
		 int sorted = this.name.compareTo(otherRef );
		 System.out.println( sorted);
		return sorted;
	}
	
	
	

}
