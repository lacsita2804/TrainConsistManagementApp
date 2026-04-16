import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase9GroupBogies {
    public static void main(String[] args) {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 40)
        );

        Map<String, List<Bogie>> grouped =
                bogies.stream().collect(Collectors.groupingBy(b -> b.name));

        System.out.println("Grouped Bogies:\n");

        for (String key : grouped.keySet()) {
            System.out.println(key + ": " + grouped.get(key).size() + " bogies");
        }
    }
}