package com.mycompany.study.ch04;

public class ExIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 81;
		
		if (score >= 90) {
			System.out.println("당신의 학점은 A입니다.");
		} else if (score >= 80) {
			System.out.println("당신의 학점은 B입니다.");
		} else if (score >= 70){
			System.out.println("당신의 학점은 C입니다.");
		} else if (score >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		} else {
			System.out.println("당신의 학점은 F입니다.");
		}
		
	}

}
