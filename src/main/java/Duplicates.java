import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

    Set<String> things = new HashSet<>();

    String add(String a, String b, String c) {
        if (things.contains(a)) {
            return a;
        }
        things.add(a);
        if (things.contains(b)) {
            return b;
        }
        things.add(b);
        if (things.contains(c)) {
            return c;
        }
        things.add(c);
        return null;
    }
}
