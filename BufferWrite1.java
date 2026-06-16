package file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("E:\\Deepanshu\\MyFolder\\Deep.txt", true);

		BufferedWriter bw = new BufferedWriter(fw);

		try {

//			bw.write("Hello Good Morning !!");
			bw.newLine();
			bw.write("I am Deepanshu Rana ... ");

			System.out.println("Writting Sucessfull !!");

			bw.close();
			fw.close();

		} catch (IOException e) {
			System.out.println("Writing Failed !!");

		}

	}

}
