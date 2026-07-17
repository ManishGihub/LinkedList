import org.w3c.dom.Node;

public class RemoveFromEnd {
    public static void main(String[] args) {
        public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        int size = 0; //size
        Node currNode = ListNode();
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }
    }
}
