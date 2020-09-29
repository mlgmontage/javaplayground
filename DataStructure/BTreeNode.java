package DataStructure;

public class BTreeNode {
  int data;
  BTreeNode left, right;

  BTreeNode(int value) {
    data = value;
    left = right = null;
  }
}
