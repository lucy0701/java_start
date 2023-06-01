package com.mycompany.study.ch04;

public class ExIf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -1;
		int b = 0;
		int c = 2;
		
		if(a > b && a > c) {
			System.out.println("최대값 : A");
		}else if ( b > c && b > a) {
			System.out.println("최대값 : B");
		}else if ( c > a && c > b) {
			System.out.println("최대값 : C");
		} else {
			System.out.println("모두 같음");
		}
		
		if(a < b && a < c) {
			System.out.println("최소값 : A");
		}else if ( b < c && b < a) {
			System.out.println("최소값 : B");
		}else if ( c < a && c < b) {
			System.out.println("최소값 : C");
		} else {
			System.out.println("모두 같음");
		}
		
	}

}
