//�ڵ����� �����ϵ�, �ִ��� ������ �ݿ�
package com.sp.project0621.traffic;

//�ڵ����� ������ ���� ���� Car has a wheel
//��ü�� �ٸ� ��ü�� �����ϰ� �ִ� ��� : ��has a �����ϰ� ��

public class Car{
	//���� ������ ������ : Car has a wheel
	Wheel w;
	Handle h;

	/*
	������(constructor)��?
	-�޼�����
	-��ü�� ������ ��, �� new �����ڰ� ȣ��Ǿ��� �� ������������ ȣ��Ǵ� �޼���
	-�� ����ϴ°�?
		�Ϲݵ�����(����, ����, ������)�ʹ� �޸� ��ü�� �ʱ�ȭ ������ �����ϰ� �Ŵ���
		����, ���� �������� �ʱ�ȭ�� �ʿ��ϱ� ����
	-�����ڴ� ������ new ������ �ڿ� ���� ȣ���� �Ͼ�� ������ ������ ȣ���� ���� �� ����
	-�����ڴ� �Ϲ� �޼��尡 �ƴϱ⿡ ��ȯ�� ��ü�� ����
		���� void �� ��ȯ���� �־������, �׶����� �׳� �Ϲݸ޼��尡 �Ǿ� ���� �ɷ��� �����(�п����� �ȳ���)
	*/
	/*
	����Ʈ ������ 
	-��������: �ּ����� ������ �߻����� �ʵ��� �����Ŵ
	-new������ �� ���� ȣ��Ǵ� ������ �޼���� ���Ͽ�, ������ �߻��ϴ� ���� ����
	-��, �����ڰ� �����ڸ� �������� ������ �ּ��� ������ ���� �ʾƾ��ϹǷ� ����Ʈ �����ڰ� ������
	-������ �����ڰ� �����ڸ� ���������� �����Ѵٸ�, ����Ʈ �����ڴ� �������� �ʰԵ�
	public Car(){ //���� ��ȯ�� ������ �ȵ� void x
	}
	*/
	public Car(){
		System.out.println("���� ������ ������");
		//���� �� �ڵ����� �¾ ��, ������ ��� ��ü���� �޸𸮿� �÷���
		w=new Wheel();
		h=new Handle();
	}
}