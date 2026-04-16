import java.util.regex.*;

public class UseCase11RegexValidation {
    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        boolean isTrainValid = Pattern.matches(trainPattern, trainId);
        boolean isCargoValid = Pattern.matches(cargoPattern, cargoCode);

        System.out.println("Train ID: " + trainId + " → " + (isTrainValid ? "Valid" : "Invalid"));
        System.out.println("Cargo Code: " + cargoCode + " → " + (isCargoValid ? "Valid" : "Invalid"));
    }
}