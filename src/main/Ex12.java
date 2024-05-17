package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		
		// 보조 스트림을 사용해서 파일 복사하기
		
		long start = 0; // 시작 시간
		long end = 0; // 끝난 시간

		try {
			// 입출력 스트림 생성
			FileInputStream fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("copy2.txt");
			
			// 버퍼링 보조 스트림 생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// 복사 시간 측정하기
			start = System.currentTimeMillis();
			
			// 8kb를 한꺼번에 읽어서 복사하는 중
			while (true) {
				int i = bis.read();
				if (i == -1) {
					break;
				}
				bos.write(i);
			}
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





