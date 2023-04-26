package com.sist.program;
// VO => DAO => 전송 => 관련된 데이터는 무조건 묶어서 보낸다 (VO)
import java.util.*;
import java.io.*;
public class SeoulSystem {
   private static SeoulLocationVO[] datas=new SeoulLocationVO[273];
   // 모든 사용자가 데이터를 공통으로 사용 
   private int curpage;// 프로그램 종료시까지 유지 
   private int totalpage;
   
   static
   {
	   // 데이터를 읽어서 메모리에저장 => 초기화 
	   try
	   {
		   StringBuffer sb=new StringBuffer();
		   int i=0;
		   FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
		   while((i=fr.read())!=-1)
		   {
			   sb.append(String.valueOf((char)i));
		   }
		   fr.close();
		   //System.out.println(sb.toString());
		   String[] locations=sb.toString().split("\n");
		   // 1|양화진외국인선교사묘원|양화진외국인선교사묘원은 서울 마포구 합정동에 위치한 외국인 선교사들의 공동묘지이다.|04084 서울 마포구 양화진길 46 (합정동, 양화진홍보관)
		   int k=0;
		   for(String s:locations)
		   {
			   //System.out.println(s);
			   StringTokenizer st=new StringTokenizer(s,"|");
			   datas[k]=new SeoulLocationVO();
			   datas[k].setNo(Integer.parseInt(st.nextToken()));
			   datas[k].setName(st.nextToken());
			   datas[k].setContent(st.nextToken());
			   datas[k].setAddress(st.nextToken());
			   k++;
		   }
	   }catch(Exception ex){}
   }
   // 페이지별 데이터 출력
   public SeoulLocationVO[] seoulList(int page)
   {
	   SeoulLocationVO[] data=
			   new SeoulLocationVO[10];
	   int j=0;// 10개씩 나눠주는 변수 
	   int rowSize=10;
	   int start=(page*rowSize)-rowSize; // 시작점 (for)
	   // (page-1)*rowSize
	   /*
	    *    1page => 0~9
	    *    2page => 10~19
	    *    3page => 20~29
	    *    ==.start=30
	    */
	   //int k=0;
	   //int j=0;
	   int bound=start+rowSize;
	   if(page==seoulTotalPage())
	   {
		   bound=start+(datas.length%10);
	   }
	   for(int i=start;i<bound;i++)
	   {
		   // 1page => 0~9
		   // 2page => 10~19
		   // 3page => 20 
		   //if(j<rowSize && i>=start)
		   //{
			   data[j]=datas[i];
			   //k++;
			   j++;
		   //}
	   }
	   
	   return data;
   }
   public int seoulTotalPage()
   {
	   return (int)(Math.ceil(datas.length/10.0));
	   //           --------------------------- 27.3 => 28
   }
   // 메뉴
   public int menu()
   {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("========== 메뉴 ==========");
	   System.out.println("1. 목록 출력(페이지별)");
	   System.out.println("2. 상세보기");
	   System.out.println("3. 명소검색");
	   System.out.println("4. 주소검색");
	   System.out.println("9. 종료");
	   System.out.println("=========================");
	   System.out.print("메뉴 선택:");
	   return scan.nextInt();
   }
   // 검색 => 이름 
   public SeoulLocationVO[] nameFind(String fd)
   {
	   int count=0;
	   for(SeoulLocationVO vo:datas)
	   {
		   if(vo.getName().contains(fd))
		   {
			   count++;
		   }
	   }
	   // 고정 => 가변 (Collection)
	   SeoulLocationVO[] seoul=new SeoulLocationVO[count];
	   int i=0;
	   for(SeoulLocationVO vo:datas)
	   {
		   if(vo.getName().contains(fd))
		   {
			   seoul[i]=vo;
			   i++;
		   }
		   
	   }
	   return seoul;
	   
   }
   // 주소 검색 
   public SeoulLocationVO[] addressFind(String addr)
   {
	   int count=0;
	   for(SeoulLocationVO vo:datas)
	   {
		   if(vo.getAddress().contains(addr))
		   {
			   count++;
		   }
	   }
	   // 고정 => 가변 (Collection)
	   SeoulLocationVO[] seoul=new SeoulLocationVO[count];
	   int i=0;
	   for(SeoulLocationVO vo:datas)
	   {
		   if(vo.getAddress().contains(addr))
		   {
			   seoul[i]=vo;
			   i++;
		   }
		   
	   }
	   return seoul;
	   
   }
   // 상세보기 
   public void process()
   {
	   System.out.println("★★★★★★★★★ SIST 영화 ★★★★★★★★★");
	   while(true)
	   {
		   int menu=menu();
		   if(menu==9)
		   {
			   System.out.println("프로그램 종료!!");
			   break;
		   }
		   else if(menu==3)
		   {
			   Scanner scan=new Scanner(System.in);
			   System.out.print("검색어 입력:");
			   String name=scan.next();
			   SeoulLocationVO[] data=nameFind(name);
			   System.out.println(name+" 검색은 총 "+data.length+"건입니다");
			   for(SeoulLocationVO vo:data)
			   {
				   System.out.println(vo.getNo()+"."+vo.getName());
			   }
		   }
		   else if(menu==4)
		   {
			   Scanner scan=new Scanner(System.in);
			   System.out.print("주소 입력:");
			   String name=scan.next();
			   SeoulLocationVO[] data=addressFind(name);
			   System.out.println(name+" 검색은 총 "+data.length+"건입니다");
			   for(SeoulLocationVO vo:data)
			   {
				   System.out.println(vo.getNo()+"."+vo.getName());
			   }
		   }
		   else if(menu==1)
		   {
			   Scanner scan=new Scanner(System.in);
			   while(true)
			   {
			     System.out.print("페이지 입력(1~28):");
			     curpage=scan.nextInt();
			     if(curpage<1 || curpage>28)
			     {
			    	 System.out.println("없는 페이지입니다");
			    	 continue;
			     }
			     break;
			   }
			   totalpage=seoulTotalPage();
			   System.out.println(curpage+" page / "+totalpage+" pages");
			   SeoulLocationVO[] data=seoulList(curpage);
			   for(SeoulLocationVO vo:data)
			   {
				   if(vo!=null)
				   {
				     System.out.println(vo.getNo()+"."+vo.getName());
				   }
			   }
			   
		   }
		   else if(menu==2)
		   {
			   Scanner scan=new Scanner(System.in);
			   System.out.print("상세볼 명소번호 입력(1~273):");
			   int no=scan.nextInt();
			   System.out.println("번호:"+datas[no-1].getNo());
			   System.out.println("명소:"+datas[no-1].getName());
			   System.out.println("주소:"+datas[no-1].getAddress());
			   System.out.println("소개:"+datas[no-1].getContent());
		   }
	   }
   }
   /*public static void main(String[] args) {
	  SeoulSystem ss=new SeoulSystem();
	  for(SeoulLocationVO vo:datas)
	  {
		  System.out.println(vo.getNo());
		  System.out.println(vo.getName());
		  System.out.println(vo.getAddress());
		  System.out.println("============================");
	  }
   }*/
}
