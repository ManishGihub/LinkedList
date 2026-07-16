package LinkedList;

public class LL{

    private int size;
    Node head;

    LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //Add first
    public void addFirst(String data){
        
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Add last
    public void addLast(String data){
        
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

    public int printSize(){
        return size;
    }

    public static void main(String args[]){
        LL list = new LL();

        list.addFirst("is");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.addLast("a");
        list.printList();

        list.addLast("List");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.printSize());
    }
}

// is->Null
// This->is->Null
// This->is->a->Null
// This->is->a->List->Null
// is->a->List->Null
// is->a->Null
// 2
