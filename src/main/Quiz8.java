package main;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz8 {

	public static void main(String[] args) {

		// 다운로드 폴더에 있는 파일의 목록을 읽어서 텍스트 파일에 출력하세요


//		try {
//			// 실제 파일 생성
//			File file = new File("C:\\jang\\newFile.txt"); // 본인 파일 경로
//			file.createNewFile();
//			FileOutputStream fos = new FileOutputStream("C:\\jang\\newFile.txt");
//			OutputStreamWriter osw = new OutputStreamWriter(fos);
//			
//			File dir = new File("C:\\Users\\G201\\Downloads");
//			File[] files = dir.listFiles();
//			
//			for (File f : files) {
//				System.out.println(f.toString());
//				
//				osw.write(f.toString());
//			}
//			osw.flush();
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		File dir = new File("C:\\Users\\G201\\Downloads");
		
		
		File[] files = dir.listFiles();
		
		try {
			FileWriter fw = new FileWriter("quiz8.txt");
			for (int i = 0; i < files.length; i++) {
				File file = files[i];
				String filename = file.getName();
				fw.write(filename + "\n");
			}
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}

}
