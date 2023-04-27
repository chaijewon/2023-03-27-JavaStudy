package com.sist.movie;
import java.util.*;
import java.io.*;
public class MovieSystem {
    private static ArrayList list=new ArrayList();
    static
    {
    	try
    	{
    		// 파일 읽기 
    		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
    		int i=0; // 한글자 읽기 => A => 65
    		StringBuffer sb=new StringBuffer();
    		while((i=fr.read())!=-1)//-1 EOF
    		{
    			sb.append((char)i);
    		}
    		fr.close();
    		//System.out.println(sb.toString());
    		String[] movies=sb.toString().split("\n");
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
    		for(String m:movies)
    		{
    			StringTokenizer st=
    					new StringTokenizer(m,"|");
    			MovieVO vo=new MovieVO();
    			vo.setNo(Integer.parseInt(st.nextToken()));
    			vo.setTitle(st.nextToken());
    			vo.setGenre(st.nextToken());
    			vo.setPoster(st.nextToken());
    			vo.setActor(st.nextToken());
    			vo.setRegdate(st.nextToken());
    			vo.setGrade(st.nextToken());
    			vo.setDirector(st.nextToken());
    			list.add(vo);
    		}
    	}catch(Exception ex){}
    }
    /*public static void main(String[] args) {
		MovieSystem ms=new MovieSystem();
	}*/
    // menu
    public int movieMenu()
    {
    	System.out.println("====== 영화 메뉴 ======");
    	System.out.println("1.목록 출력");
    	System.out.println("2.상세 보기");
    	System.out.println("3.영화 검색");
    	System.out.println("9.시스템 종료");
    	System.out.println("=====================");
    	Scanner scan=new Scanner(System.in);
    	System.out.print("메뉴 선택:");
    	return scan.nextInt();
    }
    // 목록 출력 (페이지)
    public ArrayList movieListData(int page)
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
    	ArrayList movieList=new ArrayList(list.subList(start, end));
    	return movieList;
    }
    // 상세보기 
    public MovieVO movieDetailData(int no)
    {
    	return (MovieVO)list.get(no-1);
    }
    // 영화 검색 
    // 조립 
    public void process()
    {
    	while(true)
    	{
    		int menu=movieMenu();
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
    			ArrayList mList=movieListData(page);
    			for(int i=0;i<mList.size();i++)
    			{
    				MovieVO vo=(MovieVO)mList.get(i);
    				System.out.println(vo.getNo()+"."
    						+vo.getTitle());
    			}
    		}
    		else if(menu==2)
    		{
    			Scanner scan=new Scanner(System.in);
    			System.out.print("상세볼 영화번호 입력(1~1938):");
    			int no=scan.nextInt();
    			MovieVO vo=movieDetailData(no);
    			System.out.println("===== 상세 보기 ======");
    			System.out.println("순위:"+vo.getNo());
    			System.out.println("영화명:"+vo.getTitle());
    			System.out.println("감독:"+vo.getDirector());
    			System.out.println("출연:"+vo.getActor());
    			System.out.println("장르:"+vo.getGenre());
    			System.out.println("개봉일:"+vo.getRegdate());
    		}
    	}
    }
}





