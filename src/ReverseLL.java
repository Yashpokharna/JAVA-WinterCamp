public class ReverseLL
{
    // head pehli node hoti h linked list ki
    static LinkedListNode head;
    // class for creating node in linked list
    // ll has 2 things: 1.is the value of the node 2.is the pointer that points next node
    static class LinkedListNode
    {
        int val;
        LinkedListNode next;
        // now creating constructor for class linked list node
        LinkedListNode(int no)
        {
            val = no;
            next = null;
        }
    }
    // now reversing the linked list
    LinkedListNode reverse(LinkedListNode node)
    {
        LinkedListNode previous = null;
        LinkedListNode curr = node;
        LinkedListNode next = null;
        while (curr != null)
        {
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
        }
        node = previous;
        return node;
    }
    // method to print the ll
    void printList(LinkedListNode nde)
    {
        while (nde != null)
        {
            System.out.print(nde.val + " ");
            nde = nde.next;
        }
    }
    public static void main(String[] args)
    {
        ReverseLL listObj = new ReverseLL();
        head = new LinkedListNode(4);
        head.next = new LinkedListNode(6);
        head.next.next = new LinkedListNode(7);
        head.next.next.next = new LinkedListNode(1);
        head.next.next.next.next = new LinkedListNode(5);
        head.next.next.next.next.next = new LinkedListNode(8);
        head.next.next.next.next.next.next = new LinkedListNode(3);
        head.next.next.next.next.next.next.next = new LinkedListNode(2);

        System.out.println("The Linked list before reversal is: ");
        listObj.printList(head);
        head = listObj.reverse(head);
        System.out.println("\n");
        System.out.println("After reversal, the linked list is: ");
        listObj.printList(head);
    }
} 