package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TakeImagePath {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Image Path Here ... ");
		String path = sc.nextLine();

		FileInputStream fis = new FileInputStream(path);

		FileOutputStream fos = new FileOutputStream("E:\\Deepanshu\\MyFolder\\CopyImageViaPath.jpg");

		int data;

		while ((data = fis.read()) != -1) {
			fos.write(data);
		}

		fis.close();
		fos.close();
		sc.close();

		System.out.println("Saved Image Sucessfull !!");
	}

}
