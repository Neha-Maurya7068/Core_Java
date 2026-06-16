package file_handling;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("E:\\Deepanshu\\MyFolder\\Deep.txt");

		try {
			BufferedReader br = new BufferedReader(fr);
			String line;

			while ((line = br.readLine()) != null) {
				System.out.print(line);
			}
			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("Failed To Read The File !!");
		}

	}

}
