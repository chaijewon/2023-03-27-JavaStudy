package com.sist.main;
class A
{
	public A() {
		System.out.println("A() Call...");
	}
	public A(int a) {
		System.out.println("A(int a) Call...");
	}
}
class B extends A
{
	public B() {
		System.out.println("B() Call...");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B b=new B();//// 원래 
        //A a=new A();
        //////////////////////////
        A aa=new B();////인터페이스 , 추상클래스 
        //B bb=(B)aa;
	}

}
