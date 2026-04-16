import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase13PerformanceComparison {
    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new Bogie("Bogie" + i, i % 100));
        }

        // Loop
        long start1 = System.nanoTime();
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : list) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }
        long end1 = System.nanoTime();

        // Stream
        long start2 = System.nanoTime();
        List<Bogie> streamResult = list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long end2 = System.nanoTime();

        System.out.println("Loop Time: " + (end1 - start1) + " ns");
        System.out.println("Stream Time: " + (end2 - start2) + " ns");
    }
}