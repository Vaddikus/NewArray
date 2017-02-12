import java.util.Iterator;
import java.util.Objects;

/**
 * Created by vadymh on 2/1/2017.
 */
public class NewLinkedList<T> implements Iterable<T> {



    private class Element<T> {
        T value;
        Element next;


        public Element(T item) {

            value = item;
            this.next = null;
        }

    }


    private Element head;
    private int size = 0;


    public boolean add(T item) {
        if (Objects.equals(head, null)) {
            head = new Element(item);
            size++;
        } else {
            Element element = head;

            while (element.next != null) {
                element = element.next;
            }
            element.next = new Element(item);

            size++;
        }
        return true;
    }

    public void add(int index, T item) {
        if (index == 0) {
            addFirst(item);
            return;
        }
        int counter = 1;
        Element previous = head;
        Element current = previous.next;
        while (counter++ != index) {
            previous = current;
            current = previous.next;
        }
        Element newEl = new Element(item);
        previous.next = newEl;
        newEl.next = current;
        size++;
    }

    public void addFirst(T item) {
        Element second = head;
        head = new Element(item);
        head.next = second;
        size++;
    }

    public void addLast(T item) {
        add(item);
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public boolean contains(T item) {
        return indexOf(item) != -1;


    }

    public T element() {
        return getFirst();
    }


    public T getFirst() {
        return (T) head.value;
    }


    public T getLast() {
        return get(size() - 1);
    }


    public int indexOf(T item) {
        Iterator iter = iterator();
        int counter = 0;
            while (iter.hasNext()) {
                if (iter.next() == item)
                    return counter;
                counter++;
            }

        return -1;
    }

    @Override
    public Iterator iterator() {
        Element element = head;
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return element.next != null;
            }

            @Override
            public T next() {

                return (T) element.next;
            }
        };
    }



    public int lastIndexOf(T item) {
        for (int i = size() - 1; i >= 0; i--) {
            T value = get(i);
            if (value == item)
                return i;
        }
        return -1;
    }


    public T get(int i) {

        Element element = head;
        int counter = 0;
        while (counter < size) {
            if (i == counter) {
                return (T) element.value;
            }
            counter++;
            element = element.next;
        }

        return null;
    }


    public T remove() {
        Element element = head;
        head = element.next;
        size--;
        return (T) element.value;
    }


    public T removeFirst() {
        return remove();
    }


    public T removeLast() {

        return remove(size() - 1);
    }


    public T remove(int index) {

        if (index == 0) {
            return remove();
        }
        Element previous = head;
        Element current = previous.next;
        for (int i = 1; i < size(); i++) {
            if (i == index) {
                previous.next = current.next;
                size--;
                return (T) current.value;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    public boolean remove(T item) {
        int index = indexOf(item);
        if (remove(index) != null) {
            return true;
        }
        return false;
    }


    public T set(int index, T item) {
        int counter = 0;
        Element element = head;
        while (counter != index) {
            element = element.next;
            counter++;
        }
        element.value = item;
        return (T) element.value;
    }

    public int size() {
        return size;
    }


    public T[] toArray() {
        T[] array = (T[]) new Object[size()];
        for (int i = 0; i < size(); i++) {
            array[i] = get(i);
        }
        return array;
    }




}







