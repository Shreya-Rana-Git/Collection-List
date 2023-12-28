package org.anudip.collectionFrameworkList.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q5_SortTheArrayListInDescendingOrder {

	public static void main(String[] args) {
		//declaring the variable 
		List<Integer> arrList =  new ArrayList<Integer>();
		
		//inserting element
		arrList.add(12);
		arrList.add(11);
		arrList.add(13);
		arrList.add(15);
		arrList.add(14);
		arrList.add(16);
		
		// before sorting
		System.out.println("Before sorting");
		System.out.println(arrList);
		
		//sort the list
		Collections.sort(arrList);
		Collections.reverse(arrList);
		
		//after sorting 
		System.out.println("After sorting");
		System.out.println(arrList);
	}

}
