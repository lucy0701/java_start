package com.mycompany.study.ch05;

public class ExArrayInArray {
    public static void main(String[] args) {

        int[][] score = {{50, 10, 30}, {10, 30, 30}, {10, 60, 30}, {30, 80, 30}, {90, 100, 30}};
        String[] name = {"도형", "수철", "민지", "민아", "장철", "진서"};

        int[] subjectTotal = new int[score[0].length];
        int[] personTotal = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                subjectTotal[j] += score[i][j];
                personTotal[i] += score[i][j];
            }
        }

        System.out.println("------------과목별 총합--------------");
        for (int i = 0; i < subjectTotal.length; i++) {
            System.out.println(name[i] + "의 총합 : " + subjectTotal[i] + "입니다.");
        }

        System.out.println("------------과목별 평균--------------");
        for (int i = 0; i < subjectTotal.length; i++) {
            double average = (double) subjectTotal[i] / score.length;
            System.out.println(name[i] + "의 평균 : " + average + "입니다.");
        }

        System.out.println("------------사람별 총합--------------");
        for (int i = 0; i < personTotal.length; i++) {
            System.out.println(name[i] + "의 총합 : " + personTotal[i] + "입니다.");
        }

        System.out.println("------------사람별 평균--------------");
        for (int i = 0; i < personTotal.length; i++) {
            double average = (double) personTotal[i] / score[i].length;
            System.out.println(name[i] + "의 평균 : " + average + "입니다.");
        }
    }
}
