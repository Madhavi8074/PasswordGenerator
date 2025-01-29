package projects;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_+=<>?/";
        String allCharacters = upperCaseLetters + lowerCaseLetters + numbers + specialCharacters;

        // Create a Random object for generating random numbers
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the desired password length: ");
        int passwordLength = scanner.nextInt();
        if (passwordLength < 6) {
            System.out.println("Password length should be at least 6 characters for better security.");
            return;
        }
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }
        System.out.println("Generated Password: " + password);
    }
}

