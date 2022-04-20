package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] leftArray = new int[] {10, 20, 30};
		int[] rightArray = new int[] {10, 20, 30};
		
		if(leftArray.length == rightArray.length) { //두 배열의 갯수가 같은지
			//같을경우 세부검사
			for(int i=0; i<leftArray.length; i++) {
				if(leftArray[i] != rightArray[i]) {//두 배열의 데이터가 다른지
					System.out.println(i + " 번째 값이 다릅니다.");
				}
				else {
					System.out.println(i + " 번째 값이 같습니다.");
				}
			}
		}
		else {
			//같지 않을 경우
			System.out.println("두배열의 크기가 다릅니다.");
		}

	}

}
