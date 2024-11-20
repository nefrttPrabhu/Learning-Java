class LinkedList {
    // Define the structure of a linked list node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to create a new node with the given data
    static Node createNode(int data) {
        Node newNode = new Node(data);
        return newNode;
    }

    // Function to insert a new node at the end of the linked list
    static void insertAtEnd(Node head, int data) {
        Node newNode = createNode(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Function to compare two linked lists
    static boolean compareLists(Node list1, Node list2) {
        while (list1 != null && list2 != null) {
            if (list1.data != list2.data) {
                return false; // Lists are not the same
            }
            list1 = list1.next;
            list2 = list2.next;
        }

        // If both lists reach the end at the same time, they are the same
        return (list1 == null && list2 == null);
    }

    // Function to reverse a linked list
    static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Function to print the elements of a linked list
    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node list1 = null;
        Node list2 = null;

        // Insert nodes at the end of list1
        insertAtEnd(list1, 10);
        insertAtEnd(list1, 20);
        insertAtEnd(list1, 30);

        // Insert nodes at the end of list2
        insertAtEnd(list2, 10);
        insertAtEnd(list2, 20);
        insertAtEnd(list2, 40); // Different data in list2

        // Compare the two lists
        if (compareLists(list1, list2)) {
            System.out.println("The lists are the same.");
        } else {
            System.out.println("The lists are different.");
        }

        // Reverse both lists
        list1 = reverseList(list1);
        list2 = reverseList(list2);

        // Print the reversed lists
        System.out.println("Reversed List 1: ");
        printList(list1);

        System.out.println("Reversed List 2: ");
        printList(list2);
    }
}