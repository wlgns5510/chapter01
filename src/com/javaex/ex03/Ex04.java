package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		int pay;
		if(8 >= time ) {
			pay =  time*10000;
		
		}
		else {
			pay = 8*10000 + 12000*(time-8);
			
		}
		System.out.println("임금은 " + pay + "원 입니다.");
		
		sc.close();

	}

}
