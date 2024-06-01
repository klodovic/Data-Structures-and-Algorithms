public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private final int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        //Creating head and nodes
        sll.head = new ListNode(10);
        ListNode sec = new ListNode(1);
        ListNode trd = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //Connecting the head and the nodes
        sll.head.next = sec;
        sec.next = trd;
        trd.next = fourth;

        //Printing elements
        System.out.println();
        printSinglyLinkedList(sll);

        //Length of the linked list
        System.out.println();
        System.out.println("Length is: " + len(sll));

        //insert node as new head
        System.out.println();
        insertNodeAsHead(sll, 5);
        insertNodeAsHead(sll, 3);
        insertNodeAsHead(sll, 16);
        printSinglyLinkedList(sll);

        //insert new node at the end
        insertEndNode(sll, 4);
        insertEndNode(sll, 6);
        insertEndNode(sll, 7);
        printSinglyLinkedList(sll);

        //insert a node at a given position
        insertAtGivenPosition(sll, 22, 2);
        printSinglyLinkedList(sll);

        //delete the first node
        deleteFirstNode(sll);
        printSinglyLinkedList(sll);

        //delete the last node
        deleteLastNode(sll);
        printSinglyLinkedList(sll);
    }

    private static void deleteLastNode(SinglyLinkedList sll) {
        if (sll.head == null || sll.head.next == null){
            return;
        }
        ListNode current = sll.head;
        ListNode previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }

    private static void deleteFirstNode(SinglyLinkedList sll) {
        if (sll.head == null){
            return;
        }
        ListNode temp = sll.head;
        sll.head = sll.head.next;
        temp.next = null;
    }

    private static void insertAtGivenPosition(SinglyLinkedList sll, int data, int position) {
        ListNode node = new ListNode(data);
        if (position == 1){
            node.next = sll.head;
            sll.head = node;
        }
        else {
            ListNode previous = sll.head;
            int count = 1;
            while (count < position - 1){
                previous = previous.next;
                count++;
            }
            //braking the link and inserting node
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    private static void insertEndNode(SinglyLinkedList sll, int data) {
        ListNode newNode = new ListNode(data);
        if (sll.head == null){
            sll.head = newNode;
            return;
        }
        ListNode current = sll.head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    private static void insertNodeAsHead(SinglyLinkedList sll, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = sll.head;
        //setting pointer for the new head
        sll.head = newNode;
    }

    private static int len(SinglyLinkedList sll) {
        ListNode current = sll.head;
        int count = 0;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    private static void printSinglyLinkedList(SinglyLinkedList sll) {
        ListNode current = sll.head;
        System.out.print("Head: ");
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
