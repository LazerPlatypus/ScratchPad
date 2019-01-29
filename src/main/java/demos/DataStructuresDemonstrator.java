package demos;

import java.util.ArrayList;

public class DataStructuresDemonstrator {

	public static void run() {
//		int[] nums = new int[1000001];
//		int x = nums[0];
//		int y = nums[1000000];
		demoArrayLists();
	}
/*
* | ArrayLists don't need a size defined
* | They can only work with reference types
* | You don't need the Second angle irons to have the type
* |
*/

	public static void demoArrayLists() {
//		Declare AND initialize an ArrayList that holds Integers
		ArrayList<Integer> numsList = new ArrayList<>();
	
//		Get and print the size of the list
		System.out.println(numsList.size());
		
//		Add ints to the list
		numsList.add(13579);
		numsList.add(24);
		numsList.add(42);
		numsList.add(6);
		numsList.add(-4);
		numsList.add(18);
		numsList.add(6);
		numsList.add(6);
		
//		remove the third int
//		numsList.set(2, null);
		numsList.remove(2);
		
//		Get and print the new size of the list
		System.out.println(numsList);
		System.out.println(numsList.size());
		System.out.println(numsList.get(0));
		System.out.println(numsList.get(1));
		System.out.println(numsList.get(numsList.size()-1));
		
//		Print out every element in the list
		System.out.println(numsList);
//		print the sum total of those elements
		int total = 0;
		for (Integer num : numsList) {
			total += num;
		}
		System.out.println(total);
	}
	
}

