import java.util.*;

public class UseCase3UniqueBogieIDs {

    public static void main(String[] args) {

        Set<String> ids = new HashSet<>();

        ids.add("BG101");
        ids.add("BG102");
        ids.add("BG101"); // duplicate

        System.out.println("Unique Bogie IDs: " + ids);
    }
}