package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		//산술연산자
		System.out.println(a+b); //9
		System.out.println(a-b); //5
		System.out.println(a*b); //14
		System.out.println(a/b); //3  정수/정수 --> 정수(몫)
		System.out.println(a%b); //1  나머지
		
		//산술연산자 '/ %'자세히
		System.out.println("산술연산자 / % 자세히");
		System.out.println(7/2); //3
		System.out.println(7.0/2.0); //3.5
		System.out.println(7%2); //1
		System.out.println(7.0%2.0); //1.0
		
		//부호 연산자
		System.out.println("부호연산자");
		int var = -3;
		
		int pVar = +var;
		System.out.println(pVar); //-3
		
		int mVar = -var;
		System.out.println(mVar); //3
		
		//증감연산자
		System.out.println("증감연산자"); //++,--를 사용하면 기존값이 바뀐다
		System.out.println(a); //7
		System.out.println(++a); //8
		System.out.println(++a); //9
		System.out.println(++a); //10
		
		System.out.println(b);	//2
		System.out.println(--b); //1
		System.out.println(--b); //0
		System.out.println(--b); //-1
		
		System.out.println(a); //10
		System.out.println(a++); //10
		System.out.println(a); //11 ++를 뒤에다 사용하면 기존값인a의 값이 바뀐다
		
		System.out.println(b); //-1
		System.out.println(b--); //-1
		System.out.println(b); // -2
		//***앞에다 쓰면 선반영 / 뒤에다 쓰면 후반영
		
	}

}
