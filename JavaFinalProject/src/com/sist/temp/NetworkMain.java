package com.sist.temp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.GenieMusicVO;
import com.sist.manager.MusicSystem;
import java.util.*;
/////////////// 네트워크 관련 ///////////////////
import java.util.List;
import java.io.*;
import java.net.*;
/*
 *   프로그램 => 2개 
 *   1) 로그인 , 채팅문자열 입력 ... 일반 사용자 
 *   2) 서버에서 전송되는 데이터를 출력 
 *      ----------------------- 쓰레드 
 */
public class NetworkMain extends JFrame 
implements ActionListener,Runnable{
    MenuPanel mp;
    ControlPanel cp;
    TopPanel tp;
    JButton b1,b2,b3,b4,b5;
    JLabel logo;
    Login login=new Login();
    // 페이지 지정 
    int curpage=1;
    int totalpage=0;
    MusicSystem ms=new MusicSystem();
    /// 네트워크 관련 클래스 
    // 서버연결 => 연결기기 
    Socket s; // 서버의 메모리 연결 
    // 서버에서 보내준 값을 받는다 
    BufferedReader in;
    // 서버로 값을 전송 
    OutputStream out;
    public NetworkMain()
    {
    	logo=new JLabel();
    	Image img=ImageChange.getImage(
    			new ImageIcon("c:\\javaDev\\log.png"), 200, 130);
    	
    	logo.setIcon(new ImageIcon(img));
    	mp=new MenuPanel();
    	cp=new ControlPanel();
    	tp=new TopPanel();
    	
    	setLayout(null);//Layout없이 직접 배치
    	logo.setBounds(10, 15, 200, 130);
    	mp.setBounds(10, 150, 200, 300);
    	cp.setBounds(220,15, 750, 780);
    	tp.setBounds(980, 15, 250, 730);
    	
    	b1=new JButton("홈");
    	b2=new JButton("뮤직검색");
    	b3=new JButton("채팅");
    	b4=new JButton("뉴스검색");
    	b5=new JButton("뮤직추천");
    	mp.setLayout(new GridLayout(5,1,10,10));
    	mp.add(b1);
    	mp.add(b2);
    	mp.add(b3);
    	mp.add(b4);
    	mp.add(b5);
    	// 추가
    	add(mp);
    	add(cp);
    	add(tp);
    	add(logo);
    	
    	
    	// 윈도우 크기
    	setSize(1200, 800);
    	//setVisible(true);
    	// 종료
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setTitle("네트워크 뮤직 프로그램");
    	// 이벤트 등록 
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	b4.addActionListener(this);
    	b5.addActionListener(this);
    	// 로그인
    	login.b1.addActionListener(this);
    	login.b2.addActionListener(this);
    	// 채팅 
    	cp.cp.tf.addActionListener(this);
    	// HomePage
    	List<GenieMusicVO> list=ms.musicListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		totalpage=ms.musicTotalPage();
		// 여러번 => 동작을 여러번 수행 
		cp.hp.b1.addActionListener(this);// 이전
    	cp.hp.b2.addActionListener(this);// 다음
    	cp.hp.pageLa.setText(curpage+" page /"
                + totalpage+" pages");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
			UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");X
			// BernsteinLookAndFeel  
			//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");// X
		}catch(Exception ex){ex.printStackTrace();}
        new NetworkMain();
	}
	// 버튼 처리 
	public void musicDisplay()
	{
		
		List<GenieMusicVO> list=ms.musicListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		totalpage=ms.musicTotalPage();
		cp.hp.pageLa.setText(curpage+" page /"
		                  + totalpage+" pages");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			curpage=1;
			musicDisplay();
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "find");
		}
		else if(e.getSource()==b3)
		{
			cp.card.show(cp, "chat");
		}
		else if(e.getSource()==b4)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==b5)
		{
			cp.card.show(cp, "recomm");
		}
		else if(e.getSource()==login.b1)
		{
			// 로그인 데이터 읽기
			String id=login.tf1.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, 
						"ID를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String name=login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, 
						"이름을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			String sex="남자";
			if(login.rb1.isSelected())// 남자 라디오버튼이 선택 
			{
				sex="남자";
			}
			else
			{
				sex="여자";
			}
			
			// 서버로 전송 
			try
			{
				// 서버 연결 
				s=new Socket("localhost",3355);
				// 서버 컴퓨터 => IP 
				// 211.238.142.()
				// 읽는 위치 / 쓰는 위치
				in=new BufferedReader(
						new InputStreamReader(s.getInputStream()));
				// s는 서버 메모리 => 서버메모리로부터 값을 읽어 온다 
				out=s.getOutputStream(); 
				// 서버에서 읽어 갈 수 있게 메모리에 저장 
				
				// 서버로 로그인 요청 
				out.write((Function.LOGIN+"|"
						+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex) {}
			// 서버로부터 전송된 값을 받아 온다 
			new Thread(this).start();// run()호출 
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0); // 프로그램 종료
		}
		else if(e.getSource()==cp.cp.tf)
		{
			
			String msg=cp.cp.tf.getText();
			String color=cp.cp.box.getSelectedItem().toString();
			if(msg.length()<1) return;
			
			// 서버로 전송 
			try
			{
				out.write((Function.CHAT+"|"
						+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex){}
			
			cp.cp.tf.setText("");
		}
		else if(e.getSource()==cp.hp.b1)
		{
			if(curpage>1)
			{
				curpage--;
				musicDisplay();
			}
		}
		else if(e.getSource()==cp.hp.b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				musicDisplay();
			}
		}
		
	}
	// 서버에서 결과값을 받아서 출력 => 쓰레드 (자동화) 
	// member.jsp?id=aaa&pwd=1234&name=홍길동 
	//   100
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();
				// 서버에서 보낸값 
				StringTokenizer st=
						new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				// 100|id|name|sex
				switch(protocol)
				{
				  // 서버에서 로그인이 들어온 경우
				  // LOGIN=> 테이블에 정보를 출력한다 
				  case Function.LOGIN:
				  {
					  String[] data= {
							  st.nextToken(),//ID
							  st.nextToken(),//name
							  st.nextToken()//sex
					  };
					  cp.cp.model.addRow(data);
				  }
				  // C/S => 모든 명령이 서버로부터 받아서 처리 
				  // MYLOG => 로그인 종료하고 메인창을 보여준다 
				  break;
				  case Function.MYLOG:
				  {
					  setTitle(st.nextToken());
					  login.setVisible(false);
					  setVisible(true);
				  }
				  break;
				  case Function.CHAT:
				  {
					  cp.cp.initStyle();
					  cp.cp.append(st.nextToken(),st.nextToken());
					  //           채팅문자열          색상 
				  }
				  break;
				}
			}
		}catch(Exception ex){}
	}

}
