package file_handling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {

		File f1 = new File("E:\\Deepanshu\\Textfile.txt");

		if (f1.delete()) {
			System.out.println("File Deleted !!");
		} else {
			System.out.println("File Not Found !!");
		}

	}

}
