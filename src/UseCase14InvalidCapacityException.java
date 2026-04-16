class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String msg) {
        super(msg);
    }
}

class PassengerBogie {
    String name;
    int capacity;

    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase14InvalidCapacityException {
    public static void main(String[] args) {

        try {
            PassengerBogie b = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b.name);
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}