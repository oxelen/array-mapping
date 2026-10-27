import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.oxelen.ArrayMapping;

public class ArrayMappingTest {
    @Test
    public void numbersTest() {
        Integer[] nums = {1, 2, 3, 4, 5};
        Integer[] expected = {2, 4, 6, 8, 10};

        Assertions.assertArrayEquals(expected, ArrayMapping.arrayMapping(nums, (num) -> num * 2));
    }

    @Test
    public void stringsTest() {
        String[] strings = {"a", "b", "c", "d", "e"};
        String[] expected = {"aTest", "bTest", "cTest", "dTest", "eTest"};

        Assertions.assertArrayEquals(expected, ArrayMapping.arrayMapping(strings, (str) -> str + "Test"));

        expected = new String[] {"Test", "Test", "Test", "Test", "Test"};
        Assertions.assertArrayEquals(expected, ArrayMapping.arrayMapping(strings, (str) -> str.substring(1)));
    }
}
