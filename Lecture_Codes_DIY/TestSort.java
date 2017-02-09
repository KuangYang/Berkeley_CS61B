import org.junit.Test;
import static org.junit.Assert.*;

public class TestSort {

    @Test
    public void testSort() {
        String[] inputs = {"milvia", "zero", "josh", "trump"};
        String[] expected = {"josh", "milvia", "trump", "zero"};
        String[] actual = Sort.sort(inputs);

        assertArrayEquals(expected, actual);

/*
        if (expected.length != actual.length) {
            System.out.println("Lengths did not match.");
            System.out.println("Expected: " + expected.length);
            System.out.println("Actual: " + actual.length);
        }

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].equals())
        }*/
    }

    @Test
    public void testIndexOfSmallest() {
        String[] inputs = {"milvia", "zero", "josh", "trump"};
        int expected = 2;
        int actual = Sort.indexOfSmallest(inputs, 2);

        assertEquals(expected, actual);

        expected = 3;
        actual = Sort.indexOfSmallest(inputs, 3);

        assertEquals(expected, actual);
    }

    public static void main(String[] args) {
        jh61b.junit.TestRunner.runTests("all", TestSort.class);
    }
}
