import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesTest {

    @Test
    void testDuplicates() {
        Duplicates duplicates = new Duplicates();
        var actual = duplicates.add("Hat", "Rubber duck", "Scissors");
        assertEquals(null, actual);
    }



    @Test
    void testDuplicates2() {
        Duplicates duplicates = new Duplicates();
        duplicates.add("Hat", "Rubber duck", "Scissors");
        var actual = duplicates.add("Paper_clip", "Hat", "Water_bottle");
        assertEquals("Hat", actual);
    }

    @Test
    void testDuplicates3() {
        Duplicates duplicates = new Duplicates();
        duplicates.add("Hat", "Rubber duck", "Scissors");
        var actual = duplicates.add("Paper_clip", "Hat", "Water_bottle");
        assertEquals("Hat", actual);
    }

    @Test
    void testDuplicates4() {
        Duplicates duplicates = new Duplicates();
        for (int i = 0; i < 100_000; i+=3) {
            duplicates.add("Item"+i, "Item"+(i+1), "Item"+(i+2));
        }
        var actual = duplicates.add("ItemX", "Item"+4200, "ItemY");
        assertEquals("Item4200", actual);
    }



}