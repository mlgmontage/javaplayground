package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeToList {

  public static void inorder(List<Integer> list, BTreeNode root) {
    if (root != null) {
      inorder(list, root.left);
      list.add(root.data);
      inorder(list, root.right);
    }
  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    BinaryTree bst = new BinaryTree();

    bst.insert(2);
    bst.insert(3);
    bst.insert(4);
    bst.insert(5);
    bst.insert(6);

    inorder(list, bst.root);

    System.out.print("List: ");
    int i;
    for (i = 0; i < list.size(); i++) {

      System.out.print(list.get(i) + ", ");
    }
  }
}
