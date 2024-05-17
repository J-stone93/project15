package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {

	public static void main(String[] args) {

		try {
			// 기반 스트림 생성
			FileInputStream fis = new FileInputStream("reader.txt");
			
			while (true) {
				int i = fis.read(); // 1바이트씩 읽기
				if (i == -1) {
					break;
				}
				System.out.print(i + " ");
			}
			System.out.println();
			
			// 보조 스트림 생성
			FileInputStream fis1 = new FileInputStream("reader.txt");
			InputStreamReader isr1 = new InputStreamReader(fis1);
			
			while (true) {
				int i = isr1.read();
				if (i == -1) {
					break;
				}
				System.out.print(i + " ");
			}
			System.out.println();
			
			// 보조 스트림 생성 한글 문자로 출력하기
			FileInputStream fis2 = new FileInputStream("reader.txt");
			InputStreamReader isr2 = new InputStreamReader(fis2);
			
			while (true) {
				int i = isr2.read();
				if (i == -1) {
					break;
				}
				System.out.print((char) i + " ");
			}
			System.out.println();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
