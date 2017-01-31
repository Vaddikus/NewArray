
/**
 * Created by vadym on 26.01.17.
 */
public class NewArray<T> {

    public Object[] array;
    int iter = 0;
    int length;

    public NewArray() {
        this.length = 1;
        array = new Object[length];
    }

    public NewArray(int length) {
        this.length = length;
        array = new Object[length];
    }

    public int size() {
        return length;
    }

    public void add(T item) {
        if (iter < array.length) {
            array[iter++] = item;
        } else if (iter >= array.length) {
            Object[] temp = new Object[++length];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
            add(item);
        }
    }

    public void remove(int item) {
        Object[] temp = new Object[array.length - 1];
        array[item] = null;
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != null) {
                temp[j] = array[i];
                j++;
            }
        }
        array = temp;
        length--;

    }

    public void remove(T o) {
        Object[] temp = new Object[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (!o.equals(array[i])) {
                temp[j] = array[i];
                j++;
            }
        }
        array = temp;
        length--;

    }


    public T get(int i) {
        return (T) array[i];
    }

}
