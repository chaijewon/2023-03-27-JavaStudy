package com.sist.util;
/*
 *  335page => Collection => 데이터를 묶어서 관리를 할 수 있게 만든 클래스
 *             => 배열의 단점 보완 
 *  컬렉션 프레임워크 (프레임워크 => 표준화)
 *       -------> 모든 개발자가 동일한 형태로 소스코딩 
 *                소스의 통일화 목적 : Spring,MyBatis,JQuery
 *                                VueJS , ReactJS 
 *                일정 틀 => 쉽게 다른 개발자의 코딩을 분석 
 *       =완전 통일화 : 라이브러리 
 *   Collection : 데이터 그룹 , 다수의 데이터 => 모아서 관리
 *                ---------------------------------
 *                          |
 *                         배열,클래스
 *   배열 : 단점 => 고정적 (배열 크기를 정해 놓고 작업)
 *                증가 / 감소 => 새로운 배열을 만들어서 처리 
 *                ---------------------------------
 *                배열을 크기 만들면 => 메모리 누수현상
 *          |
 *         데이터 크기에 맞게 클래스를 제작 (가변형) => 최적화 
 *   => 컬렉션 : 가변형 
 *             => 디폴트 (10개) => 추가 (자동으로 10개...)
 *             => 저장 메모리를 결정하지 않는다 
 *   => 종류 
 *            Collection 
 *               |
 *         -----------------
 *         |               |      
 *        List           Set                 Map  ===> 인터페이스
 *         | 구현클래스      |                   |
 *                    ----------           --------------
 *                    |        |구현클래스    |             |
 *                   ***HashSet TreeSet   ***HashMap      Hashtable
 *    --------------------
 *    |          |       |              
 *  ***ArrayList   Vector  LinkedList
 *  (가장 많이 사용)
 *  
 *  List => ArrayList(비동기) => Vector를 보완  => 데이터베이스 연동 
 *          Vector(동기화) => 네트워크에서 주로 사용 
 *          LinkedList => C언어 호환 
 *  List list=new ArrayList()
 *  list = new Vector()
 *  list = new LinkedList()
 *  
 *  Set => HashSet => 중복없는 데이터 저장 
 *         TreeSet => 검색 
 *  Map => HashMap 
 *         Hashtable => 보완 HashMap
 *         
 *  ==> List
 *      1) 순서를 가지고 있다 (인덱스) ==> 0부터 시작 
 *      2) 저장된 데이터 중복을 허용 
 *      3) CURD 프로그램에 주로 사용 
 *         ----Create  Update Read Delete 
 *             저장      수정    읽기  삭제
 *             --------------------------
 *             Insert  Update Select Delete
 *      4) 비동기화 => 데이터베이스 프로그램 연동시 사용 
 *      5) 주요메소드 
 *         = 데이터 추가 : add(Object)
 *         = 데이터 삭제 : remove()
 *         = 데이터 수정 : set()
 *         = 데이터 읽기 : get()
 *         = 저장된 데이터 갯수 : size()
 *         = 전체 삭제 : clear()
 *         = 데이터 존재여부 확인 : isEmpty()
 *         = 오라클에서 데이터 읽어서 저장 (List)==> 브라우저전송 
 *      6) 구현하고 있는 클래스 
 *         ArrayList / Vector / LinkedList
 *      ----------------------------------------------
 *      Set 
 *      1) 순서가 없다 (인덱스번호가 없다) => forEach
 *      2) 데이터 중복을 허용하지 않는다 
 *      3) 주로 사용처 => List에 중복된 데이터를 제거 
 *         ------------------------ 코테
 *      4) 구현 클래스 : HashSet , TreeSet
 *      5) 주요메소드
 *         = 데이터 추가 : add(Object)
 *         = 데이터 삭제 : remove()
 *         = 데이터 수정 : set()
 *         = 데이터 읽기 : get()
 *         = 저장된 데이터 갯수 : size()
 *         = 전체 삭제 : clear()
 *         = 데이터 존재여부 확인 : isEmpty()
 *   --------------------------------------------------
 *   Map(웹에서 지원하는 모든 클래스는 Map형식을 가지고 있다)
 *       request , response , session, cookie 
 *       new Cookie(key,값)
 *                  ---
 *       => 사용자가 값 3개 
 *       request.setAttribute("id","hong") 
 *       request.setAttribute("pwd","hong") 
 *       request.setAttribute("sex","man") 
 *   => 키와 값을 쌍으로 저장 
 *   => 키는 중복을 허용하지 않는다 , 값은 중복이 가능 
 *      => 키가 동일할때는 덮어쓴다
 *   => 사용처 : 웹에서 주로 사용 (클래스관리, SQL관리시 많이 사용)
 *                          --------  ---------------
 *                           Spring     MyBatis
 *   => 구현된 클래스 : HashMap
 *   => 주요 메소드 
 *      => 저장 : put()
 *      => 읽기 : get(key)
 *   ---------------------
 *   프로젝트 
 *     1차 : 데이터베이스 사용법 (SQL) / JQuery(AJax) 
 *     2차 : Spring / String 라이브러리 / VueJS(Vuex)
 *                                          -------
 *                                          MVC
 *     3차 : 최신 기술(우대) : Spring-Boot / ReactJS(Redux)
 *                                              -------
 *                                               MVC
 *     웹 프로그램 
 *     --------
 *      Model 1
 *        => 간단한 사이트 : JSP => 2000년 
 *      Model 2(*****)
 *        => 큰 사이트 : MVC
 *        => 데이터관리 / 화면출력 
 *   
 */
public class 라이브러리_List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
