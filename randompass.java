import java.security.SecureRandom;
import java.util.Scanner;

class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();

        System.out.print("Include numbers (yes/no): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include lowercase letters (yes/no): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include uppercase letters (yes/no): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters (yes/no): ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("yes");

        String password = generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecialChars);
        System.out.println("Generated Password: " + password);
    }

    private static String generatePassword(int length, boolean includeNumbers, boolean includeLowercase, boolean includeUppercase, boolean includeSpecialChars) {
        String numbers = "0123456789";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()-+=";

        String validChars = "";
        if (includeNumbers) {
            validChars += numbers;
        }
        if (includeLowercase) {
            validChars += lowercase;
        }
        if (includeUppercase) {
            validChars += uppercase;
        }
        if (includeSpecialChars) {
            validChars += specialChars;
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }

        return password.toString();
    }
}

