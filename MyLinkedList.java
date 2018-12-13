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
  public int indexOf(Integer value) {
    Node current = start;
    for (int idx = 0; idx < size; idx++) {
      if (current.getData() == value) {
        return idx;
      }
      current = current.next();
    }
    return -1;
  }
//  public void add(int idx, Integer value) {
//    Node current = start;
//    for (int x = 0; x < idx - 1; x++) {
//      current = current.next();
//    }
//    current = new Node(current.getData(), current.prev(), value);
//    Integer prev = current.getData();
//    Integer next = current.next().next().getData();
//    current = current.next();
//    current = new Node(value, prev, next);
//    current = current.next();
//    current = new Node(current.getData(), value, current.next());
//  }
  public Integer remove(int idx) {
    Node current = start;
    for (int x = 0; x < idx; x++) {
      current = current.next();
    }
    Integer og = current.getData();
    Node newCurrent = start;
    for (int x = 0; x < idx - 1; x++) {
      newCurrent = newCurrent.next();
    }
    newCurrent.setNext(newCurrent.next().next());
    Node nCurrent = newCurrent.next();
    nCurrent.setPrev(newCurrent);
    return og;
  }
}
