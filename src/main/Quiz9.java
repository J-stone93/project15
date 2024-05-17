package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz9 {

	public static void main(String[] args) {

		// 다운로드 폴더에 있는 파일의 목록을 읽어서 텍스트 파일에 출력하세요
		// 만약 하위 폴더가 있다면 하위폴더의 파일목록도 출력하세요.
		
		String filedir = "C:\\Users\\G201\\Downloads";
		
		ListFiles(filedir);
		
//		try {
//			FileWriter fw = new FileWriter("quiz9.txt");
//			OutputStreamWriter osw = new OutputStreamWriter(fw);
//			
//			fw.write(filedir);
//			
//			fw.flush();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	public static void ListFiles(String filedir) {

		File dir = new File(filedir);

		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile()) {
				System.out.println(files[i].getName());
			} else if (files[i].isDirectory()) {
				ListFiles(files[i].getName()); 
			}

		}

	}
}
