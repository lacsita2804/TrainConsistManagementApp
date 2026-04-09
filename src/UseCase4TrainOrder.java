import java.util.*;

public class UseCase4TrainOrder {

    public static void main(String[] args) {

        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Insert Pantry at position 2
        train.add(2, "Pantry");

        // Remove first and last
        train.removeFirst();
        train.removeLast();

        // Display final train
        System.out.println("Final Train: " + train);
    }
}