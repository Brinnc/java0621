package com.sp.project0621.traffic;

class UseCar{
	public static void main(String[] args) 
	{
		//�ڵ��� 1���� �ν��Ͻ� �����
		int x=3; //�⺻�ڷ���
		Car car=new Car(); //��ü�ڷ���, �⺻�ڷ������� ������
		//() -> �׷��� ������ �޼��带 ��������
		//1) Ŭ������� ������ �̸�
		//2) ������ ȣ���ؾ���
		System.out.println("car is"+car);
		System.out.println("wheel is"+car.w);
		System.out.println("handle is"+car.h);
		
	}
}
