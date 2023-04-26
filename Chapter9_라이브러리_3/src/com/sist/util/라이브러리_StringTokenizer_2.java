package com.sist.util;

import java.util.StringTokenizer;

// 네트워크 
/*
 *       String s="red|green|blue|black|yellow";
 *       => split , StringTokenizer
 *       => StringTokenizer st=new StringTokenizer(s,"|")
 *          ----------------------------------------------
 *          String[] colors=s.split("|")
 *                   => 원형 : split(String regex)
 *          StringTokenizer st=new StringTokenizer(s,"|")
 *          
 *          hasMoreTokens
 *          1) cursor
 *          ----------------
 *        ->   before First
 *          ----------------
 *              red   => nextToken()
 *          ----------------
 *              green => nextToken()
 *          ----------------
 *              blue => nextToken()
 *          ----------------
 *              black => nextToken()
 *          ----------------
 *              yellow => nextToken()
 *          ----------------
 *            after Last => nextToken()=> false(읽기 종료)
 *          ----------------
 *          
 *          **** 갯수가 초과되면 에러 
 */
public class 라이브러리_StringTokenizer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="red|green";
		StringTokenizer st=new StringTokenizer(s,"|");
		/*System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());*/
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
