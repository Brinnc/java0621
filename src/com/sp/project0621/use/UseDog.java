//java ��Ű����.Ŭ��������(Ȯ����x)
package com.sp.project0621.use;

//����Ϸ��� Ŭ������ ���ʹ� �ٸ���ġ�� ������ �ݵ�� import�ؾ��Ѵ�
//�̶� import�� ��ġ�� ��� �������� �ϴ���?
//ȯ�溯���� ��ϵ� ���̳ʸ� ��Ʈ�� �������� ��
import com.sp.project0621.animal.Dog;

class UseDog {
	public static void main(String[] args) 
	{
		//new com.sp.project0621.animal.Dog(); �̷������� ���� ��θ� ���൵ �Ǳ��ϴµ�... �翬�� �׷��Դ� �Ⱦ�
		Dog d=new Dog();
		boolean gender=d.isBoy();
		System.out.println(gender);
	}
}
