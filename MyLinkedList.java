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
    if (size == 0) {
      start = new Node(value, null, null);
      end = start;
      size++;
      return true;
    }
    else {
      Node newEnd = new Node(value, null, end);
      end.setNext(newEnd);
      end = newEnd;
      size++;
      return true;
    }
  }
  public String toString() {
    String output = "[";
    Node current = start;
    int idx = 0;
    while (current != null && idx < size - 1) {
      output += current + ", ";
      current = current.next();
      idx++;
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
    current.setData(value);
    return og;
  }
  public boolean contains(Integer value) {
    Node current = start;
    while (current != null) {
      if (current.getData() == value) {
        return true;
      }
      current = current.next();
    }
    return false;
  }
//  public boolean contains(Integer value) {
//    if (indexOf(value) == -1) {
//      return false;
//    }
//    return true;
//  }
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
  public void add(int idx, Integer value) {
    if (idx < 0 || idx >= size) {
      throw new IndexOutOfBoundsException();
    }
    Node current = start;
    if (idx == 0) {
      current = new Node(value, start, null);
      start = current;
    }
    for (int x = 0; x < idx - 1; x++) {
      current = current.next();
    }
    Node newNode = new Node(value, current.next(), current);
    current.setNext(newNode);
    current = current.next().next();
    current.setPrev(newNode);
    size++;
  }
  public Integer remove(int idx) {
    if (idx < 0 || idx >= size) {
      throw new IndexOutOfBoundsException();
    }
    if (idx == size - 1) {
      int og = end.getData();
      end = end.prev();
      end.setNext(null);
      return og;
    }
    Node current = start;
    for (int x = 0; x < idx; x++) {
      current = current.next();
    }
    Integer og = current.getData();
    current.setNext(current.next().next());
    Node newCurrent = current.next().next();
    newCurrent.setPrev(current);
    size--;
    return og;
  }
  public boolean remove(Integer value) {
    try {
      remove(indexOf(value));
      size--;
      return true;
    }
    catch(IndexOutOfBoundsException e) {
      return false;
    }
  }
}
