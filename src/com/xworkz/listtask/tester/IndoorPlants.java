package com.xworkz.listtask.tester;

import java.util.*;

public class IndoorPlants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> plants = new ArrayList<String>();

		plants.add("Peace Lily"); // use add() method to add values
		plants.add("Lucky bamboo");
		plants.add("Ferns");
		plants.add("MoneyPlant");

		List<String> plants2 = new ArrayList<String>();

		plants2.add(" Areca palm"); // use add() method to add values
		plants2.add("Ferns");
		plants2.add("MoneyPlant");

		System.out.println("First List :" + plants);
		System.out.println("Second List :" + plants2);

		plants2.retainAll(plants);

		System.out.println("After applying the retain method, First List :" + plants);
		System.out.println("After applying the retain  method, Second List :" + plants2);

	}

}
