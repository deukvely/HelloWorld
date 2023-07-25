package co.yedam.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteExe {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/Temp/temp1.db");
		
		InputStream is = new FileInputStream("c:/Temp/temp1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
		
		while (true) {
			int date = is.read();
			if (date == -1) {
				break;
			}
			System.out.println(date);
		}
		is.close();
		
		System.out.println("end of prog.");
		
		
	}
}
