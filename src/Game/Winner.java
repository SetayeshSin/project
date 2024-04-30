package Game;
import Coin.*;
import Card.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Winner {
    private int win;
    public Player player;
    public Player player1;
    public Player player2;
    public JFrame winFrame;
    public JPanel winPanel;
    public Winner(Player player1,Player player2){
        this.player1=player1;
        this.player2=player2;
    }
    public void checkWin(){
        if (player1.score == player2.score) {
            if (player1.cardCount < player2.cardCount){win=1;player=player1;}
            else if (player1.cardCount > player2.cardCount){win=2;player=player2;}
            else {win=0;}
        } else if (player1.score > player2.score) {win=1;player=player1;}
        else {win=2;player=player2;}
    }
    public void winPanel(){
        checkWin();
        winFrame=new JFrame();
        winFrame.setTitle("Win");
        winFrame.setSize(1600, 900);
        winFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel backgroundPanel=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundIcon = new ImageIcon("C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\winPage.jpeg");
                Image backgroundImage = backgroundIcon.getImage();
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        winFrame.setContentPane(backgroundPanel);
        winFrame.setLayout(null);
        winPanel=new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponents(g);
                if(win==1){g.setColor(Color.RED);g.fillRect(0,0,400,50);}
                else if(win==2){g.setColor(Color.BLUE);g.fillRect(0,0,400,50);}
                else if(win==0){g.setColor(Color.BLACK);g.fillRect(0,0,400,50);}
                g.setColor(Color.WHITE);
                if(win==0)g.drawString(" GAME EQUALISED!!! ",50,30);
                else g.drawString(player.name+" is WINNER!!!",50,30);
            }
        };
        winPanel.setFont(new Font("Lucida Fax",Font.BOLD,30));
        winPanel.setBounds(575,560,400,100);
        winFrame.add(winPanel);
        JButton newButton=new JButton("new Game");
        newButton.setContentAreaFilled(false);
        newButton.setBorderPainted(true);
        Font font=new Font("Lucida Fax",Font.BOLD,22);
        newButton.setFont(font);
        newButton.setBounds(675,670,200,80);
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start start=new Start();
            }
        });
        winFrame.add(newButton);
        winFrame.setVisible(true);
    }
}
