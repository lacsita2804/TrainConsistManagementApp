import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class UseCase8FilterBogies {

    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 60));
        list.add(new Bogie("First Class", 40));

        List<Bogie> filtered = list.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        System.out.println("Filtered Bogies: " + filtered);
    }
}