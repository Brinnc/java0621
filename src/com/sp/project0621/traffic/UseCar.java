package com.sp.project0621.traffic;

class UseCar{
	public static void main(String[] args) 
	{
		//자동차 1대의 인스턴스 만들기
		int x=3; //기본자료형
		Car car=new Car(); //객체자료형, 기본자료형보다 복잡함
		//() -> 그래서 생성자 메서드를 지원해줌
		//1) 클래스명과 동일한 이름
		//2) 무조건 호출해야함
		System.out.println("car is"+car);
		System.out.println("wheel is"+car.w);
		System.out.println("handle is"+car.h);
		
	}
}
