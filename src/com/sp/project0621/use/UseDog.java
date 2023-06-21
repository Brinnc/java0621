//java 패키지명.클래스파일(확장자x)
package com.sp.project0621.use;

//사용하려는 클래스가 나와는 다른위치에 있을때 반드시 import해야한다
//이때 import의 위치는 어디를 기준으로 하는지?
//환경변수에 등록된 바이너리 루트를 기준으로 함
import com.sp.project0621.animal.Dog;

class UseDog {
	public static void main(String[] args) 
	{
		//new com.sp.project0621.animal.Dog(); 이런식으로 직접 경로를 써줘도 되긴하는데... 당연히 그렇게는 안씀
		Dog d=new Dog();
		boolean gender=d.isBoy();
		System.out.println(gender);
	}
}
