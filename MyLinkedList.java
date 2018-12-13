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
  public boolean add(Integer value) {
    Node newEnd = new Node(value, null, end);
    end = newEnd;
    return true;
  }
  public String toString() {
    String output = "[";
    Node current = start;
    while (current.next() != null) {
      output += current + ", ";
      current = current.next();
    }
    output += end + "]";
    return output;
  }
  public Integer get(int idx) {
    Node current = start;
    for (int x = 0; x < idx; x++) {
      current = current.next();
    }
    return current.getData();
  }
  public Integer set(int idx, Integer value) {
    Node current = start;
    for (int x = 0; x < idx; x++) {
      current = current.next();
    }
    Integer og = current.getData();
    current = new Node(value, current.next(), current.prev());
    return og;
  }
  public boolean contains(Integer value) {
    Node current = start;
    while (current.next() != null) {
      if (current.getData() == value) {
        return true;
      }
      current = current.next();
    }
    return false;
  }
}
