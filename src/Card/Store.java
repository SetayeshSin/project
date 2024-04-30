package Card;
import Coin.*;
import Game.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Store{
    public JFrame frame;
    public Card[] level1StoreCardList=new Card[15];
    public Card[] level2StoreCardList=new Card[15];
    public Card[] level3StoreCardList=new Card[15];
    public int level1StoreCardCount=15;
    public int level2StoreCardCount=15;
    public int level3StoreCardCount=15;
    public Card[] level1BoardCardList=new Card[4];
    public Card[] level2BoardCardList=new Card[4];
    public Card[] level3BoardCardList=new Card[4];
    public PrizeClaw[] boardPrizeClawList=new PrizeClaw[3];
    public int[] buyCheck=new int[5];
    public Coin goldenCoin=new Coin(5,5);
    public Player player;
    public Player player1;
    public Player player2;
    public Game game;
    public SlotMachine slotMachine;
    public Icon buttonIcon;
    public Icon labelIcon;
    public int play;
    public int[] priceList=new int[5];
    public Store(Game game,Player player1,Player player2,SlotMachine slotMachine){
        this.game=game;
        this.player1=player1;
        this.player2=player2;
        this.slotMachine=slotMachine;
        setLevel1StoreCard();
        setLevel2StoreCard();
        setLevel3StoreCard();
        setBoardPrizeClawList();
        int i=0;
        while(i<4) {
            setRandomLevel1BoardCard(i);
            setRandomLevel2BoardCard(i);
            setRandomLevel3BoardCard(i);
            i++;
        }
    }
    public void setLevel1StoreCard(){
        int level=1;
        level1StoreCardList[0]=new Card(level,1,"black",0,0,3,2,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\1.jpg");
        level1StoreCardList[1]=new Card(level,1,"black",3,0,0,0,2,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\2.jpg");
        level1StoreCardList[2]=new Card(level,1,"green",0,3,0,2,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\3.jpg");
        level1StoreCardList[3]=new Card(level,0,"blue",0,0,2,0,2,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\4.jpg");
        level1StoreCardList[4]=new Card(level,0,"red",0,2,0,0,2,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\5.jpg");
        level1StoreCardList[5]=new Card(level,1,"red",3,2,0,0,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\6.jpg");
        level1StoreCardList[6]=new Card(level,1,"blue",0,0,1,3,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\7.jpg");
        level1StoreCardList[7]=new Card(level,1,"white",2,0,0,0,2,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\8.jpg");
        level1StoreCardList[8]=new Card(level,1,"red",2,1,2,0,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\9.jpg");
        level1StoreCardList[9]=new Card(level,1,"green",2,0,0,3,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\10.jpg");
        level1StoreCardList[10]=new Card(level,1,"blue",0,3,0,0,2,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\11.jpg");
        level1StoreCardList[11]=new Card(level,0,"red",0,0,0,2,2,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\12.jpg");
        level1StoreCardList[12]=new Card(level,0,"green",0,2,2,0,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\13.jpg");
        level1StoreCardList[13]=new Card(level,1,"white",3,0,3,0,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\14.jpg");
        level1StoreCardList[14]=new Card(level,1,"black",0,2,0,2,2,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level1\\15.jpg");
    }
    public void setLevel2StoreCard(){
        int level=2;
        level2StoreCardList[0]=new Card(level,2,"green",1,3,2,0,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\1.jpg");
        level2StoreCardList[1]=new Card(level,3,"green",0,3,0,4,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\2.jpg");
        level2StoreCardList[2]=new Card(level,3,"black",0,2,2,0,3,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\3.jpg");
        level2StoreCardList[3]=new Card(level,4,"white",3,0,0,2,3,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\4.jpg");
        level2StoreCardList[4]=new Card(level,4,"blue",3,0,2,2,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\5.jpg");
        level2StoreCardList[5]=new Card(level,3,"red",0,2,2,0,2,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\6.jpg");
        level2StoreCardList[6]=new Card(level,4,"green",4,0,4,0,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\7.jpg");
        level2StoreCardList[7]=new Card(level,3,"black",0,3,0,2,2,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\8.jpg");
        level2StoreCardList[8]=new Card(level,4,"red",3,2,0,3,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\9.jpg");
        level2StoreCardList[9]=new Card(level,3,"black",0,2,0,1,3,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\10.jpg");
        level2StoreCardList[10]=new Card(level,2,"white",0,0,0,3,3,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\11.jpg");
        level2StoreCardList[11]=new Card(level,3,"blue",2,3,2,0,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\12.jpg");
        level2StoreCardList[12]=new Card(level,2,"red",1,0,2,3,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\13.jpg");
        level2StoreCardList[13]=new Card(level,4,"white",1,3,0,0,4,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\14.jpg");
        level2StoreCardList[14]=new Card(level,3,"blue",3,0,3,0,1,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level2\\15.jpg");
    }
    public void setLevel3StoreCard(){
        int level=3;
        level3StoreCardList[0]=new Card(level,4,"white",0,0,5,2,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\1.jpg");
        level3StoreCardList[1]=new Card(level,5,"red",5,1,0,2,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\2.jpg");
        level3StoreCardList[2]=new Card(level,5,"black",0,3,0,1,5,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\3.jpg");
        level3StoreCardList[3]=new Card(level,4,"blue",0,3,3,0,2,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\4.jpg");
        level3StoreCardList[4]=new Card(level,4,"green",3,0,0,4,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\5.jpg");
        level3StoreCardList[5]=new Card(level,5,"blue",3,3,0,0,3,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\6.jpg");
        level3StoreCardList[6]=new Card(level,5,"white",1,0,4,0,4,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\7.jpg");
        level3StoreCardList[7]=new Card(level,4,"black",0,3,0,4,1,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\8.jpg");
        level3StoreCardList[8]=new Card(level,4,"red",3,0,1,3,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\9.jpg");
        level3StoreCardList[9]=new Card(level,5,"green",0,4,3,0,3,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\10.jpg");
        level3StoreCardList[10]=new Card(level,3,"blue",1,0,3,0,3,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\11.jpg");
        level3StoreCardList[11]=new Card(level,3,"red",3,3,0,2,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\12.jpg");
        level3StoreCardList[12]=new Card(level,3,"white",0,0,0,4,3,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\13.jpg");
        level3StoreCardList[13]=new Card(level,4,"black",0,2,3,3,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\14.jpg");
        level3StoreCardList[14]=new Card(level,5,"green",3,3,0,0,4,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\level3\\15.jpg");
    }
    public void setRandomLevel1BoardCard(int Number){
        Random random=new Random();
        if(level1StoreCardCount==0)level1BoardCardList[Number]=null;
        else {
            int r = random.nextInt(0, level1StoreCardCount);
            level1BoardCardList[Number] = level1StoreCardList[r];
            int i = r;
            while (i < level1StoreCardCount - 1) {
                level1StoreCardList[i] = level1StoreCardList[i + 1];
                i++;
            }
            level1StoreCardList[i] = null;
            level1StoreCardCount--;
        }
    }
    public void setRandomLevel2BoardCard(int Number){
         Random random=new Random();
        if(level2StoreCardCount==0)level2BoardCardList[Number]=null;
         else {
            int r = random.nextInt(0, level2StoreCardCount);
            level2BoardCardList[Number] = level2StoreCardList[r];
            int i = r;
            while (i < level2StoreCardCount - 1) {
                level2StoreCardList[i] = level2StoreCardList[i + 1];
                i++;
            }
            level2StoreCardList[i] = null;
            level2StoreCardCount--;
        }
    }
    public void setRandomLevel3BoardCard(int Number){
         Random random=new Random();
        if(level3StoreCardCount==0)level3BoardCardList[Number]=null;
         else {
            int r = random.nextInt(0, level3StoreCardCount);
            level3BoardCardList[Number] = level3StoreCardList[r];
            int i = r;
            while (i < level3StoreCardCount - 1) {
                level3StoreCardList[i] = level3StoreCardList[i + 1];
                i++;
            }
            level3StoreCardList[i] = null;
            level3StoreCardCount--;
        }
    }
    public void setBoardPrizeClawList(){
        boardPrizeClawList[0]=new PrizeClaw(4,5,0,4,0,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\pr1.jpg");
        boardPrizeClawList[1]=new PrizeClaw(4,0,6,0,5,0,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\pr2.jpg");
        boardPrizeClawList[2]=new PrizeClaw(5,0,0,4,0,4,"C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\pr3.jpg");
    }
    public boolean checkBuyCard(int level,int position){
        int i=0;
        int x=player.coinList[5].count;
        while(i<5){
           if(level==1)priceList[i]=level1BoardCardList[position].coinList[i].count;
           else if(level==2)priceList[i]=level2BoardCardList[position].coinList[i].count;
           else if(level==3)priceList[i]=level3BoardCardList[position].coinList[i].count;
           else if(level==0)priceList[i]=player.reserveList[position].coinList[i].count;
            if(priceList[i]-player.specialCoinList[i].count<=0){priceList[i]=player.specialCoinList[i].count-priceList[i];buyCheck[i]=1;}
            else{
                priceList[i]=priceList[i]-player.specialCoinList[i].count;
                if(priceList[i]-player.coinList[i].count<=0){priceList[i]=player.coinList[i].count-priceList[i];buyCheck[i]=2;}
                else{
                    priceList[i]=priceList[i]-player.coinList[i].count;
                    if(priceList[i]-player.coinList[5].count<=0){
                        goldenCoin.count+=priceList[i];
                        player.coinList[5].count-=priceList[i];
                        buyCheck[i]=3;
                    }
                    else{
                        goldenCoin.count-=(x-player.coinList[5].count);
                        player.coinList[5].count=x;
                        return false;
                    }
                }
            }
            i++;
        }
        int j=0;
        while(j<5){
            if(buyCheck[j]==2){
                slotMachine.slotMachineCoinList[j].count+=(player.coinList[j].count-priceList[j]);
                player.coinList[j].count=priceList[j];
            }
            else if(buyCheck[j]==3)player.coinList[j].count=0;
            j++;
        }
        return true;
    }
    public boolean buyCard(int level,int position){
        if(!checkBuyCard(level,position)){return false;}
        else{
            if(level == 1){
                player.cardList[player.cardCount] = level1BoardCardList[position];
                level1BoardCardList[position] = null;
                setRandomLevel1BoardCard(position);
                if (player.cardList[player.cardCount].specialCoin.equals("black")) player.specialCoinList[0].count++;
                else if (player.cardList[player.cardCount].specialCoin.equals("white")) player.specialCoinList[1].count++;
                else if (player.cardList[player.cardCount].specialCoin.equals("red")) player.specialCoinList[2].count++;
                else if (player.cardList[player.cardCount].specialCoin.equals("blue")) player.specialCoinList[3].count++;
                else if (player.cardList[player.cardCount].specialCoin.equals("green")) player.specialCoinList[4].count++;
                player.score += player.cardList[player.cardCount].score;
                player.cardCount++;
            }
            else if (level == 2) {
                player.cardList[player.cardCount] = level2BoardCardList[position];
                level2BoardCardList[position] = null;
                setRandomLevel2BoardCard(position);
                if (player.cardList[player.cardCount].specialCoin.equals("black")) player.specialCoinList[0].count++;
                else if (player.cardList[player.cardCount].specialCoin.equals("white")) player.specialCoinList[1].count++;
                else if (player.cardList[player.cardCount].specialCoin.equals("red")) player.specialCoinList[2].count++;
                else if (player.cardList[player.cardCount].specialCoin.equals("blue")) player.specialCoinList[3].count++;
                else if (player.cardList[player.cardCount].specialCoin.equals("green")) player.specialCoinList[4].count++;
                player.score += player.cardList[player.cardCount].score;
                player.cardCount++;
            }
            else if (level == 3) {
                player.cardList[player.cardCount] = level3BoardCardList[position];
                level3BoardCardList[position] = null;
                setRandomLevel3BoardCard(position);
                if (player.cardList[player.cardCount].specialCoin.equals("black")) player.specialCoinList[0].count++;
                else if (player.cardList[player.cardCount].specialCoin.equals("white")) player.specialCoinList[1].count++;
                else if (player.cardList[player.cardCount].specialCoin.equals("red")) player.specialCoinList[2].count++;
                else if (player.cardList[player.cardCount].specialCoin.equals("blue")) player.specialCoinList[3].count++;
                else if (player.cardList[player.cardCount].specialCoin.equals("green")) player.specialCoinList[4].count++;
                player.score += player.cardList[player.cardCount].score;
                player.cardCount++;
            }
            return true;
        }
    }
    public boolean buyReserveCard(int position){
        if(!checkBuyCard(0,position)){return false;}
        else {
            player.cardList[player.cardCount] = player.reserveList[position];
            player.reserveList[position] = null;
            if (player.cardList[player.cardCount].specialCoin.equals("black")) player.specialCoinList[0].count++;
            else if (player.cardList[player.cardCount].specialCoin.equals("white")) player.specialCoinList[1].count++;
            else if (player.cardList[player.cardCount].specialCoin.equals("red")) player.specialCoinList[2].count++;
            else if (player.cardList[player.cardCount].specialCoin.equals("blue")) player.specialCoinList[3].count++;
            else if (player.cardList[player.cardCount].specialCoin.equals("green")) player.specialCoinList[4].count++;
            player.score += player.cardList[player.cardCount].score;
            player.cardCount++;
            return true;
        }
    }
    public void reserveCard(int level,int position){
        if(level==1){
            player.reserveList[player.reserveCount]=level1BoardCardList[position];
            level1BoardCardList[position]=null;
            setRandomLevel1BoardCard(position);
        }
        else if(level==2){
            player.reserveList[player.reserveCount]=level2BoardCardList[position];
            level2BoardCardList[position]=null;
            setRandomLevel2BoardCard(position);
        }
        else if(level==3) {
            player.reserveList[player.reserveCount]=level3BoardCardList[position];
            level3BoardCardList[position]=null;
            setRandomLevel3BoardCard(position);
        }
        if(goldenCoin.count>0)player.coinList[5].count++;
        player.reserveCount++;
    }
    public boolean checkBuyPrizeClaw(int position,Player pl){
        if(position>2)return true;
        else{
             int i = 0;
             while (i < 5) {
                if(boardPrizeClawList[position].specialCoinList[i].count-pl.specialCoinList[i].count>0) return false;
                i++;
            }
            return true;
        }
    }
    public boolean buyPrizeClaw(Player pl){
        for(int i=0;i<3;i++){
            if(boardPrizeClawList[i]!=null){
                if(checkBuyPrizeClaw(i,pl)){
                    pl.prizeclawList[pl.prizeclawCount] = boardPrizeClawList[i];
                    boardPrizeClawList[i] = null;
                    pl.score += pl.prizeclawList[pl.prizeclawCount].score;
                    pl.prizeclawCount++;
                    JOptionPane.showMessageDialog(null, "one prizeclaw add to your property!!", "prizeclaw", JOptionPane.PLAIN_MESSAGE);
                    return true;
               }
            }
        }
        return false;
    }
    public void cardStore(int play){
        frame=new JFrame();
        this.play=play;
        if(play==1)player=player1;
        else if(play==2)player=player2;
        frame.setTitle("Card Store");
        frame.setSize(1600, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel backgroundPanel=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundIcon = new ImageIcon("C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\gm.jpg");
                Image backgroundImage = backgroundIcon.getImage();
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.setContentPane(backgroundPanel);
        frame.setLayout(null);
        game.setInformationPanel(frame,player1,player2,play);
        JPanel panel=new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(469,0,612,608);
        panel.setLayout(new GridLayout(3,4,4,4));
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                int sw = 1;
                JButton button = new JButton();
                if (i == 0) {
                    if (level1BoardCardList[j] == null) {
                        buttonIcon = new ImageIcon("C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\empty.jpg");
                        sw = 0;
                    }
                    else buttonIcon = level1BoardCardList[j].icon;
                }
                else if (i == 1) {
                    if (level2BoardCardList[j] == null) {
                        buttonIcon = new ImageIcon("C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\empty.jpg");
                        sw = 0;
                    }
                    else buttonIcon = level2BoardCardList[j].icon;
                }
                else if (i == 2) {
                    if (level3BoardCardList[j] == null) {
                        buttonIcon = new ImageIcon("C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\empty.jpg");
                        sw = 0;
                    }
                    else buttonIcon = level3BoardCardList[j].icon;
                }
                button.setIcon(buttonIcon);
                final int level=i+1;
                final int position=j;
                   if(sw==1){
                        button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog question = new JDialog(frame,"question",true);
                                question.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                question.setBounds(550, 300, 400, 250);
                                question.setLayout(null);
                                JPanel questionPanel = new JPanel();
                                questionPanel.setBackground(Color.GRAY);
                                questionPanel.setSize(400, 250);
                                questionPanel.setLayout(null);
                                JButton buyButton = new JButton("Buy Card");
                                buyButton.setBounds(230, 80, 120, 50);
                                buyButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if (buyCard(level, position)){
                                            buyPrizeClaw(player);
                                            if (play == 1) game.startGame(2);
                                            else if (play == 2) game.startGame(1);
                                            question.dispose();
                                            frame.dispose();
                                        } else if (!buyCard(level, position)) {
                                            JOptionPane.showMessageDialog(null, "your coin does not enough to buy this card!!", "error", JOptionPane.INFORMATION_MESSAGE);
                                            question.dispose();
                                        }
                                    }
                                });
                                JButton reserveButton = new JButton("Reserve Card");
                                reserveButton.setBounds(50, 80, 120, 50);
                                reserveButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if (player.reserveCount < 3) {
                                            reserveCard(level, position);
                                            buyPrizeClaw(player);
                                            if (play == 1) game.startGame(2);
                                            else if (play == 2) game.startGame(1);
                                            question.dispose();
                                            frame.dispose();
                                        } else {
                                            JOptionPane.showMessageDialog(null, "your reservecard can not be more than3!!", "error", JOptionPane.INFORMATION_MESSAGE);
                                            question.dispose();
                                        }
                                    }
                                });
                                question.add(buyButton);
                                question.add(reserveButton);
                                question.add(questionPanel);
                                 question.setVisible(true);
                            }
                        });
                   }
                    panel.add(button);
                    panel.setVisible(true);
            }
        }
        JPanel reservePanel=new JPanel();
        reservePanel.setBackground(Color.BLACK);
        reservePanel.setBounds(1091,300,450,200);
        reservePanel.setLayout(new GridLayout(1,3,0,0));
        for(int i=0;i<3;i++){
            int sw=1;
            JButton button = new JButton();
            if(player.reserveCount==0||player.reserveList[i]==null){buttonIcon=new ImageIcon("C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\empty.jpg");sw=0;}
            else{buttonIcon = player.reserveList[i].icon;}
                button.setIcon(buttonIcon);
                final int position=i;
                if(sw==1){
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (buyReserveCard(position)) {
                            buyPrizeClaw(player);
                            if (play == 1) game.startGame(2);
                            else if (play == 2) game.startGame(1);
                            frame.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "your coin does not enough to buy this card!!", "error", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                });
            }
            reservePanel.add(button);
            reservePanel.setVisible(true);
        }
        JPanel prizeclawPanel=new JPanel();
        prizeclawPanel.setBackground(Color.BLACK);
        prizeclawPanel.setBounds(0,300,450,200);
        prizeclawPanel.setLayout(new GridLayout(1,3,0,0));
        JLabel[] label=new JLabel[3];
        for(int i=0;i<3;i++){
           label[i]=new JLabel();
           if(boardPrizeClawList[i]==null){labelIcon=new ImageIcon("C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\empty.jpg");}
                else{labelIcon=boardPrizeClawList[i].icon;}
                label[i].setIcon(labelIcon);
                label[i].setOpaque(true);
                label[i].setHorizontalAlignment(SwingConstants.CENTER);
                prizeclawPanel.add(label[i]);

        }
        JButton returnButton=new JButton("return");
        Font font=new Font("Lucida Fax",Font.BOLD,22);
        returnButton.setFont(font);
        returnButton.setBounds(100,650,150,80);
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.startGame(play);
            }
        });
        frame.add(returnButton);
        frame.add(prizeclawPanel);
        frame.add(panel);
        frame.add(reservePanel);
        frame.setVisible(true);
    }
}
