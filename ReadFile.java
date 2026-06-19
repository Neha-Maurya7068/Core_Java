package file_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		try {
			FileReader fr = new FileReader("E:\\Deepanshu\\MyFolder\\Deep.txt");

			int i;

			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("Failed To Read The File !!");
		}

	}

}
