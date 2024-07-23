package collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<Integer> s = new HashSet<>();
        Iterator<Integer> it = s.iterator();
        s.add(33);
        s.add(12);
        s.add(2214);
        s.add(44234512);
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Diamond");
        set.add("Egg");
        set.add("Egg 2");
        set.add("Egg 3");
        set.add("Egg 4");

        System.out.println("Set Example:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
        for (Integer num : s) {
            System.out.println(num);
        }
    }

}
