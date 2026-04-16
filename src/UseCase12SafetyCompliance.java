import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UseCase12SafetyCompliance {
    public static void main(String[] args) {

        List<GoodsBogie> list = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal"),
                new GoodsBogie("Cylindrical", "Petroleum")
        );

        boolean isSafe = list.stream().allMatch(b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
        );

        System.out.println("Is Train Safe: " + isSafe);
    }
}