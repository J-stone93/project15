package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz7 {

	public static void main(String[] args) {

		try {
			// FileOutputStream을 이용해 파일에 프로그래밍 출력하기
			
			// 바이트 스트림 생성
			FileOutputStream fos = new FileOutputStream("quiz7.txt");
			// 보조 스트림 생성
			OutputStreamWriter ows = new OutputStreamWriter(fos);
			
			ows.write("프로그래밍");
			
			ows.write("\n");
			
			ows.write("프");			
			ows.write("로");
			ows.write("그");
			ows.write("래");
			ows.write("밍");
			
			// OutputStreamWriter도 버퍼를 사용함
			// 버퍼를 비워야 내용이 한번에 출력됨
			ows.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
