public class Node {
  private int data;
  private Node next,prev;

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }
  public void changeNext(Node next) {
    this.next = next;
  }
  public void changeData(int data) {
    this.data = data;
  }
}
