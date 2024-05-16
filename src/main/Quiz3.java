package main;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		// scanner를 사용하여 문자열을 계속 입력받으세요
		
		Scanner scanner = new Scanner(System.in);
		
		// while 루프를 사용하여 입력을 계속 받으세요
		// 입력된 문자가 stop이면 루프를 종료하세요
		
		
		
		while (true) {
			System.out.println("문자를 입력하세요");
			String str = scanner.nextLine();
			// (str == "stop")는 String(클래스)은 객체 타입이라 주소값이 들어가 있어서 사용불가
			if(str.equalsIgnoreCase("STOP")) {
				break;
			}
			System.out.println("프로그램이 종료되었습니다");
		} 

	}

}
