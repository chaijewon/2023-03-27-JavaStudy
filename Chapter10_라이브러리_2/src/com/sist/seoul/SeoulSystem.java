package com.sist.seoul;
import java.util.*;
import java.io.*;
public class SeoulSystem {
    private static ArrayList list=new ArrayList();
    static
    {
    	try
    	{
    		// 파일 읽기 
    		FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
    		int i=0; // 한글자 읽기 => A => 65
    		StringBuffer sb=new StringBuffer();
    		while((i=fr.read())!=-1)//-1 EOF
    		{
    			sb.append((char)i);
    		}
    		fr.close();
    		//System.out.println(sb.toString());
    		String[] seoul=sb.toString().split("\n");
    		/*  
    		 *  1 => st.nextToken()
			 *  |쇼생크 탈출 st.nextToken()
			 *  |드라마
			 *  |https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2
			 *  |팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)
			 *  |2016 .02.24 재개봉, 1995 .01.28 개봉
			 *  |15세 관람가
			 *  |프랭크 다라본트
    		 */
    		for(String s:seoul)
    		{
    			StringTokenizer st=
    					new StringTokenizer(s,"|");
    			SeoulLocationVO vo=new SeoulLocationVO();
    			vo.setNo(Integer.parseInt(st.nextToken()));
    			vo.setName(st.nextToken());
    			vo.setContent(st.nextToken());
    			vo.setAddress(st.nextToken());
    			list.add(vo);
    		}
    		for(Object obj:list)
    		{
    			SeoulLocationVO vo=(SeoulLocationVO)obj;
    			System.out.println(vo.toString());
    		}
    		//System.out.println(list.toString());
    	}catch(Exception ex){}
    }
    /*public static void main(String[] args) {
		MovieSystem ms=new MovieSystem();
	}*/
    // menu
    public int seoulMenu()
    {
    	System.out.println("====== 서울 여행 메뉴 ======");
    	System.out.println("1.목록 출력");
    	System.out.println("2.상세 보기");
    	System.out.println("3.명소 검색");
    	System.out.println("9.시스템 종료");
    	System.out.println("=====================");
    	Scanner scan=new Scanner(System.in);
    	System.out.print("메뉴 선택:");
    	return scan.nextInt();
    }
    // 목록 출력 (페이지)
    public ArrayList seoulListData(int page)
    {
    	
    	int totalpage=(int)(Math.ceil(list.size()/10.0));
    	// size()=1938  1938/10.0   193.8 ==> 194 => 193
    	int start=(page-1)*10;
    	// 0,10 20....
    	int end=page*10;
    	// 0~10 , 10~20 , 20~30 ... subList(s,e-1)
    	if(page==totalpage)
    	{
    		// 194 ==> 194*10 => 1940-(10-8) ==> 1938
    		end=(page*10)-(10-list.size()%10);
    	}
    	ArrayList seoulList=new ArrayList(list.subList(start, end));
    	return seoulList;
    }
    // 상세보기 
    public SeoulLocationVO seoulDetailData(int no)
    {
    	return (SeoulLocationVO)list.get(no-1);
    }
    // 영화 검색 
    // 조립 
    public void process()
    {
    	while(true)
    	{
    		int menu=seoulMenu();
    		if(menu==9)
    		{
    			System.out.println("프로그램 종료");
    			break;
    		}
    		else if(menu==1)
    		{
    			Scanner scan=new Scanner(System.in);
    			System.out.print("페이지 입력:");
    			int page=scan.nextInt();
    			ArrayList mList=seoulListData(page);
    			for(int i=0;i<mList.size();i++)
    			{
    				SeoulLocationVO vo=(SeoulLocationVO)mList.get(i);
    				System.out.println(vo.getNo()+"."
    						+vo.getName());
    			}
    		}
    		else if(menu==2)
    		{
    			Scanner scan=new Scanner(System.in);
    			System.out.print("상세볼 명소번호 입력(1~273):");
    			int no=scan.nextInt();
    			SeoulLocationVO vo=seoulDetailData(no);
    			System.out.println("===== 상세 보기 ======");
    			System.out.println("번호:"+vo.getNo());
    			System.out.println("명소명:"+vo.getName());
    			System.out.println("소개:"+vo.getContent());
    			System.out.println("주소:"+vo.getAddress());
    			
    		}
    	}
    }
}





