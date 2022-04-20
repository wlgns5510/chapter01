package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		int num[] = new int[6];
		
		num[0] = (int)(Math.random()*45)+1;
		num[1] = (int)(Math.random()*45)+1;
		num[2] = (int)(Math.random()*45)+1;
		num[3] = (int)(Math.random()*45)+1;
		num[4] = (int)(Math.random()*45)+1;
		num[5] = (int)(Math.random()*45)+1;
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "   ");
		}

	}

}
// Ex01하고 비교!
