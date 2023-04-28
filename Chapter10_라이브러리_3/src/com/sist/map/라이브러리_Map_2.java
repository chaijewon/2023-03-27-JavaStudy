package com.sist.map;
import java.util.*;
interface M
{
	public void execute();
}
class A implements M
{
	public void execute()
	{
		System.out.println("A:execute() Call...");
	}
}
class B implements M
{
	public void execute()
	{
		System.out.println("B:execute() Call...");
	}
}
class C implements M
{
	public void execute()
	{
		System.out.println("C:execute() Call...");
	}
}
// Spring => 클래스 관리자 (게임)
class Container
{
	Map map=new HashMap();
	// 싱글턴 => 메모리 누수현상을 방지 (한개의 객체로 재사용을 하는 프로그램)
	// Map => 클래스 관리시에 주로 사용한다 
	public Container()
	{
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
	}
	public M getBean(String key)
	{
		return (M)map.get(key);
	}
}
public class 라이브러리_Map_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Container c=new Container();
        M m=c.getBean("a");
        m.execute();
        
        m=c.getBean("b");
        m.execute();
        
        m=c.getBean("c");
        m.execute();
	}

}
