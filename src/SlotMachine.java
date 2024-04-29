import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SlotMachine {
    public Coin[] slotMachineCoinList = new Coin[5];
    private JFrame frame;
    private JPanel panel;
    private JPanel slotPanel;
    private JLabel label;
    private JButton button;
    private Game game;
    private Player player1;
    private Player player2;
    private Player player;
    public Store store;
    private int number;
    private int firstChoice;
    private int secondChoice;
    private int play;
    private int count;
    private int sw;
    private int zeroSlot;

    public SlotMachine(Game game, Player player1, Player player2) {
        this.game = game;
        this.player1 = player1;
        this.player2 = player2;
        slotMachineCoinList[0] = new Coin(0, 5);
        slotMachineCoinList[1] = new Coin(1, 5);
        slotMachineCoinList[2] = new Coin(2, 5);
        slotMachineCoinList[3] = new Coin(3, 5);
        slotMachineCoinList[4] = new Coin(4, 5);
    }

    public void extraCoin() {
            frame.setLayout(null);
            JOptionPane.showMessageDialog(null, "your coins are more than 10 you must subtract from them!!", "error", JOptionPane.INFORMATION_MESSAGE);
            JPanel coinPanel = new JPanel();
            coinPanel.setBounds(525, 540, 500, 100);
            coinPanel.setLayout(new GridLayout(1, 5, 0, 0));
            for (int j = 0; j < 5; j++) {
                final int i = j;
                JButton coinButton = new JButton() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponents(g);
                        if (i == 0) g.setColor(Color.BLACK);
                        else if (i == 1) g.setColor(Color.WHITE);
                        else if (i == 2) g.setColor(Color.RED);
                        else if (i == 3) g.setColor(Color.BLUE);
                        else if (i == 4) g.setColor(Color.GREEN);
                        g.fillOval(0, 0, 100, 100);
                        if (i == 0) g.setColor(Color.WHITE);
                        else g.setColor(Color.BLACK);
                        g.drawString(String.valueOf(player.coinList[i].count), 40, 60);
                    }
                };
                coinButton.setFont(new Font("Lucida Fax", Font.BOLD, 30));
                coinButton.setContentAreaFilled(false);
                coinButton.setBorderPainted(true);
                    coinButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if(player.coinList[i].count>0) {
                                player.coinList[i].count--;
                                slotMachineCoinList[i].count++;
                                updatePanel();
                                count--;
                            }
                            else if(player.coinList[i].count==0){
                                JOptionPane.showMessageDialog(null, "you dont have money to lose!!", "error", JOptionPane.INFORMATION_MESSAGE);
                            }
                                if(count==10)
                                {
                                    store.buyPrizeClaw(player);
                                    if (play == 1) game.startGame(2);
                                    else if (play == 2) game.startGame(1);
                                    frame.dispose();
                                }
                        }
                    });
                    coinPanel.add(coinButton);
                    frame.add(coinPanel);
                    frame.setVisible(true);
            }
    }

    public void slotLabel() {
        slotPanel = new JPanel();
        slotPanel.setBounds(475, 0, 600, 30);
        slotPanel.setLayout(new GridLayout(1, 5, 0, 0));
        for (int j = 0; j < 5; j++) {
            final int i = j;
            label = new JLabel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponents(g);
                    if (i == 0) g.setColor(Color.BLACK);
                    else if (i == 1) g.setColor(Color.WHITE);
                    else if (i == 2) g.setColor(Color.RED);
                    else if (i == 3) g.setColor(Color.BLUE);
                    else if (i == 4) g.setColor(Color.GREEN);
                    g.fillRect(0, 0, 120, 30);
                    if (i == 0) g.setColor(Color.WHITE);
                    else g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(slotMachineCoinList[i].count), 56, 25);
                }
            };
            label.setFont(new Font("Lucida Fax", Font.BOLD, 25));
            label.setOpaque(true);
            label.setBackground(Color.WHITE);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            slotPanel.add(label);
            frame.add(slotPanel);
        }
    }
    public void updatePanel(){
        frame.remove(Game.panel1);
        frame.remove(Game.panel2);
        frame.remove(Game.panelCoin1);
        frame.remove(Game.panelCoin2);
        frame.remove(Game.panelScore1);
        frame.remove(Game.panelScore1);
        frame.remove(Game.panelSpecialCoin1);
        frame.remove(Game.panelSpecialCoin2);
        frame.revalidate();
        frame.repaint();
        game.setInformationPanel(frame, player1, player2, play);
    }
    public void zeroSlotMachine(){
        zeroSlot=0;
        for(int i=0;i<5;i++) {
            if (slotMachineCoinList[i].count == 0) zeroSlot++;
        }
    }
    public void coinSlotMachine(int play) {
        this.play = play;
        number = 1;
        count=0;
        zeroSlotMachine();
        if (play == 1) player = player1;
        else if (play == 2) player = player2;
        frame = new JFrame();
        frame.setTitle("SlotMachine");
        frame.setSize(1600, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel backgroundPanel = new JPanel() {
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
        slotLabel();
        game.setInformationPanel(frame, player1, player2, play);
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon slotIcon = new ImageIcon("C:\\Users\\sesin\\Desktop\\java\\midterm\\src\\pictures\\slot.jpg");
                Image slotImage = slotIcon.getImage();
                g.drawImage(slotImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setBounds(475, 30, 600, 500);
        panel.setLayout(new GridLayout(1, 5, 0, 0));
        sw=0;
        for (int j = 0; j < 5; j++) {
            button = new JButton();
            button.setContentAreaFilled(false);
            button.setBorderPainted(true);
            final int i = j;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (number == 1) {
                        if (slotMachineCoinList[i].count == 0)
                            JOptionPane.showMessageDialog(null, "slotMachine has not enough coin!!", "error", JOptionPane.INFORMATION_MESSAGE);
                        else if(zeroSlot>2){
                            if(slotMachineCoinList[i].count == 5){
                                sw=1;
                                player.coinList[i].count++;
                                slotMachineCoinList[i].count--;
                                firstChoice = i;
                                updatePanel();
                                number++;
                            }
                            else JOptionPane.showMessageDialog(null, "you can not get coin from this slotMachine!!", "error", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            player.coinList[i].count++;
                            slotMachineCoinList[i].count--;
                            firstChoice = i;
                            updatePanel();
                            number++;
                        }
                    } else if (number == 2) {
                        if (firstChoice == i) {
                            if (slotMachineCoinList[i].count == 4){
                                player.coinList[i].count++;
                                slotMachineCoinList[i].count--;
                                secondChoice = i;
                                updatePanel();
                                number+=2;
                                for (int k = 0; k < 5; k++) {
                                    count += player.coinList[k].count;
                                }
                                if(count>10)extraCoin();
                                else {
                                    store.buyPrizeClaw(player);
                                    if (play == 1) game.startGame(2);
                                    else if (play == 2) game.startGame(1);
                                    frame.dispose();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "you can not get coin from this slotmachine!!", "error", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        else if(sw==1){
                            JOptionPane.showMessageDialog(null, "you can not get coin from this slotmachine!!", "error", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            if (slotMachineCoinList[i].count == 0) {
                                JOptionPane.showMessageDialog(null, "slotMachine has not enough coin!!", "error", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                player.coinList[i].count++;
                                slotMachineCoinList[i].count--;
                                secondChoice = i;
                                updatePanel();
                                number++;
                            }
                        }
                    } else if (number == 3) {
                        if (firstChoice == i || secondChoice == i)
                            JOptionPane.showMessageDialog(null, "you can not get coin from this slot machine!!", "error", JOptionPane.INFORMATION_MESSAGE);
                        else if (slotMachineCoinList[i].count == 0) {
                            JOptionPane.showMessageDialog(null, "slotMachine has not enough coin!!", "error", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            player.coinList[i].count++;
                            slotMachineCoinList[i].count--;
                            updatePanel();
                            number++;
                            for (int k = 0; k < 5; k++) {
                                count += player.coinList[k].count;
                            }
                            if(count>10)extraCoin();
                            else {
                                store.buyPrizeClaw(player);
                                if (play == 1) game.startGame(2);
                                else if (play == 2) game.startGame(1);
                                frame.dispose();
                            }
                        }
                    }
                }
            });
            JButton returnButton = new JButton("return");
            Font font = new Font("Lucida Fax", Font.BOLD, 22);
            returnButton.setFont(font);
            returnButton.setBounds(100, 650, 150, 80);
            returnButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (number == 1) {
                        game.startGame(play);
                    }
                }
            });
            frame.add(returnButton);
            panel.add(button);
            frame.add(panel);
        }
        frame.setVisible(true);
    }
}