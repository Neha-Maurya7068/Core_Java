package file_handling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageByBuffer {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("E:\\Deepanshu\\MyFolder\\Apple.jpg");
		FileOutputStream fos = new FileOutputStream("E:\\Deepanshu\\MyFolder\\CopyAppleabc.jpg");

		BufferedInputStream bis = new BufferedInputStream(fis);

		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int data;

		while ((data = bis.read()) != -1) {
			bos.write(data);
		}

		bis.close();
		bos.close();

		System.out.println("Copy Image Via Buffered !!");
	}

}
