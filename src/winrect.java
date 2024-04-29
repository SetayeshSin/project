import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
public class winrect extends JPanel implements ActionListener {
    private int y=0;
    private int x=0;
    private int number=1;
    public winrect(){
        Timer timer=new Timer(10,this);
        timer.start();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        if(number<150||number>250)g.fillRect(50,y,30,15);
        else if(number>149&&number<251)g.fillRect(100,y,30,15);
        number++;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        y+=1;
        if(y>getHeight())y=0;
        repaint();
    }
}
