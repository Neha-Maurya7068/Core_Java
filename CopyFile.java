package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws FileNotFoundException {

//		FileInputStream fis = new FileInputStream("E:\\Deepanshu\\MyFolder\\Deepanshu.jpg");
//		FileOutputStream fos = new FileOutputStream("E:\\Deepanshu\\MyFolder\\CopyFile.jpg");

		FileInputStream fis = new FileInputStream("E:\\Deepanshu\\MyFolder\\Apple.jpg");
		FileOutputStream fos = new FileOutputStream("E:\\Deepanshu\\MyFolder\\CopyApple.jpg");

		int i;
		try {
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}

			fis.close();
			fos.close();

//			System.out.println("Copy File Successfully !!");
			System.out.println("Copy Image Sucessfully !!");
		} catch (IOException e) {
			System.out.println("Failed To Copy !!");
		}

	}

}
