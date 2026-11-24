package com.kodewala.collection;


import java.lang.reflect.Array;
import java.util.*;
import java.util.Iterator;

public class Driver10 {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr1=new ArrayList<>();
		
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		arr1.add(50);
		
		
		//System.out.println(arr1.subList(1,4));
		
		//arr1.toArray();
		//System.out.println(arr1);
		
		
		//Iterator<String> itr = arr1.iterator();
		
		//while(itr.hasNext()==true) {
		//	System.out.println(itr.next());
		//}
		
		//foreach
		//ListIterator<String> litr= arr1.listIterator();
		
		arr1.forEach(num->{
			System.out.println(num*2);
			});
		
		
		// need to be studied System.out.println(arr1.iterator());	
		
		//foreach
		//arr11.forEach(null);
		//spliterator
		//listiterator
		//stream
		//parallelstream
		//removerange
	}

}
