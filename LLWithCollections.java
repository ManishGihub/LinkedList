import java.util.*;

public class LLWithCollections{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        System.out.println(list);

        list.addFirst("is");
        System.out.println(list);

        list.addFirst("This");
        System.out.println(list);
        
        list.addLast("boy"); //add
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        System.out.println(list.size());
    }
}

// [a]
// [is, a]
// [This, is, a]
// [This, is, a, boy]
// [is, a, boy]
// [is, a]
// 2