import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{
    Image back,air;
    int x=600,y=100;
    public GameView()
    {
    	back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
    	air=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\1plane.png");
    }
    public void paint(Graphics g)
    {
    	g.drawImage(back,0,0,getWidth(),getHeight(),this );
    	g.drawImage(air,x,y,150,120,this );
    }
}
