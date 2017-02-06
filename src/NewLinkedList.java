import java.util.Objects;

/**
 * Created by vadymh on 2/1/2017.
 */
public class NewLinkedList<T> {
    Element head;


    public int size = 0;

    public int size() {
        return size;
    }


    public void add(T item) {
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
    }

    public T get(int i) {

        Element element = head;
        int counter = 0;
        while (element.next != null) {
            if (i == counter) {
                return (T) element.value;
            }
            counter++;
            element = element.next;
        }

        return (T) element.value;
    }

    private class Element<T> {
        T value;
        Element next;


        public Element(T item) {

            value = item;
            this.next = null;
        }

    }

}







