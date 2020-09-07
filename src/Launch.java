import java.util.ArrayList;
import java.util.List;

public class Launch {
    public static void main(String [] args){
        List<Integer> arrIntList = new ArrayList<Integer>();

        BlackJack blackJack = new BlackJack(12,8);
        //blackJack.printWinner();
        QuikMaffz quikMaffz = new QuikMaffz(5,2);
        //quikMaffz.displayMessage();
        Demolist demolist = new Demolist(5);
        demolist.populate_list(arrIntList);
        demolist.printList(arrIntList);




    }
}
