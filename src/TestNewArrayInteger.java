
/**
 * Created by vadym on 29.01.17.
 */
public class TestNewArrayInteger {
    public static void main(String[] args) {
        NewArray<Integer> list = new NewArray();
        list.add(100);
        list.add(3);
        list.add(2);
        list.add(567);
        list.add(456);
        System.out.println("List size before removing: " + list.size());
        System.out.println("Element with 4-th index is " + list.get(4));
        list.remove(3);
        System.out.print("List after removing: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("List length after removing: " + list.size());
        list.remove((Integer) 3);

        System.out.println("List after removing \"3\": ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("List length after removing: " + list.size());
    }
}
