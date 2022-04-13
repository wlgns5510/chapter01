/*작성자: 양지훈
작성일: 2022-04-13
설 명: 나이기록 프로그램*/

package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[] args) {
		
				/*
		 * int myAge;   //변수선언
		 * myAge = 25;  //초기화
		 * int myAge = 25; //변수선언 + 초기화
		 * 
		 * myAge = 25; System.out.println(myAge); // 메모리의 값을 출력하는 메소드
		 * 
		 * myAge = 26; System.out.println(myAge);
		 */
		
		byte no;
		no = 127;
		System.out.println(no);
		
		long no2;
		no2 = 2147483648L; /* long은 범위(int)를 벗어난 숫자뒤에 L를 붙어야함 */
		System.out.println(no2);	
		
		
		/////////////////////////////////
		//변수선언, 초기화
		///////////////////////////////////
		
		//변수여러개일때 변수선언, 초기화
		
		int var01;
		int var02;
		int var03;
		
		//int var01, var02, var03;
				
		var01 = 10;
		var02 = 20;
		var03 = 30;
		

		
		//변수여러개일때 변수+초기화
		int var04 = 10;
		int var05 = 20;
		int var06 = 30;
		
	}

}
