package list;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArryListCapacity {

//	public static void main(String[] args) throws Exception {

//		ArrayList<Integer> list = new ArrayList<>();
//
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(3);

//		System.out.println(list.size());

//		ArrayList<Integer> list2 = new ArrayList<>();
//
//		list2.add(10);
//		list2.add(20);
//		list2.add(30);
//		list2.add(40);

//		list.addAll(list2);

//		list.addAll(2, list2);

//		list.clear();

//		System.out.println(list.contains(1));

//		System.out.println(list.containsAll(list2));

//		System.out.println(list.get(2));

//		list.add(2, 70);

//		list.set(2, 70);

//		System.out.println(list.isEmpty());

//		System.out.println(list.indexOf(3));
//		
//		System.out.println(list.lastIndexOf(3));

//		Object[] l1 = list.toArray();
//		
//		System.out.println(l1.length);

//		l1.add(90); // ❌

//		System.out.println(l1);

// *************************************************************************************
	// ArrayList Capacity *****

	public static void main(String[] args) throws Exception {

		// ArrayList Capacity *****

		ArrayList<Integer> list = new ArrayList<>(12);

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		list.add(11);
		list.add(12);
		list.add(13);

		System.out.println(list);
		// System.out.println(list.size());

		Field field = ArrayList.class.getDeclaredField("elementData");

		field.setAccessible(true);

		Object[] elementData = (Object[]) field.get(list);
		System.out.println("ArrayList Capacity : " + elementData.length);

		list.remove(3);
		list.remove(4);
		list.remove(5);
		list.remove(6);
		list.remove(5);
		list.remove(4);
		list.remove(3);

		System.out.println(list);
		elementData = (Object[]) field.get(list);
		System.out.println("ArrayList Capacity After Remove : " + elementData.length);

		list.trimToSize();
		elementData = (Object[]) field.get(list);
		System.out.println("ArrayList Capacity After Trim To Size : " + elementData.length);

	}

}
