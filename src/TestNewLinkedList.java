import java.util.LinkedList;

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
        list.add("Vad");
//        System.out.println(list.size());
//         for (int i = 0; i < list.size() ; i++) {
//            System.out.println(i + ": " + list.get(i));
//        }

//        list.add(3,"First");
//        System.out.println(list.size());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(i + ": " + list.get(i));
//        }
//        System.out.println(list.indexOf("Vad"));
//        System.out.println(list.lastIndexOf("Vad"));
//        System.out.println(list.remove(2));
//        list.set(2,"Croomberg");
//        for (int i = 0; i < list.size() ; i++) {
//            System.out.println(i + ": " + list.get(i));
//        }
        Object[] ar = list.toArray();
        for (Object s : ar) {
            System.out.println(s);

        }

    }
}
