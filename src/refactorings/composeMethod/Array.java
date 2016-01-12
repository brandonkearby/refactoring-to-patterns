package refactorings.composeMethod;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public class Array {

    private int size;
    private boolean readOnly;
    private Object[] elements;

    public Array(int size, boolean readOnly, Object[] elements) {
        this.size = size;
        this.readOnly = readOnly;
        this.elements = elements;
    }

    public void add(Object object) {
        if (readOnly) {
            return;
        }
        int newSize = size+1;
        if (atCapacity(newSize)) {
            grow();
        }
        addElement(object);
    }

    private void addElement(Object object) {
        elements[size++] = object;
    }

    private void grow() {
        Object[] newElements = new Object[elements.length + 10];
        for (int i=0; i < newElements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    private boolean atCapacity(int newSize) {
        return newSize > elements.length;
    }
}
