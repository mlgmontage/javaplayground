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

  public static LinkedList insert(LinkedList list, int value) {
    Node node = new Node(value);

    if (list.head == null) {
      list.head = node;
    } else {

      Node current = list.head;
      while (current.next != null) {
        current = current.next;
      }

      current.next = node;
    }
    return list;
  }

  public static void main(String[] args) {
    LinkedList linked = new LinkedList();

    LinkedList.insert(linked, 8);
    LinkedList.insert(linked, 13);

    System.out.println("linked head: " + linked.head.data);
    System.out.println("linked head's next: " + linked.head.next.data);
  }
}
