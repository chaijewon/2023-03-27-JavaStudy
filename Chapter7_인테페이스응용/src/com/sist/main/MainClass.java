package com.sist.main;
// 조립 
class Parent{
	public String name;
	public Parent(String name){
		this.name = name;
	}
	public Parent() {}
}
class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo){
		this.name = name;
		this.studentNo = studentNo;
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
