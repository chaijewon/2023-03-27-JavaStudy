package com.sist.io2;
import java.awt.*;
import javax.swing.*;
public class MyWebView extends JFrame{
    JEditorPane p=new JEditorPane();
    public MyWebView()
    {
    	//p.setOpaque(true);
    	p.setEditable(false);
    	p.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));
    	p.setContentType("text/html");
    	p.setText("<html><body><center><h1>동영상</h1>"
    			+ "<embed src=\"https://www.youtube.com/embed/r572qh2__-U/u0026pp=ygUGS2l0c2No\" width=300 height=350>"
    			+"</embed>"
    			+"</center>"
    			+"</body>"
    			+"</html>");
    	add("Center",p);
    	setSize(450,500);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MyWebView();
	}

}
