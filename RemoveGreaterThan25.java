import java.util.*;

//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

public class RemoveGraterThan25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter no. in the range of 1 to 50");
        char choice;
        do{
            System.out.print("Enter no. : ");
            int n = sc.nextInt();
            list.add(n);

            System.out.println("do you want to add more no.?(y/n)");
            choice = sc.next().charAt(0);
        }while(choice == 'y' || choice == 'Y');

        System.out.println("list before deletion");
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            if(list.get(i) > 25){
                list.remove(i);
            }
        }
        
        System.out.println("list before deletion");
        System.out.println(list);
        
    }
}
// Enter no. in the range of 1 to 50
// Enter no. : 1
// do you want to add more no.?(y/n)
// y
// Enter no. : 34
// do you want to add more no.?(y/n)
// y
// Enter no. : 5
// do you want to add more no.?(y/n)
// n
// list before deletion
// [1, 34, 5]
// list before deletion
// [1, 5]