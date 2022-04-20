package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		for(int i=0; i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		// 기본
		
//		int[] intArray = new int[] {3,6,9};
//		for(int i=0; i<intArray.length;i++) {
//			System.out.println(intArray[i]);						
//		}
		// 추천
		
//		int[] intArray = {3,6,9};
//		for(int i=0; i<intArray.length;i++) {
//			System.out.println(intArray[i]);
//		}
		// 가장 쉬운방법
		
		System.out.println("================================");
		
		double[] dArray = new double[3];
		dArray[0] = 1.1;
		dArray[1] = 7.3;
		dArray[2] = 5.2;
		
		for(int i=0; i<dArray.length; i++) {
			System.out.println(dArray[i]);
		}
		
		System.out.println("================================");
		
		char[] cArray = new char[5];
		cArray[0] = '안';
		cArray[1] = '녕';
		cArray[2] = '하';
		cArray[3] = '세';
		cArray[4] = '요';
		
		for(int i=0; i<cArray.length; i++) {
			System.out.print(cArray[i]);
		}
		
		System.out.println("================================");
		boolean[] bArray = new boolean[3];
		bArray[0] = true;
		bArray[1] = false;
		bArray[2] = 3==5;
		
		for(int i=0; i<bArray.length; i++) {
			System.out.println(bArray[i]);
		}
	}

}
