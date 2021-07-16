package com.xworkz.listtask.tester;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.listtask.constants.*;
import com.xworkz.listtask.main.*;
public class AlcoholDtoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlcoholDTO dto1 = new AlcoholDTO( "Kingfisher" , 2.5f , AlcoholType.BEER , 900);
		AlcoholDTO dto2 = new AlcoholDTO( "McDowells" , 1.5f , AlcoholType.WHISKY , 1900);
		AlcoholDTO dto3 = new AlcoholDTO( "Old Monk " , 1.0f , AlcoholType.RUM , 1900);
		AlcoholDTO dto4 = new AlcoholDTO( "Absolut " , 2.0f , AlcoholType.VODKA , 800);
		AlcoholDTO dto5 = new AlcoholDTO( "Magson's Hymart" , 1.5f , AlcoholType.FENI , 450);
		
		List<AlcoholDTO> list = new ArrayList<>();
		
		list.add(dto5);
		list.add(dto4);
		list.add(dto3);
		list.add(dto2);
		list.add(dto1);
		
		
		
		for (AlcoholDTO alcohol : list) {
			System.out.println(alcohol);
		}
		Collections.sort(list);
		for (AlcoholDTO alco : list) {
			System.out.println(alco);
		}
	}
	

}
