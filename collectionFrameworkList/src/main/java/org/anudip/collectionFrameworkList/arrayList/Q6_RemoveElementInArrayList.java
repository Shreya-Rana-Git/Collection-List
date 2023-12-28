package org.anudip.collectionFrameworkList.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q6_RemoveElementInArrayList {
	
	private static Scanner scanner =  new Scanner(System.in);

	public static void main(String[] args) {
		//declaring the variable 
		List<Integer> arrList =  new ArrayList<Integer>();
		
		//inserting element
		arrList.add(11);
		arrList.add(12);
		arrList.add(13);
		arrList.add(14);
		arrList.add(15);
		arrList.add(16);
		
		
		// before removing element
		System.out.println("Before removing the elemetnt");
		System.out.println(arrList +"\n");
		
		
		//enter the index value
		System.out.print("Enter the index value:");
		int index =  scanner.nextInt();
		
		
		
		//remove the element
		arrList.remove(index);
		
		
		// after removing element
		System.out.println("\n"+"After removing the elemetnt");
		System.out.println(arrList);
	}

}
