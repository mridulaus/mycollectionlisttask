package com.xworkz.listtask.tester;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.xworkz.listtask.main.*;


public class ProductDtoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductDTO dto5 = new ProductDTO("Kinder_Bueno", "Ferrero", 250, 100);
		ProductDTO dto4 = new ProductDTO("kit_kat", "Nesle", 50, 60);
		ProductDTO dto3 = new ProductDTO("Munch", "Nesle", 20, 100);
		ProductDTO dto2 = new ProductDTO("Dairy_milk", "Cadbury", 120, 150);
		ProductDTO dto1 = new ProductDTO("Twix", "Mars", 170, 75);

		List<ProductDTO> list = new ArrayList<>();

		list.add(dto5);
		list.add(dto4);
		list.add(dto3);
		list.add(dto2);
		list.add(dto1);

		for (ProductDTO productDTO : list) {
			System.out.println(productDTO);
		}
		Collections.sort(list);
		for (ProductDTO productDTO : list) {
			System.out.println(productDTO);
		}
	
	}

}
