package file_handling;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		File f1 = new File("E:\\Deepanshu\\MyFolder");
		
		
		if(f1.mkdir()) {
			System.out.println("Folder Created !!");
		}
		else {
			System.out.println("Folder Already Present !!");
		}
		
	}
}
