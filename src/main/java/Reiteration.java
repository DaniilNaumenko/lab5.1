import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reiteration {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");
        stringList.add("ONE");

        System.out.println (getDistinctValuesFrom(stringList));
    }

        public static List<String> getDistinctValuesFrom(List<String> list) {
            return list
                    .stream()
                    .distinct()
                    .collect(Collectors.toList());
        }
}