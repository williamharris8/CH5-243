public class LinkedCollection<T> implements CollectionInterface<T> {
    private LLNode<T> head;
    private int numElements = 0;
    private boolean found;
    private LLNode<T> location;
    private LLNode<T> previous;

    private void find(T target) {
        found = false;
        location = head;
        previous = null;
        while (location != null) {
            if (location.getInfo().equals(target)) {
                found = true;
                return;
            }
            previous = location;
            location = location.getLink();
        }
    }

    public boolean add(T element) {
        LLNode<T> newNode = new LLNode<T>(element);
        newNode.setLink(head);
        head = newNode;
        numElements++;
        return true;
    }

    public T get(T target) {
        find(target);
        if (found) return location.getInfo();
        return null;
    }

    public boolean contains(T target) {
        find(target);
        return found;
    }

    public boolean remove(T target) {
        find(target);
        if (found) {
            if (location == head) {
                head = head.getLink();
            } else {
                previous.setLink(location.getLink());
            }
            numElements--;
        }
        return found;
    }

    public boolean isFull() { return false; }
    public boolean isEmpty() { return numElements == 0; }
    public int size() { return numElements; }

    public void print() {
        LLNode<T> current = head;
        while (current != null) {
            System.out.println(current.getInfo());
            current = current.getLink();
        }
    }
}