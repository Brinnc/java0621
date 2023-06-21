/*
~객체 지향 언어의 특징~
1) 상속
2) 은닉화(내부를 노출하지 않는 것)
3) 추상화 (복잡한 코드를 간략화시키는 것)
4) ★다형성(polymorphism)★ ->나중에 다룰 예정
*/

package com.sp.project0621.bank;

//고객의 계좌 정의
public class Account{
	//자바에서는 개발자가 아무런 접근제한자를 명시하지 않으면
	//디폴트로 default 접근제한자가 적용됨
	//public < protected < default < private
	//public : 보안이 없음, 누구나 사용가능
	//protected : 상속관계에 있을 때와 같은 패키지에 있을 때 허용
	//default : 오직 같은 패키지에서만 접근 가능함
	//private : 나(해당 클래스에서만)만 사용가능, 즉 내 클래스 내에서 접근 가능-메서드에서 변수를  

	private String num="110-555-555557";
	private int balance=1000000000;
	private String name="batman";

	//잔고 변경
	public void setBalance(int b){
		//외부에서 전달된 값이 음수라면, 이 데이터는 해킹으로 봄
		if(b>0){
			balance=b;
		}
	}
	public int getBalance(){
		return balance;
	}
}
