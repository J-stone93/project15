package main;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		// 표준입력을 인자로 사용하여 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		// 표준입력 system.in을 scanner라는 겁데기로 감싸줌
		
		// 문자열 입력받기
		System.out.println("이름: ");
		String name = scanner.nextLine();
		
		// 숫자 입력받기
		System.out.println("나이: ");
		int age = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(age);
		
		// 사용한 리소스 담기
		scanner.close();
		
	}

}
