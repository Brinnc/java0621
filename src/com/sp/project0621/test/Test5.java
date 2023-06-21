class Computer{
	int speed=300;
}

class UseComputer {
	public void setting(Computer c , int s){
		c.speed=s;
		s=50; //(다)
	}
	public static void main(String[] args) {
		int k=500; //(가)
		UseComputer uc = new UseComputer();
		Computer com = new Computer();//(바)
		com.speed=100;
		uc.setting(com , k); //(나) (call by @(레퍼런스)_객체자료형, call by value_일반자료형)
		//com의 주소값이 넘어갔기때문에 원본com의 변수값을 변경할수잇음
		//따라서, call by reference에 의해 넘겨진 객체는 해당 메서드에 의해 영향을 받을 수 있음
		System.out.println(com.speed); //(라)
		System.out.println(k); //(마)
	}
}