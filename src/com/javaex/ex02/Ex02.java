package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // <-- 키보드로 입력하는 값을 반환하기위한 작업(Scanner는 키보드만 사용하는 용도는 아님)
		
		int num = sc.nextInt(); // <-- 키보드 입력값(??)
		System.out.println("입력하신 숫자는" + num + "입니다");
		
		sc.close(); // <-- 키보드 끝
	}

}
