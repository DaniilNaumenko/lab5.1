import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Count {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        long count = countStrings(stringList);

        System.out.println("count = " + count);

    }

    public static long countStrings(List<String> stringList) {
        Stream<String> stream = stringList.stream();

        return stream
                .map((value) -> { return value.toLowerCase(); })
                .count();
    }
}