package com.mycompany.study.ch03;

public class ExIncereaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
		int k = i++;
		int m = ++j;
		
		System.out.println("k: " + k);
		System.out.println("m: " + m);

		--i;
		int z = ++i + j++;
		System.out.println("z: "+ z);
		System.out.println("i: "+ i);
		System.out.println("j: "+ j);
		
		
		int a = 1;
		int b = 1;
		--a;
		b--;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int o = a--;
		int p = --b;
		
		System.out.println("o: " + o);
		System.out.println("p: " + p);
	}

}
