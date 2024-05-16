package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) {

		try {
			// 입력 스트림 생성  input2는 한글이라 1바이트 크기로 가져오면 깨짐 예:ìë
			FileInputStream fis = new FileInputStream("input2.txt");
			// 반복문을 사용해서 파일 내용 끝까지 읽기
			while (true) {
				int i = fis.read(); // 1바이트씩 읽기
				// 문서안에 내용 끝으로 가면 -1을 반환하기 때문에 i == -1 때 break
				if (i == -1) { // 파일의 끝에 도달하면 -1을 반환
					break;
				}
				// 문자를 변환하여 출력
				System.out.println((char) i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
