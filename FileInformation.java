package file_handling;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {

		File f1 = new File("E:\\Deepanshu\\MyFolder\\Deep.txt");

		if (f1.exists()) {

			System.out.println("File Present !!");

//			System.out.println("Length : "+f1.length());
//			System.out.println("Path : "+f1.getAbsolutePath());
//			System.out.println("File Name : "+f1.getName());
//			System.out.println("Parent File : "+f1.getParent());
//			System.out.println("Path : "+f1.getPath());
//			System.out.println("Can Write : "+f1.canWrite());
//			System.out.println("Can Read : "+f1.canRead());
//			System.out.println("Can Execute : "+f1.canExecute());
//			System.out.println("Total Space "+f1.getTotalSpace());
//			System.out.println("Is A File : "+f1.isFile());
//			System.out.println("Is A Folder : " + f1.isDirectory());

		} else {
			System.out.println("File Not Found !!");
		}

	}

}
