package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {

//		System.out.println("E:\\Deepanshu");

		File f1 = new File("E:\\Deepanshu\\MyFolder\\Deep.txt");

		if (f1.createNewFile()) {
			System.out.println("File Created Sucessfully !!");
		} else {
			System.out.println("File Already Found !!");
		}
	}

}
