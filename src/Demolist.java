import java.util.ArrayList;
import java.util.List;

public class  Demolist {
    private int l_size ;
    Demolist(int l_size){
        this.l_size = l_size;
    }
    public void populate_list(List<Integer> someList){
        for (int i=0; i<=l_size;i++) {
            someList.add(i, (int)(Math.random() * 100));
        }
    }
    public void printList(List<Integer> someList){
        if(l_size!=0){
            for(int i : someList){
                System.out.println(i);
            }
        }else{
            System.out.print("It is an empty list");
        }

    }
}
