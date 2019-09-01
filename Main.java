package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String to;
		List<String> toList = new ArrayList<String>();
		GoodMorningMessage gm = new GoodMorningMessage();
		
		try {
			for (int i = 0; i < 4; i++) {
				Scanner sc = new Scanner(System.in);
				to = sc.nextLine();
				toList.add(to);
				System.out.println(gm.getGoodMorningMessage(to));
				System.out.println(toList.toString());
			}
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
