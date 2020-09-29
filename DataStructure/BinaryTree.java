package DataStructure;

public class BinaryTree {
  BTreeNode root;

  BinaryTree() {
    root = null;
  }

  public static void main(String[] args) {
    BinaryTree bst = new BinaryTree();
    bst.root = new BTreeNode(4);
    System.out.println("Binary Tree root: " + bst.root.data);
  }
}
