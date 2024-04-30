package Card;
import Coin.*;
import javax.swing.*;
public class PrizeClaw {
    public int score;
    public Icon icon;
    public SpecialCoin[] specialCoinList=new SpecialCoin[5];
    public int number;
    public PrizeClaw(int score,int blackSpecialCoinCount,int whiteSpecialCoinCount,int redSpecialCoinCount,int blueSpecialCoinCount,int greenSpecialCoinCount,String path){
        this.score=score;
        icon=new ImageIcon(path);
        specialCoinList[0]=new SpecialCoin(blackSpecialCoinCount);
        specialCoinList[1]=new SpecialCoin(whiteSpecialCoinCount);
        specialCoinList[2]=new SpecialCoin(redSpecialCoinCount);
        specialCoinList[3]=new SpecialCoin(blueSpecialCoinCount);
        specialCoinList[4]=new SpecialCoin(greenSpecialCoinCount);
    }
}
