package Card;
import Coin.*;
import Game.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Card{
    public int level;
    public int score;
    public Icon icon;
    public String specialCoin;
    public Coin[] coinList=new Coin[5];
    public static int number;
    public Card(int level,int score,String specialCoin,int blackCoinCount,int whiteCoinCount,int redCoinCount,int blueCoinCount,int greenCoinCount,String path){
        this.level=level;
        this.score=score;
        icon=new ImageIcon(path);
        this.specialCoin=specialCoin;
        coinList[0]=new Coin(0,blackCoinCount);
        coinList[1]=new Coin(1,whiteCoinCount);
        coinList[2]=new Coin(2,redCoinCount);
        coinList[3]=new Coin(3,blueCoinCount);
        coinList[4]=new Coin(4,greenCoinCount);
    }
}
