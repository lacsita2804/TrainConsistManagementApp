public class UseCase20SearchValidation {
    public static void main(String[] args) {
        String[] ids = {};

        if(ids.length == 0)
            throw new IllegalStateException("No bogies available!");

        String key = "BG101";
        boolean found = false;

        for(String id : ids) {
            if(id.equals(key)) {
                found = true;
                break;
            }
        }

        System.out.println("Found: " + found);
    }
}