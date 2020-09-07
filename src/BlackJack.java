/* TODO: Given 2 integer values from a dealer and a player which are greater than 0,
        return whichever value is closest to 21 without going bust. If both bust,
        return 0. If a draw occurs, dealer wins.
*/
public class BlackJack {
    private  final int BUST_NUMBER= 21;
    static int result;
    private int dealer;
    private int player;
    BlackJack(int dealer, int player){
        this.dealer = dealer;
        this.player = player;
    }
    public int checkSum(){
        if(dealer>=BUST_NUMBER){
            return 0;
        }else if(player>=BUST_NUMBER){
            return 0;
        }
        else if(dealer+player>=BUST_NUMBER){
            return 0;
        }else {
           if(cloestVlaue(player)<cloestVlaue(dealer)) {
               result = player;
           }else{
               result = dealer;
           }
        }

        return result;
    }

    public int cloestVlaue(int num){
        return BUST_NUMBER- num;
    }

    public void printWinner(){
        checkSum();
        if(player==dealer && result>= BUST_NUMBER){
            System.out.println("The WINNER is DEALER:"+ dealer);
        }
        else if(result==player){
            System.out.println("The WINNER is PLAYER:"+ player);
        }
        else if(result==dealer){
            System.out.println("The WINNER is DEALER:"+ dealer);
        }
        else {
            System.out.println("BUSTED");
        }

    }
}
