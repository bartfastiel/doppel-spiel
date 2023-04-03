import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    List<Thing> things = new ArrayList<>();

    Thing add(Thing a, Thing b, Thing c) {
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
