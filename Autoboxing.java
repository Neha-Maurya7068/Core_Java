package wrapper_class;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

	public static void main(String[] args) {

		/*
		 * primitive -> non-primitive
		 * 
		 * byte -> Byte short -> Short int -> Integer long -> Long
		 * 
		 * float -> Float double -> Double
		 * 
		 * boolean -> Boolean
		 * 
		 * char -> Character
		 * 
		 */

//		List<Integer> list = new ArrayList<>();
//		
//		list.add(10);
//		list.add(20);
//		
//		System.out.println(list);

//		List<Integer> l1 = new ArrayList<>();
//		
//		l1.add(20);
//		l1.add(55);
//		l1.add(39);

//		for(int i : l1) {
//			System.out.println(i);
//		}

//		for(int i = 0; i < l1.size(); i++) {
//			System.out.println(l1.get(i));
//		}

		// Primitive To Object => Autoboxing

//		int a = 100;
//		
//		Integer b = a;
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		System.out.println(b.doubleValue());
//		
//		System.out.println(b.intValue());

		// Object -> Primitive => Unboxing

//		Integer a = 100;

//		System.out.println(a.toString());

//		int b = a;
//		
//		System.out.println(b);

//		int b = Integer.valueOf(a);
//		
//		System.out.println(b);

//		Integer a = 100;
//		
//		String b = a.toString();
//		
//		System.out.println(b.length());

		// Primitive to Wrapper

//		int a = 100;
//		Integer b = Integer.valueOf(a);

		// Wrapper To Primitive
//		
//		Integer a = 100;
//		
//		int b = a.intValue();

//		Integer a = 100;
//		Integer b = 100;
//		
//		System.out.println(a == b);  // True

//		Integer a = 200;
//		Integer b = 200;

//		System.out.println(a == b);  // False ( -128 to 127)
//		System.out.println(a.equals(b)); // True
//

//		Integer a = null;
//		
//		int b = a;
//		
//		System.out.println(b);

		// Immutable *********

//		Integer a = 10;
//		a = 20; // Different object

	}

}
