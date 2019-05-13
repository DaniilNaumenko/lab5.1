import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class reiterationTest {

    @Test
    public void getDistinctValuesFrom() {

            // provide a list that contains dpulicates (input value)
            List<String> input = new ArrayList<String>();
            input.add("AAA");
            input.add("BBB");
            input.add("CCC");
            input.add("AAA");
            input.add("DDD");
            input.add("EEE");
            input.add("AAA");
            input.add("BBB");
            input.add("FFF");
            input.add("GGG");

            // provide an expected result
            List<String> expected = new ArrayList<String>();
            expected.add("AAA");
            expected.add("BBB");
            expected.add("CCC");
            expected.add("DDD");
            expected.add("EEE");
            expected.add("FFF");
            expected.add("GGG");

            // get the actual value of the (static) method with the input as argument
            List<String> actual = Reiteration.getDistinctValuesFrom(input);
            // assert the result of the test
            assertEquals(expected, actual);

    }

}
