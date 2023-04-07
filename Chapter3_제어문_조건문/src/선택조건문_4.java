import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.Scanner;
//BBdC1rl5sKY
public class 선택조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	//Scanner scan=new Scanner(System.in);
        	//System.out.print("검색어 입력:");
        	//String fd=scan.next();
        	String ss="{";
        for(int j=1;j<=4;j++)
        {
        	Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20230407&hh=10&rtm=Y&pg="+j).get();
        	Elements title=doc.select("tr.list a.title");
        	Elements singer=doc.select("tr.list a.artist");
        	
        	for(int i=0;i<title.size();i++)
        	{
        		
        		//System.out.println("'"+title.get(i).text()+"',");
        		ss+="'"+singer.get(i).text()+"',";
        	}
        	
        	
        	/*Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
        			                  +"http://youtube.com/embed/BBdC1rl5sKY");*/
         } 
        ss+="}";
          System.out.println(ss);
        }catch(Exception ex) {}
	}

}
