import java.util.Objects;

/**
 * Created by vadym on 26.01.17.
 */
public class NewArraySimple<T> {

    public Object[] array;


    public NewArraySimple() {
        array = new Object[0];
    }


    public int size() {
        return array.length;
    }

    public void add(T item) {
        if (array.length == 0) {
            array = new Object[1];
            array[array.length - 1] = item;
        } else {
            Object[] temp = new Object[array.length + 1];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
            array[array.length - 1] = item;

        }
    }

    public void remove(int index) {
        Object[] temp = new Object[array.length - 1];
        System.arraycopy(array, 0, temp, 0, index);
        System.arraycopy(array, index + 1, temp, index, array.length - index - 1);

        array = temp;
    }

    public void remove(T item) {
        int ind = indexOf(item);
        if (ind >= 0){
            remove(ind);
        }
    }


    public int indexOf(T item) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(item, array[i]))
                return i;
        }
        return -1;
    }


    public T get(int i) {
        return (T) array[i];
    }

}
