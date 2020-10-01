package DataStructure;

public class BinaryTreeNodeCounter {

  static int counter(BTreeNode root) {
    if (root != null) {
      return 1 + counter(root.left) + counter(root.right);
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
    bst.insert(6);

    System.out.println("Number of nodes in binary tree: " + counter(bst.root));
  }
}
