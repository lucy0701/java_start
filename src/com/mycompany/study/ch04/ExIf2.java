package com.mycompany.study.ch04;

public class ExIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade = 3;
		int cost = 12000;
		
		if (grade == 1) {
			System.out.println("정가가 " + grade + "원인 브론즈 등급의 할인가는: " + cost/100 * 95 + "원 입니다.");
		} else if (grade == 2) {
			System.out.println("정가가 " + grade + "원인 실버 등급의 할인가는: " + cost/100 * 90 + "원 입니다.");
		} else if (grade == 3) {
			System.out.println("정가가 " + grade + "원인 골드 등급의 할인가는: " + cost/100 * 80 + "원 입니다.");
		} else {
			System.out.println("정가가 " + grade + "원인 플래티넘 등급의 할인가는: " + cost /100 * 97.3 + "원 입니다.");
		}
	}

}
