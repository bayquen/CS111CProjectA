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
        if(!initialized) {   //FIXME: note - can simplify the false statement as !initialized \\fixed by juan 3/9/22
            T[] tempList = (T[]) new Comparable[capacity + 1];
            list = tempList;
            this.capacity = capacity;
            numberOfEntries = 0;
            initialized = true;
        }
    }

    @Override
    public String toString() {
        String aString = "[";
        for (int i = 0; i < numberOfEntries; i++) {
            aString += list[i] + " ";
        }

        aString += "]";
        return "Size=" + numberOfEntries + "; " +
                "capacity=" + capacity + "; " + aString;
    }

 
    @Override
    public boolean addFront(T newEntry) {

        int lastIndex = numberOfEntries;
        if (numberOfEntries!=capacity)
        {
            for (int i = lastIndex; i >= 0; i--) {
                list[i + 1] = list[i];
            }
            list[0] = newEntry;
            numberOfEntries++;
            return true;
        }
        return false;
    }

	     public boolean addBack(T newEntry) {
	         if (numberOfEntries!=capacity)
	         {
	         list[numberOfEntries]=newEntry;
	         numberOfEntries++;
	         return true;
	         }
	         return false;
    } 

  @Override
    public T removeFront() {
        T removedItem = list[0];
        if (!isEmpty()){
            for (int i = 0; i <=numberOfEntries-1; i++){
                list[i] = list[i +1];
            }
            numberOfEntries--;
            return removedItem;
        }
        else { return null;
        }
    }

    @Override
        public T removeBack() {
      T removedItem = null;
      if (!isEmpty()){
        removedItem = list[numberOfEntries-1];
        list[numberOfEntries -1] = null;
        numberOfEntries--;
        return removedItem;
      }
        else {return removedItem;
          }
    }

  @Override
 public void clear() {
        T[] tempList = (T[]) new Comparable[capacity+1];
        numberOfEntries = 0;
        list = tempList;
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
        for (int index = 0; index < numberOfEntries; index++) {
            if (anEntry.equals(list[index])) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T anEntry) {
        for (int index = numberOfEntries - 1; index >= 0; index--) {
            if (anEntry.equals(list[index])) {
                return index;
            }
        }
        return -1;
    }


    @Override
    public boolean contains(T anEntry) {
        boolean found = false;
		int index = 0;
		while (!found && (index <= numberOfEntries)) {
			if (anEntry.equals(list[index])) {
				found = true;
			}
			index++;
		} 

		return found;
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
