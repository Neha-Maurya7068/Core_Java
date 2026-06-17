package loop;

public class EvenElementOfArray {
	
	public static void main(String[] args) {
		
//		int[] arr = {1,  9, 10, 2, 6, 7, 8, 3, 4, 5 };
		
		// 2 , 4 , 6 , 8 , 10
		
//		for(int i : arr) {
//			if(i % 2 == 0) {
//				System.out.println("Even Number : "+i);
//			}
		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 2 == 0) {
//				System.out.println(arr[i] + " Is Even ...   ");
//			}
//		}
		
		
//		int[] arr = {1,  9, 10, 2, 6, 7, 8, 3, 4, 5 };
//		
//		// 10
//		
//		int max = arr[0];
//				
//		for(int i = 0; i < arr.length; i++) {
//			
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//			
//		}
//		
//		System.out.println("Maximum Value Is : "+max);
		
//		int[] arr = {1,  9, 10, 2, 6, 0, 7, 8, 3, 4, 5 };
//		
//		// 10
//		
//		int min = arr[0];
//				
//		for(int i = 0; i < arr.length; i++) {
//			
//			if(arr[i] < min) {
//				min = arr[i];
//			}
//			
//		}
//		
//		System.out.println("Minimum Value Is : "+min);
		
		// Pattern *****************
		
		int n = 11;
		
		for(int i = 1; i <= n; i++) {
			
			
			
			for(int j = 1; j <= n; j++) {
			
//			System.out.print(i +","+j+"  ");
				
				if(i == 1 || i == n || j == 1 || j == n || i == j || n + 1 == i + j || (n+1)/2 == i  || (n+1)/2 == j) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
