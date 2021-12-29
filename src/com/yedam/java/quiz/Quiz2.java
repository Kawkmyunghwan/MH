package com.yedam.java.quiz;

import java.util.Scanner;

public class Quiz2 {
	
    //문제1
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 수 : ");
		String strnum = scanner.nextLine();
		
		System.out.println("두 번째 수 : ");
		String strnum1 = scanner.nextLine();
		
		int num1 = (int)Integer.parseInt(strnum);
		int num2 = (int)Integer.parseInt(strnum1);
		
		int result = num1 + num2;
		System.out.println("결과 값 : " + result);
	
		//문제2
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("필수 정보 입력 : ");
		System.out.println("1. 이름 : ");
		String intNum1 = scanner1.nextLine();
		System.out.println("2. 주민번호 앞 6자리 : ");
		String intNum2 = scanner1.nextLine();
		System.out.println("3. 전화번호 : ");
		String intNum3 = scanner1.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(intNum1);
		System.out.println(intNum2);
		System.out.println(intNum3);
		
		//문제3
		
	    long var1 = 2L;
	    float var2 = 1.8f;
	    double var3 = 2.5;
	    String var4 = "3.9";
		int intResult = (int) (var2+var3) + (int) var1 + (int)Double.parseDouble(var4);
		System.out.println(intResult);

	}

}
