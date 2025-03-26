q3 class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Node inserted at the beginning: " + data);
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Node inserted at the end: " + data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Node inserted at the end: " + data);
    }

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        int deletedData = head.data;
        head = head.next;
        System.out.println("Node deleted from the beginning: " + deletedData);
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.printList();

        list.deleteFromBeginning();

        list.printList();
    }
}
