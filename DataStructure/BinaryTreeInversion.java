package DataStructure;

public class BinaryTreeInversion {
  public static BTreeNode invert(BTreeNode root) {
    BTreeNode temp;

    if (root != null && (root.left != null || root.right != null)) {
      temp = root.left;
      root.left = root.right;
      root.right = temp;
      invert(root.left);
      invert(root.right);
    }

    return root;
  }

  public static void main(String[] args) {
    BinaryTree bst = new BinaryTree();
    bst.insert(2);
    bst.insert(3);
    bst.insert(4);
    bst.insert(5);

    System.out.print("Before inversion\n");
    bst.print();

    invert(bst.root);
    System.out.print("After inversion\n");
    bst.print();
  }

}
