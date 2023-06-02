package com.mycompany.study.ch05;

public class ExArrayInArray {

	public static void main(String[] args) {

		int[][] score = {{99,88,44}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
		
		int sum = 0;
		for(int i= 0; i < score.length; i++) {
			for(int j=0; j < score[i].length; j++) {
				System.out.println("score[" + i + "][" + j + "] : " + score[i][j]);
			}
			System.out.println("----------");
		}


	}
}
