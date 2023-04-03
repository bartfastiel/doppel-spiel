import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesTest {

    @Test
    void testDuplicates() {
        Duplicates duplicates = new Duplicates();
        var actual = duplicates.add(Thing.Hat, Thing.Rubber_duck, Thing.Scissors);
        assertEquals(null, actual);
    }



    @Test
    void testDuplicates2() {
        Duplicates duplicates = new Duplicates();
        duplicates.add(Thing.Hat, Thing.Rubber_duck, Thing.Scissors);
        var actual = duplicates.add(Thing.Paper_clip, Thing.Hat, Thing.Water_bottle);
        assertEquals(Thing.Hat, actual);
    }



}