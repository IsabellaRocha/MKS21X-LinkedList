public class MyLinkedList {
  private int size;
  private Node start,end;

  public MyLinkedList(int size, Node start, Node end) {
    this.size = size;
    this.start = start;
    this.end = end;
  }
  public int size() {
    return size;
  }
  public boolean add(int value) {
    Node nEnd = new Node (value, end, null);
    return true;
  }
  public String toString() {
    String output = "[";
    for (Node current = start; current != null) {
      
    }
  }
}
