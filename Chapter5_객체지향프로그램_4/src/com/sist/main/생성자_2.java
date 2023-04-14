package com.sist.main;
/*
 *   초기화 
 *   1. 디폴트 값 
 *      int => 0 , String => null , boolean => false....
 *      class A
 *      {
 *         int a;
 *      }
 *   2. 명시적 초기화 : 직접 값을 설정
 *      class A
 *      {
 *         int a=10;
 *      }
 *   3. 생성자 초기화 
 *      class A
 *      {
 *         int a;
 *         A(){
 *           a=100;
 *         }
 *      }
 *   4. 초기화 블록 
 *      class A
 *      {
 *         int a; 
 *         //a=1000;
 *         {
 *            a=1000;
 *         }
 *      }
 *      
 *      디폴트 => 명시적 => 초기블록 => 생성자 
 *      int a=0 int a=10  int a=100 int a=1000
 */
/*class Student{
	int hakbun;
	String name;
	
	{
		hakbun=100;// 연산처리 , 제어문 , 파일 읽기 ...
	}
	
	Student() {
		hakbun=1000;
	}
}*/
/*
 *   class A
 *   {
 *     void a(){}
 *     void b(int a){}
 *   }
 */
class A
{
	int a=10;
	int b=30;
	int c=a+b;
	//A(){} A(int a) A(int b,int c)
}
class Student{
	int hakbun;
	
	String name;
	Student() {
	// TODO Auto-generated constructor stub
		System.out.println("Student() Call...");
		hakbun=1;
		name="홍길동";
		try
		{
			
		}catch(Exception e) {}
    }
	Student(int h,String n)
	{
		hakbun=h;
		name=n;
	}
}
public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s=new Student();
        System.out.println(s.hakbun);
        System.out.println(s.name);
        
        Student s1=new Student();
        System.out.println(s1.hakbun);
        System.out.println(s1.name);
        // 생성자 호출 new를 앞에 붙여서 호출한다 
        //new Student();
        Student s2=new Student(2, "심청이");
        System.out.println(s2.hakbun);
        System.out.println(s2.name);
        Student s3=new Student(3, "박문수");
        System.out.println(s3.hakbun);
        System.out.println(s3.name);
	}

}
