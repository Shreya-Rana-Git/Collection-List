package org.anudip.collectionFrameworkList.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Q2_LengthOfArrayList {

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
		
		//print the size 
		System.out.println(arrList.size());
	}

}
