package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		
		// 그냥 기반 스트림으로 파일 복사하기
		
		// 시간 측정
		long start = 0; // 시작 시간
		long end = 0; // 끝난 시간
		
		try {
			// 입력 스트림 생성
			FileInputStream fis = new FileInputStream("a.txt");
			
			// 출력 스트림 생성
			FileOutputStream fos = new FileOutputStream("copy.txt");
			
			// 복사를 시작하는 시간 저장
			start = System.currentTimeMillis();
			
			// 한 문자씩 읽어서 복사하는 중
			while (true) {
				int i = fis.read();
				if (i == -1) {
					break;
				}
				fos.write(i);
			}
			// 복사가 끝나는 시간 저장
			end = System.currentTimeMillis();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		System.out.println("파일 복사하는데 " + (end - start) + "milliseconds 소요되었습니다.");
	}

}
