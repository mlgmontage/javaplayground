package DataStructure;

public class LinkedList {
  Node head;

  static class Node {
    int data;
    Node next;

    Node(int value) {
      data = value;
      next = null;
    }
  }

  public static void main(String[] args) {
    LinkedList linked = new LinkedList();
    linked.head = new Node(3);
    linked.head.next = new Node(5);
    System.out.println("linked head: " + linked.head.data);
    System.out.println("linked head's next: " + linked.head.next.data);
  }
}
