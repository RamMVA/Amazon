package com.amazon.TestScripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banknumber {

	public static void main(String[] args) {

		List<String> ATM_cards=new ArrayList<>();

		ATM_cards.add("7042984233332222");
		ATM_cards.add("7042");
		ATM_cards.add("");
		ATM_cards.add("");
		System.out.println("Enter Your Card No:"); 
		Scanner scan = new Scanner(System.in);
		String name="";

		name+=scan.nextLine();

		if(name.contains("7042")) {

		}
		else if(name.contains("70429042")){

		}
		else if(name.contains("70429042")){

		}
		else if(name.contains("7042904233334444")){

		}
		else if(name.contains("7042904233334444")){

		}
		System.out.println("Your bank is :"+name); 


		scan.close();
	}

}
