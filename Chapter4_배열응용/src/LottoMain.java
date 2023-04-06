import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for(int i=1061;i>=100;i--)
			{
			  String s=String.valueOf(i);
			  if(s.length()==3)
				  s="0"+s;
			Document doc = Jsoup.connect("https://m.dhlottery.co.kr/qr.do?method=winQr&v="+s+"q021825303444q050812313445q060817202240q121623253641q0408092329440000002233").get();
			String content= doc.select("div.list span").text();
            int drwtNo1 = Integer.parseInt(content.split("\\s")[0]);
            int drwtNo2 = Integer.parseInt(content.split("\\s")[1]);
            int drwtNo3 = Integer.parseInt(content.split("\\s")[2]);
            int drwtNo4 = Integer.parseInt(content.split("\\s")[3]);
            int drwtNo5 = Integer.parseInt(content.split("\\s")[4]);
            int drwtNo6 = Integer.parseInt(content.split("\\s")[5]);
            int bnusNo = Integer.parseInt(content.split("\\s")[6]);
            System.out.println(drwtNo1+","+drwtNo2+","+drwtNo3+","+drwtNo4+","+drwtNo5+","+drwtNo6+",");	//당첨번호 + 보너스
			}
		}catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
		}
	}

}
