package com.naver.v1;

public class MainStart2 {

	public static void main(String [] args) {
	// Data type 
		
	//Primitive type(원시타입, 기본타입) 	
	// 숫자, 문자(한글자), 논리형(맞다아니다.)
	// 3(정수형숫자), 2.15(실수형숫자), a(한글자문자)  
	// abc(primitive type 아니다)
		
	/** Primitive type
	 * 숫자
	 *  정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
	 *  실수형 : float(4byte), double(8byte)
	 *
	 * 1GB = 1024MB
	 * 1MB = 1024KB
	 * 1KB = 1024Byte
	 * 1Byte = 8bit
	 * 
	 * 문자 char(2byte)
	 * 
	 * 논리형 boolean(1byte)
	 * 
	 */
		
	//<정수형 숫자 : 저장할 수 있는 범위를 알려준다. int랑 long위주로 쓴다.>
	byte b = 30; //비트연산
	short s = 15; //C언어와의 호환
	int i = 50; //대중적으로 사용 
	long l = 25L; //long타입 알려주기 위해 뒤에  L,l을 붙여준다.
	
	//<실수형 숫자 : double 위주로 쓴다. >
	float f = 45.63F; //float타입 알려주기 위해 뒤에 F,f을 붙여준다.
	double d = 78.43; //대중적으로 사용
	
	//<문자>
	char ch ='a'; //홑따옴표를 써야한다.
	
	//<논리형>
	boolean check = true; //값은 맞으면 true, 틀리면 false를 넣어준다.
	
	// int i = 30; 
	// 뒤에서 위와 똑같은 변수명으로 두번은 쓸 수 없다. 중복선언 불가.
	
	
	//Reference type(참조타입)
	// 그 외 나머지 
	// abc(reference type)
	// 문자열(문자배열)
	// String 
	String name = "BTS"; //쌍따옴표를 쓴다.

	
	
	}
}
