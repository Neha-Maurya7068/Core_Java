package file_handling;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {

		File old_name = new File("E:\\Deepanshu\\MyFolder\\Deep.txt");
		File new_name = new File("E:\\Deepanshu\\MyFolder\\Deepanshu.txt");

		if (old_name.renameTo(new_name)) {
			System.out.println("Re-Named Sucessfully !!");
		} else {
			System.out.println("Failed To Re-Name !!");
		}

	}

}
