/*
~��ü ���� ����� Ư¡~
1) ���
2) ����ȭ(���θ� �������� �ʴ� ��)
3) �߻�ȭ (������ �ڵ带 ����ȭ��Ű�� ��)
4) �ڴ�����(polymorphism)�� ->���߿� �ٷ� ����
*/

package com.sp.project0621.bank;

//���� ���� ����
public class Account{
	//�ڹٿ����� �����ڰ� �ƹ��� ���������ڸ� ������� ������
	//����Ʈ�� default ���������ڰ� �����
	//public < protected < default < private
	//public : ������ ����, ������ ��밡��
	//protected : ��Ӱ��迡 ���� ���� ���� ��Ű���� ���� �� ���
	//default : ���� ���� ��Ű�������� ���� ������
	//private : ��(�ش� Ŭ����������)�� ��밡��, �� �� Ŭ���� ������ ���� ����-�޼��忡�� ������  

	private String num="110-555-555557";
	private int balance=1000000000;
	private String name="batman";

	//�ܰ� ����
	public void setBalance(int b){
		//�ܺο��� ���޵� ���� �������, �� �����ʹ� ��ŷ���� ��
		if(b>0){
			balance=b;
		}
	}
	public int getBalance(){
		return balance;
	}
}
