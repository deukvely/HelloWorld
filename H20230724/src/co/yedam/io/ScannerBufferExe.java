package co.yedam.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 이름/주소/연락처 -> 3건 입력 c:/Temp/address2.txt 저장
public class ScannerBufferExe {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("c:/Temp/address2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner scn = new Scanner(System.in);
		while (true){

			System.out.println("이름 주소 연락처");
			String str = scn.nextLine();
			System.out.println("\n");
			if(str.equals("-1")) 
				break;
			bw.write(str);
				
		}
		bw.flush();
		bw.close();
		fw.close();
		scn.close();
	}
}
