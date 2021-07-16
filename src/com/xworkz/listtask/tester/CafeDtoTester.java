package com.xworkz.listtask.tester;
import com.xworkz.listtask.main.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CafeDtoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CafeDTO cafe1 =  new CafeDTO("Sensation" , "Bhatkal" , "Sizzler" , 5f);
		CafeDTO cafe2 =  new CafeDTO("ColCafe" , "Bhatkal" , "Burger" , 4.5f );
		CafeDTO cafe3 =  new CafeDTO("Sensation" , "Bhatkal" , "Sizzler" , 4f);
		CafeDTO cafe4 =  new CafeDTO("Bake&Shake" , "Bhatkal" , "FreakShake" , 5f);
		CafeDTO cafe5 =  new CafeDTO("Splash" , "Bhatkal" , "Chicken Sandwich" , 3.5f);
		
		
		List<CafeDTO> list = new ArrayList<CafeDTO>();
		list.add(cafe1);
		list.add(cafe2);
		list.add(cafe3);
		list.add(cafe4);
		list.add(cafe5);
		

		for (CafeDTO refCafe : list) {
			System.out.println(refCafe);
		}
		
		Collections.sort(list);
		
		for( CafeDTO refSort :list) {
			System.out.println(refSort);
		}
		
		
	}
	

}
