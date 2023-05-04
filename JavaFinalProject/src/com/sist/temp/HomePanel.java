package com.sist.temp;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.net.URI;
import java.net.URL;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sist.common.ImageChange;
import com.sist.manager.GenieMusicVO;
import com.sist.manager.MusicSystem;
import java.awt.event.*;

public class HomePanel extends JPanel{
   JPanel pan=new JPanel();
   MusicSystem ms=new MusicSystem();
   int curpage=1;
   int totalpage=0;
   JLabel pageLa;
   JButton b1,b2;
   public HomePanel()
   {
	   setLayout(null);
	   pan.setLayout(new GridLayout(2,5,5,5));
	   pageLa=new JLabel("0 page / 0 pages");
	   b1=new JButton("이전");
	   b2=new JButton("다음");
	   JPanel p=new JPanel();
	   p.add(b1);
	   p.add(pageLa);
	   p.add(b2);
	   p.setBounds(10,525, 700, 35);
	   pan.setBounds(10, 15, 700, 500);
	   add(p);
	   add(pan);
	   musicData();
	   
   }
   public void musicData()
   {
	   List<GenieMusicVO> list=ms.musicListData(curpage);
	   try
	   {
		   //pan.removeAll();
		   //pan.setLayout(new GridLayout(2,5,5,5));
		   //pan.invalidate();
		   for(GenieMusicVO vo:list)
		   {
			   
			   URL url=new URL("http:"+vo.getPoster());
			   Image img=ImageChange.getImage(new ImageIcon(url), 
					   140, 250);
			   pan.add(new JLabel(new ImageIcon(img)));
		   }
		   totalpage=ms.musicTotalPage();
		   pageLa.setText(curpage+" page / "+totalpage+" pages");
	   }catch(Exception ex) {ex.printStackTrace();}
   }
	
}
