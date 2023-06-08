package com.mycompany.study.ch06.first;

public class ExCar {

	public static void main(String[] args) {
		int a = 1;
		System.out.println(a);

		Car car = new Car();
		
		System.out.println(car.enginge);
		System.out.println(car.name);
		System.out.println(car.color);
		System.out.println(car.company);
		
		car.gogo();
		car.back();
		
		Ipod ipod = new Ipod();
	}

}
