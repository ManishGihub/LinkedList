import java.util.*;

//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

public class Prob1{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addAll(List.of(1,5,7,3,8,2,3));
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            if(list.get(i) == 7){
                System.out.println("found at index : "+i);
            }
        }
    }
}

// [1, 5, 7, 3, 8, 2, 3]
// found at index : 2