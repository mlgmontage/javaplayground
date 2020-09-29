package DataStructure;

public class BinaryTreeSum {
  static int sum(BTreeNode node) {
    if (node != null) {
      return node.data + sum(node.left) + sum(node.right);
    }
    return 0;
  }

  public static void main(String[] args) {
    BinaryTree bst = new BinaryTree();

    bst.insert(1);
    bst.insert(2);
    bst.insert(3);
    bst.insert(4);
    bst.insert(5);

    int sum = sum(bst.root);

    System.out.println("Sum of binary tree: " + sum);

  }
}
