package com.javaex.ex01;

public class Ex06 {
	public static void main(String[] args) {
		
		//자동형변환
		System.out.println(2+3.5);
		
		
		double var01 = 2+3.5; //double은 정수2를 계산하지 못하기 때문에 실수인2.0으로 자동형변환됨
		System.out.println(var01);
		
		//자동형변환
		long var02 = 12345L;
		float var03 = 1.1F;
		
		System.out.println(var02 + var03);
		
		float result = var02 + var03; //var02(12345L) --> 12345.0F로 자동형변환됨
		System.out.println(result);
		
		////////////////////////////////////////////////////////////////////
		
		//강제형변환
		float var04 = 1111.6345f;
		int var05 = (int)var04; //강제형변화에는 ()사용
		System.out.println(var05);
		
		//축소변환 정상(int --> byte)
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02);
		
		//축소변환 비정상(int --> byte)
		int v03 = 103029770;
		byte v04 = (byte)v03; //int(4byte) --> byte로 축소하면서 3byte가 날아감
		System.out.println(v04);
		
		//확대변환(byte --> int)
		byte v05 = 10;
		int v06 = (int)v05;
		System.out.println(v06);
		
		//실수 --> 정수
		double v07 = 5.57;
		int v08 = (int)v07;  //int로 나타내기위해서 0.57을 날려서 표기함
		System.out.println(v08);
		
		//정수 --> 실수
		int v09 = 7;
		double v10 = (double)v09;  //double로 나타내기위해서 .0을 추가해서 표기함
		System.out.println(v10);
		
		//연습문제
		double a01 = 5 / 4;
		System.out.println(a01); 
		
		double a02 = (double)5 / 4 ; 
		System.out.println(a02); 
		
		double a03 = 5 / (double)4 ; 
		System.out.println(a03); 
		
		double a04 = (double)5 / (double)4 ; 
		System.out.println(a04); 
		
		int a05 = (int)1.3 + (int)1.8 ; 
		System.out.println(a05);
						
	}
}
