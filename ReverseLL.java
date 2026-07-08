public class ReverseLL{

    private int size;
    Node head;

    ReverseLL(){
        this.size = 0;
    }
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //Add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Add last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Print list
    public void printList(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        } 
        System.out.println("Null");
    }

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size --;
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    //prints size
    public int printSize(){
        return size;
    }

    public void reverseIterative(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String args[]){
        ReverseLL list = new ReverseLL();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.printList();

        System.out.println("\nIterative one : ");
        list.reverseIterative();
        list.printList();

        System.out.println("\nRecursive one : ");
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}

// 1->2->3->4->Null

// Iterative one : 
// 4->3->2->1->Null

// Recursive one :  // output is 1234 as list is already reversed in iterative one;
// 1->2->3->4->Null

