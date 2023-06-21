class UseDog{
	public static void main(String[] args){
		Dog d=new Dog();
		int x=7;
		d.setName("뽀미");
		String name=d.getName();

		d.setAge(x);
		d.setFood(new Food()); //실제 객체가 아닌 레퍼런스값이 넘어가는 것
		Food food=d.getFood();

		//call by value
		//call by reference

	}
}
