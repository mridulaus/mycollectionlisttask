package com.xworkz.listtask.tester;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.xworkz.listtask.main.*;

public class PersonDtoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonDTO dto1 = new PersonDTO("Mradula", 23, "mradulashetty@gmail.com");
		PersonDTO dto2 = new PersonDTO("Darshan", 24, "darshanlp@gmail.com");
		PersonDTO dto3 = new PersonDTO("Rosita", 25, "rositadsouza96@gmail.com");
		PersonDTO dto4 = new PersonDTO("Mac", 26, "macdsouza95@gmail.com");
		PersonDTO dto5 = new PersonDTO("Nihal", 27, "nihalsn97@gmail.com");
		List<PersonDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto3);
		list.add(dto2);
		list.add(dto4);
		list.add(dto5);
		
		for (PersonDTO personDTO : list) {
			System.out.println(  "details   "  +personDTO);
		}

		Collections.sort(list);
		for (PersonDTO personDTO : list) {
			System.out.println( "sorted  " +personDTO);
		}
	}

}
