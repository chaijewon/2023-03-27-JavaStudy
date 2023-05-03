package com.sist.lib;
class A
{
	public void display()
	{
		System.out.println("A:display() Call..");
	}
	public void aaa(Object obj)
	{
		B b=(B)obj;
		b.display();
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("B:display() Call..");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new B();// 메소드의 주소 변경 => 동적바인딩
        B b=(B)a;
        b.display();
        // Object obj=new B();
        B bb=new B();
        A aa=new A();
        aa.aaa(bb);
	}

}
