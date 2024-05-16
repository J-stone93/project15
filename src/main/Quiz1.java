package main;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 5개의 크기의 정수형 배열을 생성하세요
		int[] arr = new int[5];
		
		// Scanner를 사용하여 배열에 숫자 5개를 입력받으세요
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 5개 입력해주세요");
//		 arr[0] = scanner.nextInt();
//		 arr[1] = scanner.nextInt();
//		 arr[2] = scanner.nextInt();
//		 arr[3] = scanner.nextInt();
//		 arr[4] = scanner.nextInt();
		 
		 for (int i = 0 ; i < 5 ; i++) {
			 arr[i] = scanner.nextInt();
		 }
		 
		 // 배열 요소의 합을 구하세요
		 int sum = 0;
		 for (int i = 0 ; i < 5 ; i++) {
			 sum = sum + arr[i];
		 }
		 System.out.println(sum);
	}

}
