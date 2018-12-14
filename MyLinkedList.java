public class MyLinkedList {
  private int size;
  private Node start;
  private Node end;

  public MyLinkedList(int size, Node start, Node end) {
    this.size = size;
    this.start = start;
    this.end = end;
  }
  public MyLinkedList() {
  }
  public int size() {
    return size;
  }
  public boolean add(Integer value) {
    if (end != null) {
      Node newEnd = new Node(value, null, end);
      end.setNext(newEnd);
      end = newEnd;
    }
    else {
      end = new Node(value, null, end);
    }
    size++;
    return true;
  }
  public String toString() {
    String output = "[";
    Node current = start;
    while (current != null) {
      output += current + ", ";
      current = current.next();
    }
    if (end == null) {
      output +="]";
    }
    else {
      output += end + "]";
    }
    return output;
  }
  public Integer get(int idx) {
    if (idx < 0 || idx >= size) {
      throw new IndexOutOfBoundsException();
    }
    Node current = start;
    for (int x = 0; x < idx; x++) {
      current = current.next();
    }
    return current.getData();
  }
  private Node getNthNode(int idx) {
    Node current = start;
    for (int x = 0; x < idx; x++) {
      current = current.next();
    }
    return current;
  }
  public Integer set(int idx, Integer value) {
    if (idx < 0 || idx >= size) {
      throw new IndexOutOfBoundsException();
    }
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
//    for (int x = 0; x < idx; x++) {
//      current = current.next();
//    }
//    current = new Node(value, );
//    current = current.next();
//    current = new Node(value, prev, next);
//    current = current.next();
//    current = new Node(current.getData(), value, current.next());
//  }
  public Integer remove(int idx) {
    if (idx < 0 || idx >= size) {
      throw new IndexOutOfBoundsException();
    }
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
    size--;
    return og;
  }
  public boolean remove(Integer value) {
    remove(indexOf(value));
    return true;
  }
}
