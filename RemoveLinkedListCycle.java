//Remove the loop/cycle from the linked list

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Solution{
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        if(head == null || head.next == null){
            return;
        }

        Node slow = head;
        Node fast = head;
        boolean loopExists = false;

        while(fast != null || fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                loopExists = true;
                break;
            }
        }

        // If a loop is found, proceed to remove it
        if(loopExists){
            // Step 2: Handle special case where the loop starts at the Head node
            if(slow == head){
                while(fast.next != slow){
                    fast = fast.next;
                }
                fast.next = null; // Break loop 
            }
            // Step 3: General case where the loop starts somewhere inside the list
            else{
                slow = head;
                while(slow.next != fast.next){
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }
}

public class RemoveLinkedListCycle{

    public static void printList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String []args){
         /*
            Creating this linked list:

            1 -> 2 -> 3 -> 4 -> 5
                      ^         |
                      |_________|

            Loop starts at node 3
        */
       Node head = new Node(1);

       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);

       //Creating a loop
       // 5 points towards 3

       Node loopStart = head.next.next;
       head.next.next.next.next.next = loopStart;

       System.out.println("Loop created");

       //Remove Loop
       Solution.removeLoop(head);

       //Print List
       printList(head);
    }
}

// Loop created
// 1->2->3->4->5->null