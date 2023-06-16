package com.mycompany.study.ch06.second;

public class ComputerExample {
	public static void main(String[] args) {
		double radius = 7.0;
		
		System.out.println("원의 반지름: " + radius);
		
		System.out.println();

		Calculator calculator = new Calculator();
		double area1 = calculator.param(radius);
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원의 면적: " + area1);
		
		System.out.println();

		Computer computer = new Computer();
		double area2 = computer.param(radius);
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원의 면적: " + area2);
	}
}