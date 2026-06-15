package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("E:\\Deepanshu\\MyFolder\\Apple.jpg");

		int data;

		while ((data = fis.read()) != -1) {
//			System.out.print(data);
			System.out.print((char) data);
		}
		fis.close();
	}
}
