package com.xworkz.listtask.main;
import com.xworkz.listtask.constants.*;
import java.io.Serializable;

public class AlcoholDTO implements Serializable, Comparable<AlcoholDTO> {
	private String brand;
	private float quantity;
	private AlcoholType type;
	private int price;
	

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", quantity=" + quantity + ", type=" + type + ", price=" + price + "]";
	}


	@Override
	public int compareTo(AlcoholDTO ref) {
		String refOther  = ref.getBrand();
				if(this.brand.equals(refOther)){
						return 0;
				}
		// TODO Auto-generated method stub
		return 0;
	}


	public AlcoholDTO(String brand, float quantity, AlcoholType type, int price) {
		
		this.brand = brand;
		this.quantity = quantity;
		this.type = type;
		this.price = price;
	}


	public AlcoholDTO() {
		
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public float getQuantity() {
		return quantity;
	}


	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}


	public AlcoholType getType() {
		return type;
	}


	public void setType(AlcoholType type) {
		this.type = type;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
