import java.util.*;

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

public class UseCase7SortBogies {

    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 60));
        list.add(new Bogie("First Class", 40));

        // Sort by capacity
        list.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Sorted Bogies: " + list);
    }
}