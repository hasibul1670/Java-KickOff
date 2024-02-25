// Define a class for a SimpleLinkedList
public class SinglyLinkedList {

  // Private member variable representing the first node in the list
  public Node firstNode;

  // Inner static class representing a node in the list
  public static class Node {
    public int data; // Data stored in the node
     Node next; // Reference to the next node in the list

    // Constructor to create a node with given data
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // Method to print the elements in the list
  public void printList() {
    Node currentNode = firstNode; // Start from the first node

    // Traverse the list and print each node's data followed by "-->"
    while (currentNode != null) {
      System.out.print(currentNode.data + "-->");
      currentNode = currentNode.next; // Move to the next node
    }
    System.out.print("null"); // Indicate the end of the list
  }

  // Main method where the program starts
  public static void main(String[] args) {
    // Create an instance of the SimpleLinkedList class
    SinglyLinkedList myList = new SinglyLinkedList();

    // Create nodes and assign data to them
    myList.firstNode = new Node(10);
    Node secondNode = new Node(1);
    Node thirdNode = new Node(8);
    Node fourthNode = new Node(11);

    // Link the nodes to form a list: 10 -> 1 -> 8 -> 11 -> null
    myList.firstNode.next = secondNode; // 10 -> 1
    secondNode.next = thirdNode; // 10 -> 1 -> 8
    thirdNode.next = fourthNode; // 10 -> 1 -> 8 -> 11 -> null

    // Print the list: 10-->1-->8-->11-->null
    myList.printList();
  }
}
