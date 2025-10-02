public class PrintVowelsAndNonVowels {
    public static void main(String[] args) {
        String input = "AEIOUaeiou!";
        printVowelsAndNonVowels(input);
    }

    public static void printVowelsAndNonVowels(String str) {
        String vowels = "";
        String nonVowels = "";
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels += c;
            } else if (Character.isLetter(c)) {
                nonVowels += c;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Non-Vowels: " + nonVowels);
    }
}
