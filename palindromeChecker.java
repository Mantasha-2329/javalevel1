 class palindromeChecker {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama"; 

        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String reversedInput = new StringBuilder(cleanInput).reverse().toString();

        if (cleanInput.equals(reversedInput)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

