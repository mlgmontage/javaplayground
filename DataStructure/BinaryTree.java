package DataStructure;

public class BinaryTree {
  BTreeNode root;

  BinaryTree() {
    root = null;
  }

  public void insert(int value) {
    root = insertRec(root, value);
  }

  public BTreeNode insertRec(BTreeNode root, int value) {
    if (root == null) {
      root = new BTreeNode(value);

    } else {
      if (root.data > value) {
        root.left = insertRec(root.left, value);
      } else if (root.data < value) {
        root.right = insertRec(root.right, value);
      }

    }
    return root;
  }

  public static void main(String[] args) {
    BinaryTree bst = new BinaryTree();
    bst.insert(1);
    bst.insert(2);
    bst.insert(3);
    bst.insert(4);
    System.out.println("Binary Tree root: " + bst.root.data);
  }
}
