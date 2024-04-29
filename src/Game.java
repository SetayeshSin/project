import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Game{

    public JFrame frame;
    public Player player1;
    public Player player2;
    public Store store;
    public SlotMachine slotMachine;
    public JLabel label[]=new JLabel[6];
    public Game game;
    public int i;
    public String coinNumber;
    public int play=1;
    public static JPanel panel1;
    public static JPanel panel2;
    public static JPanel panelCoin1;
    public static JPanel panelCoin2;
    public static JPanel panelSpecialCoin1;
    public static JPanel panelSpecialCoin2;
    public static JPanel panelScore1;
    public static JPanel panelScore2;
    public static JPanel turnPanel;
    public Winner winner;
    public Game(){
        String name1=JOptionPane.showInputDialog(null,"please enter player1 name","player name",JOptionPane.PLAIN_MESSAGE);
        String name2=JOptionPane.showInputDialog(null,"please enter player2 name","player name",JOptionPane.PLAIN_MESSAGE);
        player1=new Player(name1);
        player2=new Player(name2);
        slotMachine=new SlotMachine(this,player1,player2);
        store=new Store(this,player1,player2,slotMachine);
        slotMachine.store=store;
        winner=new Winner(player1,player2);
        startGame(play);
        game=this;
    }
    public void setInformationPanel(JFrame Frame,Player player1,Player player2,int play){
        Frame.setLayout(null);
        turnPanel=new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponents(g);
                if(play==1){g.setColor(Color.RED);g.fillRect(0,0,300,50);}
                else if(play==2){g.setColor(Color.BLUE);g.fillRect(0,0,300,50);}
                g.setColor(Color.WHITE);
                if(play==1)g.drawString(player1.name+" Turn ",50,30);
                else if(play==2)g.drawString(player2.name+"  Turn ",50,30);
           }
        };
        turnPanel.setFont(new Font("Lucida Fax",Font.BOLD,30));
        turnPanel.setBounds(600,650,350,100);
        panel1=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponents(g);
                g.setColor(Color.RED);
                g.drawString(player1.name+" Score: "+player1.score,30,30);
            }
        };
        panel1.setFont(new Font("Lucida Fax",Font.BOLD,30));
        panel1.setBounds(1150,50,350,100);
        panelCoin1=new JPanel();
        panelCoin1.setBounds(1150,100,300,50);
        panelCoin1.setLayout(new GridLayout(1,6));
        for (i = 0; i < 6; i++) {
            coinNumber=String.valueOf(player1.coinList[i].count);
            coinPanel(i,coinNumber);
            panelCoin1.add(label[i]);
        }
        panelSpecialCoin1=new JPanel();
        panelSpecialCoin1.setBounds(1175,160,250,50);
        panelSpecialCoin1.setLayout(new GridLayout(1,5));
        for (i = 0; i < 5; i++) {
            coinNumber=String.valueOf(player1.specialCoinList[i].count);
            coinPanel(i,coinNumber);
            panelSpecialCoin1.add(label[i]);
        }
        panelScore1=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponents(g);
                g.setColor(Color.RED);
                g.drawString(" Card Count: "+player1.cardCount,30,30);
            }
        };
        panelScore1.setFont(new Font("Lucida Fax",Font.BOLD,30));
        panelScore1.setBounds(1150,220,350,100);
        panel2=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponents(g);
                g.setColor(Color.BLUE);
                g.drawString(player2.name+" Score: "+player2.score,30,30);
            }
        };
        panel2.setFont(new Font("Lucida Fax",Font.BOLD,30));
        panel2.setBounds(50,50,350,100);
        panelCoin2=new JPanel();
        panelCoin2.setBounds(50,100,300,50);
        panelCoin2.setLayout(new GridLayout(1,6));
        for (i = 0; i < 6; i++) {
            coinNumber=String.valueOf(player2.coinList[i].count);
            coinPanel(i,coinNumber);
            panelCoin2.add(label[i]);
        }
        panelSpecialCoin2=new JPanel();
        panelSpecialCoin2.setBounds(75,160,250,50);
        panelSpecialCoin2.setLayout(new GridLayout(1,5));
        for (i = 0; i < 5; i++) {
            coinNumber=String.valueOf(player2.specialCoinList[i].count);
            coinPanel(i,coinNumber);
            panelSpecialCoin2.add(label[i]);
        }
        panelScore2=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponents(g);
                g.setColor(Color.BLUE);
                g.drawString(" Card Count: "+player2.cardCount,30,30);
            }
        };
        panelScore2.setFont(new Font("Lucida Fax",Font.BOLD,30));
        panelScore2.setBounds(50,220,350,100);
        Frame.add(turnPanel);
        Frame.add(panel1);
        Frame.add(panel2);
        Frame.add(panelScore1);
        Frame.add(panelScore2);
        Frame.add(panelCoin1);
        Frame.add(panelCoin2);
        Frame.add(panelSpecialCoin1);
        Frame.add(panelSpecialCoin2);
        Frame.setVisible(true);
    }
    public void coinPanel(int i,String text){
        label[i] = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponents(g);
                Color goldColor=new Color(255,215,0);
                if (i == 0) g.setColor(Color.BLACK);
                else if (i == 1) g.setColor(Color.WHITE);
                else if (i == 2) g.setColor(Color.RED);
                else if (i == 3) g.setColor(Color.BLUE);
                else if (i == 4) g.setColor(Color.GREEN);
                else if (i == 5) g.setColor(goldColor);
                g.fillOval(0, 0, 50, 50);
                if(i==0)g.setColor(Color.WHITE);
                else g.setColor(Color.BLACK);
                g.drawString(text,20,30);
            }
        };
        label[i].setFont(new Font("Lucida Fax",Font.BOLD,18));
        label[i].setOpaque(true);
        label[i].setBackground(Color.WHITE);
        label[i].setHorizontalAlignment(SwingConstants.CENTER);
        label[i].setBorder(BorderFactory.createLineBorder(Color.WHITE));
    }
   public void startGame(int play) {
       this.play = play;
       frame = new JFrame();
       frame.setTitle("Amusement Park");
       frame.setSize(1600, 900);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JPanel backgroundPanel = new JPanel() {
           @Override
           protected void paintComponent(Graphics g) {
               super.paintComponent(g);
               ImageIcon backgroundIcon = new ImageIcon("C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\str.jpg");
               Image backgroundImage = backgroundIcon.getImage();
               g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
           }
       };
       frame.setContentPane(backgroundPanel);
       frame.setLayout(null);
           setInformationPanel(frame, player1, player2, play);
           JButton storeButton = new JButton();
           storeButton.setContentAreaFilled(false);
           storeButton.setBorderPainted(true);
           storeButton.setBounds(320, 400, 200, 200);
       if((player1.score < 15 || play == 2) && player2.score < 15) {
           storeButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   store.cardStore(play);
                   frame.dispose();
               }
           });
           JButton slotButton = new JButton();
           slotButton.setContentAreaFilled(false);
           slotButton.setBorderPainted(true);
           slotButton.setBounds(1250, 400, 200, 200);
           slotButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                       slotMachine.coinSlotMachine(play);
                       frame.dispose();
               }
           });
           frame.add(slotButton);
           frame.add(storeButton);
           frame.setVisible(true);
       }
       else{
           winner.winPanel();
           frame.dispose();
       }
   }
}
