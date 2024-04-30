package Game;
import Card.*;
import Coin.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Start {
    public JFrame Frame;
    public Start() {
        Frame = new JFrame();
        Frame.setTitle("Amusement Park");
        Frame.setSize(1600, 900);
        Frame.setLocationRelativeTo(null);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundIcon = new ImageIcon("C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\gm.jpg");
                Image backgroundImage = backgroundIcon.getImage();
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        Frame.setContentPane(backgroundPanel);
        Frame.setLayout(null);
        JButton startButton = new JButton("start");
        Font font = new Font("Lucida Fax", Font.BOLD, 20);
        startButton.setFont(font);
        startButton.setBounds(710, 375, 130, 50);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game game = new Game();
                game.frame.setVisible(true);
                Frame.dispose();
            }
        });
        rotateCircle rotate=new rotateCircle();
        rotate.setBounds(625,250,300,300);
        rotate.setOpaque(false);
        Frame.add(startButton);
        Frame.add(rotate);
        Frame.setVisible(true);
    }

}
