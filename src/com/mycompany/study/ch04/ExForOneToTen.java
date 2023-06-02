package com.mycompany.study.ch04;

public class ExForOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int sum = 0;
//		for (int i=1; i <=10; i++ ) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		int sum = 0;
		for(int i =11; i <= 50; i++) {
			if(i % 2 == 0) {
				sum += i;
				System.out.println(i +"|" + sum);
			}
		}
	}

}
