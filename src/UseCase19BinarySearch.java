import java.util.*;

public class UseCase19BinarySearch {
    public static void main(String[] args) {
        String[] ids = {"BG101","BG205","BG309","BG412"};

        Arrays.sort(ids);
        String key = "BG309";

        int low = 0, high = ids.length - 1;
        boolean found = false;

        while(low <= high) {
            int mid = (low + high)/2;
            int cmp = ids[mid].compareTo(key);

            if(cmp == 0) {
                found = true;
                break;
            } else if(cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        System.out.println("Found: " + found);
    }
}