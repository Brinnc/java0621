class UseDog{
	public static void main(String[] args){
		Dog d=new Dog();
		int x=7;
		d.setName("�ǹ�");
		String name=d.getName();

		d.setAge(x);
		d.setFood(new Food()); //���� ��ü�� �ƴ� ���۷������� �Ѿ�� ��
		Food food=d.getFood();

		//call by value
		//call by reference

	}
}
