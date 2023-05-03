package com.sist.io2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 *   <div class="thumb_item">aaa</div>
                                <div class="poster_movie">
                                        <img src="https://img1.daumcdn.net/thumb/C408x596/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F91333bbb7eef82397a826d95f9a5f5bc1c205837" class="img_thumb" alt="롱디">
     <strong class="tit_item">
                                    <a href="/moviedb/main?movieId=151324" class="link_txt" data-tiara-layer="moviename">롱디</a>
                                </strong>
                                
                                 <div class="poster_movie">
                                    <span class="rank_num">10</span>
 */
public class MovieManager {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try
		{
           Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
           Elements img=doc.select("div.thumb_item img.img_thumb");//0~18
           Elements title=doc.select("div.thumb_cont strong.tit_item a.link_txt");
           Elements rank=doc.select("div.poster_movie span.rank_num");
           //System.out.println(img.toString());
           img.add(10,new Element("<img src=\"없음\">"));
           for(int i=0;i<title.size();i++)
           {
        	   try
        	   {
        		    ;
        		    String poster=img.get(i).attr("src");
        		    
	        	    String r=rank.get(i).text();
	        	    //System.out.println(r);
		    		String name=title.get(i).text();
		    		System.out.println(name+" "+poster+" "+(i+1));
	        	  
        	   }catch(Exception ex){}
        	  
        	   
           }
		}catch(Exception ex){}
	}

}
