public class ArrayCollection<T> implements CollectionInterface<T> {
    private T[] elements;
    private int numElements = 0;
    private boolean found;
    private int location;

    public ArrayCollection() {
        elements = (T[]) new Object[100];
    }

    private void find(T target) {
        found = false;
        location = 0;
        while (location < numElements) {
            if (elements[location].equals(target)) {
                found = true;
                return;
            }
            location++;
        }
    }

    public boolean add(T element) {
        if (isFull()) return false;
        elements[numElements] = element;
        numElements++;
        return true;
    }

    public T get(T target) {
        find(target);
        if (found) return elements[location];
        return null;
    }

    public boolean contains(T target) {
        find(target);
        return found;
    }

    public boolean remove(T target) {
        find(target);
        if (found) {
            elements[location] = elements[numElements - 1];
            elements[numElements - 1] = null;
            numElements--;
        }
        return found;
    }

    public boolean isFull() { return numElements == elements.length; }
    public boolean isEmpty() { return numElements == 0; }
    public int size() { return numElements; }

    public void print() {
        for (int i = 0; i < numElements; i++) {
            System.out.println(elements[i]);
        }
    }
}