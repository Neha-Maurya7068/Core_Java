package iteratorclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionClass1 {

	public static void main(String[] args) {

//		List<Integer> l1 = new ArrayList<>();
//
//		l1.add(10);
//		l1.add(20);
//		l1.add(30);
//		l1.add(40);
//		l1.add(50);

//		System.out.println(l1);

		// For Each ***********

//		for(Integer i : l1) {
//			System.out.println(i);
//		}

//		 Iterable *****

//		List<String> str1 = Arrays.asList("Apple", "Orange", "Banana", "Kiwi", "Papaya", "PineApple");
//
//		Iterator<String> it = str1.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		// 1, 2, 3, 4, 5, 6, 7, 8, 9 -> 2, 4, 6, 8

//		List<Integer> l1 = new ArrayList<>();
//
//		l1.add(1);
//		l1.add(2);
//		l1.add(3);
//		l1.add(4);
//		l1.add(5);
//		l1.add(6);
//		l1.add(7);
//		l1.add(8);
//		l1.add(9);
//		
//		for(Integer i : l1) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

		// Using Iterator ********

//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//
//		Iterator<Integer> itr = list.iterator();
//
//		while (itr.hasNext()) {
//			int i = itr.next();
//			if(i % 2 == 0) {
//			System.out.println(i);
//			}
//		}

//		Collection ************

		Collection<String> c1 = new ArrayList<>();

		c1.add("Ram");
		c1.add("Radha");
		c1.add("Mohan");
		c1.add("Gita");
		c1.add("Sita");
		c1.add("Rahul");

		c1.add("Akansha");
		c1.add("Neha");

//		System.out.println(c1.isEmpty());
//		
//		System.out.println(c1);
//		
//		System.out.println(c1.size());

//		System.out.println(c1.contains("Aman"));
//		System.out.println(c1.contains("Rahul"));

//		Iterator<String> it = c1.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

//		Object[] arr = c1.toArray();

//		System.out.println(arr);

//		System.out.println(arr.length);

//		for (Object str : arr) {
//			System.out.println(str);
//		}

//		c1.add("Amar");
//		
//		System.out.println(c1);

		Collection<String> c2 = new ArrayList<>();

		c2.add("Akansha");
		c2.add("Neha");
		c2.add("Deepanshu");
		c2.add("Khushboo");
		c2.add("Radha");

//		System.out.println(c2);

//		c1.addAll(c2);

//		System.out.println("Before Remove : " + c1);

//		c1.remove("Mohan");

//		c1.removeAll(c2);
//
//		System.out.println("After Remove : " + c1);

//		System.out.println("Before Retain : "+c1);
//		
//		c1.retainAll(c2);
//		
//		System.out.println("After Retain : "+c1);

//		System.out.println("Before Clear : "+c1);
//		
//		c1.clear();
//		
//		System.out.println("After Clear : "+c1);

//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c1.containsAll(c2));

//		List<Integer> l1 = new ArrayList<>();
//
//		l1.add(6);
//		l1.add(7);
//		l1.add(8);
//		l1.add(4);
//		l1.add(5);
//		l1.add(9);
//		l1.add(1);
//		l1.add(2);
//		l1.add(3);
//		
//		System.out.println(l1);
//		
//		Collections.sort(l1);
//	
//		System.out.println("After Sort : "+l1);

		List<Integer> l1 = new ArrayList<>();

		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);

//		for(Integer i : l1) {
//			if(i % 2 == 0)
//				i.remove();
//		}
//		
//		System.out.println(l1);

		// Iterator *******

		Iterator<Integer> it = l1.iterator();

		while (it.hasNext()) {
			int n = it.next();
			if (n % 2 != 0) {
				it.remove();
			}
		}
		System.out.println(l1);

	}

}
