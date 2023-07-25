package co.yedam.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharExe {
	public static void main(String[] args) throws Exception {
		FileWriter fr = new FileWriter("c:/Temp/text.txt");
		String path = "C:\\Dev\\workspace\\H20230724\\src\\co\\yedam\\io\\ByteExe.java";
		FileReader ff = new FileReader(path);
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		fr.write(a);
		fr.write(b);
		fr.write(c);
		
		fr.flush();
		fr.close();
		
		while(true) {
			int date = ff.read();
			if(date == -1) {
				break;
			}
			System.out.print((char) date);
		}
		ff.close();
	
		System.out.println("end of prog");
	}
}
