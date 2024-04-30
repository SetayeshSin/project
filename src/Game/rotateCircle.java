package Game;
import Coin.*;
import Card.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;

public class rotateCircle extends JPanel implements ActionListener {
    private double angle=0;
    private static final int diameter=300;
    private Image backgroundImage;
    public rotateCircle() {
        ImageIcon backgroundIcon = new ImageIcon("C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\fu.png");
        backgroundImage = backgroundIcon.getImage();
        Timer timer = new Timer(10, this);
        timer.start();
    }
        @Override
        protected void paintComponent (Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            int xCenter=getWidth()/2;
            int yCenter=getHeight()/2;
            int x=xCenter-(diameter/2);
            int y=yCenter-(diameter/2);
            AffineTransform old=g2d.getTransform();
            g2d.rotate(Math.toRadians(angle),xCenter,yCenter);
            Shape clip=new Ellipse2D.Float(x,y,diameter,diameter);
            g2d.clip(clip);
            g2d.drawImage(backgroundImage,x,y,diameter,diameter,this);
            g2d.setClip(null);
            g2d.setTransform(old);
            angle+=0.3;
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
