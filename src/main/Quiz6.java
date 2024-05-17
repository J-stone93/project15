package main;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz6 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("quiz6.txt");
			
			for (int i = 2; i <= 9; i++) {
				
				for (int j = 1; j <= 9; j++) {
					
					fw.write(i + "X" + j + "=" + (i * j) + "\n");
				}	
				fw.write("\n");
			}
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
