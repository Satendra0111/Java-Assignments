//Array List

import java.util.ArrayList;
import java.util.Collections;

public class arrList {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();

        name.add("Sam");
        name.add("tim");
        System.out.println(name);
        name.remove(0);
        System.out.println(name);
        name.set(0, "Sam");
        System.out.println(name);
        name.add("singh");
        name.add("test");
        System.out.println(name);
        Collections.reverse(name);
        System.out.println(name);

        Collections.shuffle(name);
        System.out.println(name);
    }

}
