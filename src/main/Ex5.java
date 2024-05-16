package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("input3.txt");
			
			byte[] arr = new byte[10];
			
			int size;
			
			while (true) {
				
				size = fis.read(arr);
				
				if (size == -1) {
					break;
				}
				// .read로 불러올 때 이전 데이터가 남아 있으므로 문자열의 크기를 담을 변수를 선언해서
				// 그 값으로 i < size 조건식을 세워줘야함
				for (int i = 0; i < size; i++) {
					System.out.print((char) arr[i]);
				}
				System.out.println(": " + size + "바이트 읽음");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
