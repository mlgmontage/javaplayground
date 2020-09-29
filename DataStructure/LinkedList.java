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

  public static void print(LinkedList list) {
    Node current = list.head;
    System.out.print("Linked list: ");

    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.print("\n");
  }

  public static void main(String[] args) {
    LinkedList linked = new LinkedList();

    LinkedList.insert(linked, 8);
    LinkedList.insert(linked, 13);

    LinkedList.print(linked);

  }
}
