public class Node {
  private int data;
  private Node next,prev;

  public Node(int data, Node next, Node prev) {
    this.data = data;
    this.next = next;
    this.prev = prev;
  }
  public void setNext(Node next) {
    this.next = next;
  }
  public void setData(int data) {
    this.data = data;
  }
  public void setPrev(Node prev) {
    this.prev = prev;
  }
  public int get(){
    return data;
  }
  public Node getNext() {
    return next;
  }
  public int getData() {
    return data;
  }
  public Node getPrev() {
    return prev;
  }
}
