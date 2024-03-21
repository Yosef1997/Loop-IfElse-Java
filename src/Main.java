import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void reverseString() {
        System.out.println("Insert string to reverse: ");
        String input = scanner.nextLine();//        scanner.close();

        String[] inputArray = input.split("");
        StringBuilder reverseStringArray = new StringBuilder();
        for (int i = inputArray.length; i > 0; --i) {
            reverseStringArray.append(inputArray[i-1]);
        }
        System.out.println(reverseStringArray);
    }

    public static void convertCMToKM() {
        System.out.println("Insert input distance in CM: ");
        double input = Double.parseDouble(scanner.next());

        System.out.println(input + " CM = " + input/100000);
    }

    public static void inputNumberToArray() {
        boolean isContinue = false;

        StringBuilder resultString = new StringBuilder();

        while (!isContinue) {
            System.out.println("Insert integer to array: ");
            int input = scanner.nextInt();

            System.out.println("Do you want to add another value? (y/n):");
            String isWantAdd = scanner.next();

            resultString.append(input).append(",");

            if (!Objects.equals(isWantAdd, "y")) {
                isContinue = true;
            }
        }

        System.out.println("result = " + resultString);
    }

    public static void removeCurtainCharacter() {
        System.out.println("Insert string which will remove some of their character: ");
        String fullString = scanner.nextLine();

        System.out.println("Insert character which will remove from string: ");
        String removeCharacter = scanner.nextLine();

        String[] fullStringArray = fullString.split(removeCharacter);
        System.out.println(Arrays.toString(fullStringArray));
        StringBuilder result = new StringBuilder();

        for (String s : fullStringArray) {
            result.append(s);
        }

        System.out.println("result = " + result);
    }

    public static void checkPalindrome() {
        System.out.println("Insert string to check palindrome: ");
        String input = scanner.nextLine();

        String[] inputArray = input.split("");
        StringBuilder reverseStringArray = new StringBuilder();
        for (int i = inputArray.length; i > 0; --i) {
            reverseStringArray.append(inputArray[i-1]);
        }

        if(input.contentEquals(reverseStringArray)){
            System.out.println(input + " is palindrome");
            return;
        }

        System.out.println(input + " isn't palindrome");
    }

    public static void swapEachCharacter() {
        System.out.println("Insert string to swap each character: ");
        String input = scanner.nextLine();

        StringBuilder swapCharacter = new StringBuilder();
        for (char character : input.toCharArray()) {
            if (Character.isUpperCase(character)){
                swapCharacter.append(Character.toString(character).toLowerCase());
            } else {
                swapCharacter.append(Character.toString(character).toUpperCase());
            }
        }
        scanner.close();
        System.out.println(input + " -> " + swapCharacter);
    }

    public static void main(String[] args) {
//        reverseString();
//        convertCMToKM();
//        removeCurtainCharacter();
        inputNumberToArray();
        checkPalindrome();
        swapEachCharacter();

    }
}