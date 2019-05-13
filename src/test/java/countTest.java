import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class countTest {

    @Test
    public void countStrings() {
        List<String> testStringList = new ArrayList<String>();

        testStringList.add("A");
        testStringList.add("B");
        testStringList.add("C");
        testStringList.add("D");

        assertEquals(4, Count.countStrings(testStringList));
    }
}