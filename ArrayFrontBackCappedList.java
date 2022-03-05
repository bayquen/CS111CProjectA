import java.util.Arrays;

public class ArrayFrontBackCappedList<T> implements FrontBackCappedListInterface<T> {
    private T[] list;
    private int numberOfEntries;
    private boolean initialized = false;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 25;

    public ArrayFrontBackCappedList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayFrontBackCappedList(int capacity) {
        if(initialized ==false) {   //FIXME: note - can simplify the false statement as !initialized
            T[] tempList = (T[]) new Comparable[capacity + 1];
            list = tempList;
            this.capacity = capacity;
            numberOfEntries = 0;
            initialized = true;
        }
    }

    @Override
    public String toString() {
        return "Size=" + numberOfEntries +"; " +
                "capacity=" + capacity + "; " + Arrays.toString(list) ;
    }

    @Override
    public boolean addFront(T newEntry) {
        return false;
    }

    @Override
    public boolean addBack(T newEntry) {
        return false;
    }

    @Override
    public T removeFront() {
        return null;
    }

    @Override
    public T removeBack() {
        return null;
    }

    @Override
    public void clear() {
        T[] tempList = (T[]) new ArrayFrontBackCappedList<?>[0];
        list = tempList;
        numberOfEntries = 0;
    }

    @Override
    public T getEntry(int givenPosition) { //FIXME: PART 1 METHOD TO BE DONE

        if (initialized && (givenPosition >= 0) && (givenPosition <= numberOfEntries)) {  //Checks if index is in valid range
            return (T) this.list[givenPosition];
        } else {
            return null;
        }
    }

    @Override
    public int indexOf(T anEntry) {
        return 0;
    }

    @Override
    public int lastIndexOf(T anEntry) {
        return 0;
    }

    @Override
    public boolean contains(T anEntry) {
        return false;
    }

    @Override
    public int size() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries >= capacity;
    }
}
