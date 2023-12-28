package org.anudip.collectionFrameworkList.arrayList;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Q3_CheckingElementInArrayList {

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
		
		//insert the key to search
		System.out.print("Enter the key to search:");
		int key = scanner.nextInt();
		
		//check the element is present or not
		/*Iterator<Integer> itr = arrList.iterator();
		boolean flag = false;
		int element =0;
		while(itr.hasNext()) {
			element = itr.next();
			
			if(element==key) {
				flag = true;
				break;
			}
			else {
				flag=false;
			}
		}
		
		if(flag == true) {
			System.out.println(element+" is present at "+arrList.indexOf(element));
		}else {
			System.out.println("Not Found");
		}
		*/
		
		if(arrList.contains(key)) {
			System.out.print(key+" is present at "+arrList.indexOf(key));
		}else {
			System.out.print("Not Found");
		}
	}

}
