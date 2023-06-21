//javac -d 원하는경로(바이너리루트) 대상파일.java
package com.sp.project0621.animal;

public class Dog {
	/*
	자바에서는 리턴값이 없는 메서드명 앞에는 반드시 void를 명시해야하고
	리턴값이 있을 때는 해당 리턴값과 동일한 자료형을 명시해야 함
	*/
	//void란? 해당 메서드에는 return이 없다는 뜻
	public void eat(){
	}

	public int getLegs(){
		return 4;
	}

	public boolean isBoy(){ //남
		return false;
	}
}
