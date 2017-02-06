/**
 * Created by vadymh on 2/2/2017.
 */
public class TestNewLinkedList {
    public static void main(String[] args) {
        NewLinkedList<String> list = new NewLinkedList<>();

        list.add("Hello");
        list.add("Voice");
        list.add("Test");
        list.add("Vad");
        list.add("Roma");
        list.add("Bogdan");
        System.out.println(list.size());
         for (int i = 0; i < list.size() ; i++) {
            System.out.println(i + ": " + list.get(i));
        }

    }
}
