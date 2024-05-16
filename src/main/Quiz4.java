package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz4 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("quiz4.txt");
			
//			fos.write('A');
//			fos.write('B');
//			fos.write('C');
//			fos.write('D');
//			fos.write('E');
//			fos.write('F');
//			fos.write('G');
//			fos.write('H');
//			fos.write('I');
//			fos.write('J');
//			fos.write('K');
//			fos.write('L');
//			fos.write('M');
//			fos.write('N');
//			fos.write('O');
//			fos.write('Q');
//			fos.write('R');
//			fos.write('S');
//			fos.write('T');
//			fos.write('U');
//			fos.write('V');
//			fos.write('W');
//			fos.write('X');
//			fos.write('Y');
//			fos.write('Z');
			
			for (int i = 65; i < 91; i++) {
				fos.write(i);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
