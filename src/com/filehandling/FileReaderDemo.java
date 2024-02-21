package com.filehandling;



import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {

		FileReader fileReader;
		try {
			fileReader = new FileReader("Sample.txt");
			System.out.println(fileReader.read());
			
			int i = 0;
			while ((i = fileReader.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
