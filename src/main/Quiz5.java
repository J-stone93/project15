package main;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz5 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("quiz5.txt");
			
			for (int i = 1; i <= 10; i++) {
				
				if (i % 2 == 0) {
					
//					fw.write(i); // 숫자로 인식 -> 코드체계에 따라 문자로 변환
					
					fw.write(i + " "); // 문자로 인식
				}				
			}
			fw.flush(); // 플러쉬는 반복문 작업이 끝나고 넣어주는게 좋음
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
