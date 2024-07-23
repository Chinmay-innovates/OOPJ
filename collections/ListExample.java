package collections;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple2");
        list.add("Cherry");
        list.add("grapes");
        list.add("Cherry");
        list.add("Banana");
        list.add("Berry");
        list.add("guava");
        System.out.println("List Example:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

    }
}
