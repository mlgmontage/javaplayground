package DataStructure;

/*
  Write program that calculates sum of all elements in given Linked List.
*/

public class LinkedListSum {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    LinkedList.insert(list, 1);
    LinkedList.insert(list, 2);
    LinkedList.insert(list, 3);
    LinkedList.insert(list, 4);

    int sum = 0;

    Node current = list.head;

    while (current != null) {
      sum += current.data;
      current = current.next;
    }

    System.out.println("Sum of all element in linked list: " + sum);

  }
}
