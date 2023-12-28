package org.anudip.collectionFrameworkList.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Q1_TraverseArrayList {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//declaring the variable 
		List<Integer> arrList =  new ArrayList<Integer>();
		
		System.out.print("Enter the range the array list:");
		int range = scanner.nextInt();
		
		// inserting element
		for(int i=0; i<range; i++) {
			System.out.print("Enter the value : ");
			arrList.add(scanner.nextInt());
		}
		
		//iterating the list
		Iterator<Integer> itr = arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
