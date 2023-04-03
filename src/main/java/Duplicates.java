import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    List<String> things = new ArrayList<>();

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
