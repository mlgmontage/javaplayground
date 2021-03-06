package DataStructure;

public class BinaryTree {
  BTreeNode root;

  BinaryTree() {
    root = null;
  }

  public BTreeNode search(int value) {
    return searchRec(this.root, value);
  }

  public BTreeNode searchRec(BTreeNode root, int value) {
    if (root == null)
      return null;
    if (root.data == value)
      return root;

    if (root.data > value) {
      return searchRec(root.left, value);
    }

    if (root.data < value) {
      return searchRec(root.right, value);
    }

    return null;
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

  public void print() {
    printRec(root);
  }

  public void printRec(BTreeNode node) {
    if (node != null) {
      printRec(node.left);
      System.out.println(node.data);
      printRec(node.right);
    }
  }

  public static void main(String[] args) {
    BinaryTree bst = new BinaryTree();
    bst.insert(1);
    bst.insert(2);
    bst.insert(3);
    bst.insert(4);
    System.out.println("Binary Tree: ");

    BTreeNode found = bst.search(3);

    if (found != null) {
      System.out.println("Found value: " + found.data);
    }
    bst.print();
  }
}
