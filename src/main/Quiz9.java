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
		
		ListFile(filedir);
		
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

	// 재귀함수 
    private static void ListFile( String strDirPath ) { 
         
        File path = new File( strDirPath ); 
        File[] fList = path.listFiles(); 
         
        for( int i = 0; i < fList.length; i++ ) { 
             
            if( fList[i].isFile() ) { 
                System.out.println( fList[i].getPath() );  
            } 
            else if( fList[i].isDirectory() ) { 
                ListFile( fList[i].getPath() );  
            } 
        } 
    } 
}
