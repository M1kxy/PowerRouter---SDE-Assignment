import java.util.Scanner;

public class Q3_middle_element {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to get middle element
    public static int getMiddle(Node head) {
        Node slow_ptr = head;
        Node fast_ptr = head;

        // Move fast_ptr two steps ahead of slow_ptr until it reaches the end of the linked list
        while (fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }

        // If the number of nodes is odd, the slow_ptr points to the middle node
        // If the number of nodes is even, the slow_ptr points to the second middle node
        return slow_ptr.data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a singly linked list from user input
        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        Node head = null;
        Node current = null;
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the value for node %d: ", i+1);
            int data = scanner.nextInt();
            Node node = new Node(data);
            if (head == null) {
                head = node;
                current = node;
            } else {
                current.next = node;
                current = node;
            }
        }

        // Display the original linked list
        System.out.println("The original linked list is:");
        current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        // Find the middle element of the linked list
        int middle = getMiddle(head);
        System.out.printf("\n\nThe middle element is: %d\n", middle);
    }
}
//We start with an empty linked list and add nodes one by one using a loop. Inside the loop, we take user input for the data value
// of each node and create a new node using the Node class. 
//If the current node is the first node then we set the head to this node. 
//Otherwise, we set the next pointer of the current node to the new node, and update the current node to be the new node.

//Once the linked list is created, we call the getMiddle() function to find the middle element of the linked list and store it in 
// the variable "middle".

//in getMiddle() we use two pointers - slow_ptr and fast_ptr - to traverse the linked list. The slow_ptr moves one node at a time
// while the fast_ptr moves two nodes at a time. When the fast_ptr reaches the end of the linked list, the slow_ptr points to the
// middle node if the number of nodes is odd or the second middle node if the number of nodes is even. Finally, we return the data
// at the middle node using slow_ptr.data.