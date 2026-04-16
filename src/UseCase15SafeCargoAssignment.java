class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String msg) {
        super(msg);
    }
}

class GoodsBogieUC15 {
    String type;
    String cargo;

    GoodsBogieUC15(String type) {
        this.type = type;
    }

    void assignCargo(String cargo) {
        try {
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Cannot assign Petroleum to Rectangular bogie");
            }
            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.\n");
        }
    }
}

public class UseCase15SafeCargoAssignment {
    public static void main(String[] args) {

        GoodsBogieUC15 b1 = new GoodsBogieUC15("Cylindrical");
        b1.assignCargo("Petroleum"); // valid

        GoodsBogieUC15 b2 = new GoodsBogieUC15("Rectangular");
        b2.assignCargo("Petroleum"); // invalid
    }
}