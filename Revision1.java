package revision;

import java.util.Scanner;

public class Revision1 {

	public static void main(String[] args) {

//		System.out.println("Ram");

		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter a Number : ");

//		int n = sc.nextInt();

// 		System.out.println("You Have Enterd : "+n);

//		int[] arr = { 10, 20, 30, 40, 50 };

//		System.out.println(arr[0]);

//		System.out.println(arr[4]);

//		System.out.println(arr.length);

//		String name = "Arjun";
//		
//		System.out.println(name.length());

//		int[] arr = { 1, 2, 3, 4, 5 };

//		for(int i = 0; i < arr.length; i++) { 
//			System.out.println(arr[i]);
//		}

//		int sum = 0;
//		int product = 1;

//		for(int i = 0; i < arr.length; i++) { 
//			sum = sum + arr[i];
//			product *= arr[i];
//		}
//		System.out.println(sum);

//		System.out.println(product);

//		int[] arr = { 11, 2, 3, 44, 5 };

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				System.out.println("Even Number : " + arr[i]);
//			} else {
//				System.out.println("Odd Number : " + arr[i]);
//			}
//		}

		// Linear Search ***************

//		int[] arr = { 11, 2, 3, 44, 5 };
//		
//		int max = arr[0];
//		int index = 0;
//		
//		for(int i = 0; i <= arr.length - 1; i++) {
//			
//			if(arr[i] > max) {
//				max = arr[i];
//				index = i;
//			}
//		
//		}
//		System.out.println("Found At Index : "+index);
//		System.out.println("Maximum Element Is : "+max);

//		int[] arr = new int[5];

//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;

//		System.out.println(arr);

//		System.out.println(arr.length);

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		System.out.println("Enter Length Of Array :");

		int len = sc.nextInt();

		int[] arr = new int[len];

		for (int i = 0; i < len; i++) {
			System.out.println("Enter Index : " + i + " Value");
			arr[i] = sc.nextInt();
		}

		System.out.println("Input Complete !!");

		System.out.println("Output :- !!");

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
