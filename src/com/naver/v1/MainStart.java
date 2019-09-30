package com.naver.v1;

public class MainStart {

	public static void main(String [] args) {
	// 변수 : 변하는 수, 하나의 값을 저장하는 메모리상의 저장공간 
	// (cf. 상수 : 고정된 수)
		
	// 숫자 
	// 1. 정수 : 소수점이 없는 수  ex) 100
	// int 변수명;
	// 2. 실수 : 소수점이 있는 수  ex) 10.49
	// double 변수명;
	
	
	int age = 28;
	// 정수형
	
	double ki = 160.3;
	// 실수형
	
	System.out.println(age); //결과 : 28
	System.out.println("age"); //결과 : age
	
	age = 30; //28의 값이 30으로 바뀜. age의 값은 30이 됨. 변하므로 변수
	System.out.println(age); //결과 : 30
	
	System.out.println(ki);
	System.out.println("");
	
		
	}
}
