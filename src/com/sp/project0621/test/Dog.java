class Dog{
	String name;
	Food f;
	int age;

   public void setName(String d) {
     this.name=d; //매개변수와 동일하지 않으므로 this와는 생략가능
   }
   public String getName(){
	 return name;
   }

   public void setFood(Food fd) {
    this.f=fd;
   }
	public Food getFood(){
		return food;
	}

	public void setAge(){
		this.age=age;
	}
}
