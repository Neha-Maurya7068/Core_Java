package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public static void main(String[] args) {

//		FileWriter fw;
//		try {
//			fw = new FileWriter("E:\\Deepanshu\\MyFolder\\Deep.txt");
//
//			fw.write("This Is Writing Inside File From Our Java Code !!");
//
//			System.out.println("Writting Sucessfull !!");
//
//			fw.close();
//
//		} catch (IOException e) {
//			System.out.println("Writing Failed !!");
//
//		}

		
//		For Appending New Text Without Changing The Previous Lines ...
		
		FileWriter fw;
		try {
			fw = new FileWriter("E:\\Deepanshu\\MyFolder\\Deep.txt", true);

			fw.write(" My Name Is Deepanshu Rana \n I am a Java Developer !!");

			System.out.println("Writting Sucessfull !!");

			fw.close();

		} catch (IOException e) {
			System.out.println("Writing Failed !!");

		}

	}

}
