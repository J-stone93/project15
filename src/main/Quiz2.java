package main;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		// scanner를 사용하여 두자리 정수(10~99)를 입력받으세요
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 입력하세요(10~99)");
		int num = scanner.nextInt();
		
		int num2 = num / 10;
		System.out.println(num2);
		
		int num3 = num % 10;
		System.out.println(num3);
		
		System.out.println("십의자리와 일의자리의 합: " + (num2 + num3));

	}

}
