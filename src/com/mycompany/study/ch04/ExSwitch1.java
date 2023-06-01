package com.mycompany.study.ch04;

public class ExSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num = 3;
//		
//		switch(num) {
//		case 1:
//			System.out.println("1번이 나왔습니다.");
//			break;
//		case 2:
//			System.out.println("2번이 나왔습니다.");
//			break;
//		default:
//			System.out.println("1번도 2번도 아닌게 나왔다.");
//			break;
//		}
		
		String position = "부장";
		
		switch(position) {
		case "사장":
			System.out.println("사장의 연봉은 500원입니다.");
			break;
		case "부장":
			System.out.println("부장의 연봉은 20원입니다.");
			break;
		case "과장":
			System.out.println("과장의 연봉은 8000원입니다.");
			break;
		case "대리":
			System.out.println("대리의 연봉은 200원입니다.");
			break;
		case "주임":
			System.out.println("주임의 연봉은 3000원입니다.");
			break;
		case "사원":
			System.out.println("사원의 연봉은 12300원입니다.");
			break;
		default :
			System.out.println("다시 임력하세요.");
			break;
		}
		
		
		
	}

}
