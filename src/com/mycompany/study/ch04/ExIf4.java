package com.mycompany.study.ch04;

public class ExIf4 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		
		if(a > 0 && b > 0) {
			System.out.println("(" + a + "," + b + ")는 1사분면에 위치합니다.");
		}else if(a < 0 && b > 0){
			System.out.println("(" + a + "," + b + ")는 2사분면에 위치합니다.");
		}else if(a > 0 && b < 0) {
			System.out.println("(" + a + "," + b + ")는 3사분면에 위치합니다.");
		}else if(a < 0 && b < 0){
			System.out.println("(" + a + "," + b + ")는 4사분면에 위치합니다.");
		}else if(a == 0 && b != 0){
			System.out.println("(" + a + "," + b + ")는 X축에 위치합니다.");
		}else if(a != 0 && b == 0){
			System.out.println("(" + a + "," + b + ")는 Y축에 위치합니다.");
		}else {
			System.out.println("원점");
		}
	}

}
