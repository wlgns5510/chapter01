package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i%2==0 && i%3==0) {
				/* break; */ 				//break에 값이 들어가게되면 for문에서 나가짐
			    continue;					//countinue에 값이 들어가면 그 값을 확인하고 다시 for문으로 돌아감
			}
			System.out.println(i);
		}				
		System.out.println("종료");
	}

}
