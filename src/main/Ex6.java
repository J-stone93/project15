package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex6 {

	public static void main(String[] args) {
		
		try {
			// 출력 스트림 생성 (파일이 있으면 연결, 없으면 자동으로 생성됨!)
			// 물리적으로 파일이 생성은 되지만 이클립스와 자동 연동이 안되므로 F5새로고침 해줘야함
			FileOutputStream fos = new FileOutputStream("output.txt");
			
			byte a = 65;
			byte b = 66;
			
			fos.write(a); // 65 -> A문자로 변환되어 저장됨
			fos.write(b);
			fos.write('C'); // 문자 그대로 저장됨
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
