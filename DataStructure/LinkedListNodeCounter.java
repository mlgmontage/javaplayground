package DataStructure;

/*
  Write a program in C to create a singly linked list of n nodes and count the number of nodes.
*/

public class LinkedListNodeCounter {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    LinkedList.insert(list, 2);
    LinkedList.insert(list, 3);
    LinkedList.insert(list, 4);
    LinkedList.insert(list, 5);

    int counter = 0;
    Node node = list.head;

    while (node != null) {
      counter += 1;
      node = node.next;
    }

    System.out.println("Number of nodes in linked list: " + counter);
  }
}
