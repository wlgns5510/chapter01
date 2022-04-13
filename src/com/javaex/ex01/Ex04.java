package com.javaex.ex01;

public class Ex04 {
	public static void main(String[] args) {
		
	//char은 '한글자'만 표시할수 있음
		char ch01 = 'A';	
		char ch02 = '안'; 
		char ch03 = 65;  //코드표에서 65=A에 해당
		char ch04 = '3'; //'3'아닌 3을 넣을때는 코드값3에 해당하는 값이 나옴(숫자3안나옴)
		
		System.out.println(ch01);
		System.out.println(ch02);
		System.out.println(ch03);
		System.out.println(ch04);
		
	//한글자 이상 표시할때는 String사용 S는 대문자사용
		String str = "안녕하세요";
		System.out.println(str);
	}

}

