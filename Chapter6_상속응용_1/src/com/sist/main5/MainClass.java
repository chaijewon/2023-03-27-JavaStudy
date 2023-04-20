package com.sist.main5;
import java.util.*;
// 객체지향 => 묶는것이다 
/*
 *    1. 관련된 데이터를 묶는다 
 *       배열 / 클래스 
 *    2. 관련된 명령문을 묶는다 
 *       메소드 
 *    3. 관련된 클래스를 묶는다
 *       상속 / 인터페이스(****)
 *       => 하위클래스에서 기능을 추가하면 => 접근할 수 없다 
 *    ---------------------  
 *    4. 상속 
 *       접근지정어 
 *         => default , protected , public 
 *         => private : 상속은 된다 => 접근이 불가능 
 *            금고 => 상속 (키번호) => protected
 *       --------
 *       제어어 
 *         => 변수 : 접근지정어 , static , final 
 *         => 메소드 : 접근지정어 , static , final , abstract
 *         ---------------
 *         => 생성자 : 접근지정어만 사용한다 
 *       --------
 *    class A
 *    {
 *       int a;
 *       int b;
 *    }
 *    class B extends A
 *    {
 *       // a,b
 *       int a;
 *    }
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Human h=new Human();
        h.print();
        
        h=new Member();
        h.print();
        
        h=new Sawon();
        h.print();*/
		Scanner scan=new Scanner(System.in);
		System.out.print("선택(Human(1),Member(2),Sawon(3)):");
		int select=scan.nextInt();
		/*if(select==1)
		{
			Human h=new Human();
			h.print();
			h.aaa();
			h.bbb();
		}
		else if(select==2)
		{
			Member h=new Member();
			h.print();
			h.aaa();
			h.bbb();
		}
		else if(select==3)
		{
			Sawon h=new Sawon();
			h.print();
			h.aaa();
			h.bbb();
		}*/
		Human h=null;// print,aaa,bbb
		if(select==1)
			h=new Human();
		else if(select==2)
			h=new Member();
		else if(select==3)
		{
			h=new Sawon();
			
		}
		
		h.print();
		h.aaa();
		h.bbb();
		// 추가 
	}

}
