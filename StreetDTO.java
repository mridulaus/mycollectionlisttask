package com.xworkz.listtask.main;

import java.io.Serializable;
import java.util.*;


public class StreetDTO  implements Serializable{
	private String name;
	private int pincode;
	private String landMark;
	private boolean ambience;
	private String city;
	
	public StreetDTO() {
		System.out.println("invoking default constructor");
	}
	public StreetDTO(String name, int pincode, String landMark, boolean ambience, String city) {
		System.out.println("invoking parameter constructor");
		this.name = name;
		this.pincode = pincode;
		this.landMark = landMark;
		this.ambience = ambience;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public boolean isAmbience() {
		return ambience;
	}
	public void setAmbience(boolean ambience) {
		this.ambience = ambience;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "StreetDTO [name=" + name + ", pincode=" + pincode + ", landMark=" + landMark + ", ambience=" + ambience
				+ ", city=" + city + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
	
		if (obj == null) {
			return false;
		}
		if( obj instanceof StreetDTO ) {
			StreetDTO ref = (StreetDTO) obj;
			if( this.pincode == ref.getPincode() &&  this.city.equals(ref.getCity())   ) {
				
				System.out.println("StreetDTO is not equal " );
				return true;
			}
			
		else {
			System.out.println("StreetDTO is not equal " );
			return false;
		}
		}
		
		return true;
	}
	
	
	
	


}
