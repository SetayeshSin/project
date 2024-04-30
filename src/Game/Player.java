package Game;
import Card.*;
import Coin.*;
public class Player {
    public String name;
    public int score;
    public Card[] cardList=new Card[20];
    public Card[] reserveList=new Card[3];
    public Coin[] coinList=new Coin[6];
    public SpecialCoin[] specialCoinList=new SpecialCoin[5];
    public PrizeClaw[] prizeclawList=new PrizeClaw[3];
    public int cardCount=0;
    public int reserveCount=0;
    public int prizeclawCount=0;
    public Player(String name){
        this.name=name;
        int i=0;
        while(i<5){
            coinList[i]=new Coin(i,0);
            specialCoinList[i]=new SpecialCoin(0);
            i++;
        }
        coinList[i]=new Coin(i,0);
    }
}
