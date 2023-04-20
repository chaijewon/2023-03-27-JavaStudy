package com.sist.main;
/*
 *   1. 사용처 => 응용 
 *   ----------------
 *   인터페이스 : 추상클래스의 일종 (보완)
 *      1) 다중 상속 
 *      2) 인터페이스는 클래스와 동일 (상속을 받으면 상위 클래스다)
 *      3) 설계만 되어 있다 (구현이 안된 메소드만 모아서 선언)
 *      4) 장점 
 *         ---
 *          = 기능 설계 => 개발시간 단축 ==> 개발 기간 8개월  
 *             아키텍처 (PM)       DBA 
 *               3개월               1개월
 *          = 요구사항 분석 => 데이터베이스 설계 => 데이터 수집 
 *            ----------------------------------------
 *              추상클래스 / 인터페이스 설계
 *                       => 화면 UI  ==> 퍼블리셔 => 1개월
 *                       => 구현     ==> 웹 프로그래머 => 2개월
 *                       => 테스팅   ==> 테스터 ==> 1개월
 *                       => 배포     ==> PL ==> 1개월
 *          = 표준화 가능 : 같은 메소드를 사용 
 *            ---------  스프링 (통합)
 *            프레임워크 : 세트 ==> 마이바티스 , JPA , Jquery , VueJS,React
 *          = 서로 관계없는 클래스 연결해서 사용이 가능 
 *          = 유지보수가 편리하다 
 *            (수정)
 *          = 독립적으로 사용이 가능 
 *     ---------------------------------------
 *      클래스 여러개를 묶어서 한개의 이름으로 제어가 가능 
 *             List(******) 가변형  Map , Set 
 *              |
 *      ----------------------------------------
 *      |          |             |      |      |
 *     ArrayList  LinkedList   Vector  Queue   Stack
 *     
 *     List list=new ArrayList()
 *     list=new Vector()
 *     list=new LinkedList()
 *     list=new Queue()
 *     list=new Stack()
 *     
 *     웹에서 가장 많이 사용하는 라이브러리(3대) 
 *     ---------------------------------
 *     1. String 
 *     2. List
 *     3. Integer(int를 사용하기 편리하게 만든 클래스)
 *        웹/윈도우 => 모든 데이터형 (String)
 *        page=1  => "1" => 1 ==> Wrapper
 *        <input type=text> 
 *        JTextField
 *     4. ==> 전공 / 학원 6개월 수료
 *     -------------------------- 
 *     
 *     => 형식)
 *        [접근지정어] interface InterfaceName
 *        {
 *            ----------------------
 *             상수
 *               int a; ==> 오류 
 *               (public static final) int a=10; 
 *               --------------------- 자동 추가 
 *            ----------------------
 *             추상메소드 
 *               void display();
 *               (public abstract) void display();
 *            ----------------------
 *        }
 *        자동 추가 
 *        1) import java.lang.*; => String , Math...
 *        2) 메소드 => void aaa()
 *                   {
 *                      => return;
 *                   }
 *        3) 생성자 => class A
 *                   {
 *                      => A(){}
 *                   }
 *        4) 인터페이스 
 *            변수 선언 => (public static final) int a=10;
 *                       ----------------------
 *                       (public abstract) void disp();
 *                       구현이 가능한 메소드 
 *                       (public) default void aaa(){}
 *             interface는 상수,메소드 => public만 사용한다 
 *      = 선언만 되어있다 => 상속을 내린다 
 *        => 상속받은 클래스를 구현을 해서 사용 (오버라이딩)
 *      = 다중상속을 지원한다 
 *        ------
 *        상속과정 
 *        ------
 *        interface A
 *        class B extends A ==> 오류 
 *                -------- 확장해서 사용 
 *        class B implements A
 *                ---------- 구현후에 사용 
 *                
 *        interface ===> interface 
 *        interface A
 *        interface B ( extends    ) A
 *        interface ===> class
 *        interface A
 *        class B (   implements   ) A
 *        class     ===> interface
 *        ---------------------------------
 *        class A
 *        interface B (       ) A => 오류
 *        ---------------------------------
 *        
 *        interface A
 *        interface B extends A
 *        class C implements B  ===> 단일 상속 
 *        
 *        interface A
 *        interface B
 *        class C implements A,B ==> 다중 상속 
 *        
 *        interface A
 *        interface B
 *        class C
 *        class D extends C implements A,B
 *        
 *        class E extends JFrame implements MouseListener,KeyListener,
 *                               ActionListener,Runnable
 *        => Game : 마우스이용 , 키보드 이용 , 버튼 이용 , 쓰레드 
 *    247page => 형식 
 *      일반 메소드 
 *      interface A
 *      {
 *         JDK1.8이상 => 
 *         (public) default void display(){}
 *         (public) abstract void doGame();
 *      }
 *      
 *      interface A
 *      {
 *         (public abstract) void aaa();
 *      }
 *      class B implements A
 *      {
 *         void aaa(){} => 오류 
 *      }
 *      
 *      class B implements A
 *      {
 *         public void aaa(){} => 오류 
 *      }
 *      
 *      249page 
 *      1) 인터페이스는 객체를 생성할 수 없다 (구현이 안된 메소드를 가지고 있기때문에
 *         메모리에 저장이 불가능)
 *         인터페이스 = new 구현한 클래스()
 *         => 거짓말이다(익명의 클래스를 이용하면 객체 생성할 수 있다)
 *      2) 인터페이스는 다중상속이 가능하다 
 *         class A implements 인터페이스,인터페이스....
 *                                   ---
 */
interface AA // AA aa ==> a,aaa()
{
	int a=10;
	void aaa();
}
interface BB // BB bb ==> a,bbb()
{
	int a=20;
	void bbb();
}
class CC implements AA,BB // CC cc => aaa(),bbb(),print()
{
	// AA.a , BB.a
	public void print()
	{
		System.out.println(AA.a);
		System.out.println(BB.a);
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("BB.bbb() 구현");
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AA.aaa() 구현");
	}
	
}
/*
 *   class A
 *   class B extends A  ==> B
 *   class C extends A
 *   class D extends A
 *   class E extends A
 *   class F extends A
 *   class G extends A
 *   class H extends A
 *   class I extends A
 *   
 *   A a=new B(); => 드물다 
 *   B b=new B();
 *   
 *   => 추상클래스 , 인터페이스 => 상속받은 클래스를 한번에 제어 
 */
public class 인터페이스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //CC c=new CC();
        //c.print();
		CC c=new CC();
		c.print();
		c.aaa();
		c.bbb();
		// aaa(),print(),bbb()
		///////////////////
		AA aa=new CC(); // implements도 extends와 동일하게 적용 
		// bbb() 호출을 못한다
		// aaa()
		aa.aaa();
		//aa.bbb();
		BB bb=new CC();
		bb.bbb();
		// bbb() 
		System.out.println(AA.a);
		
	}

}
