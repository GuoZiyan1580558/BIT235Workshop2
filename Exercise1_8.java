import java.util.Scanner;

public class Exercise1_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        boolean isEqual = str1.equals(str2);
        System.out.println("The two given strings are equal: " + isEqual);

        if (str1.length() > 0 && str2.length() > 0) {
            char firstChar1 = str1.charAt(0);
            char firstChar2 = str2.charAt(0);
            System.out.println("First character of first string: " + firstChar1);
            System.out.println("First character of second string: " + firstChar2);
        }

        input.close();
    }
}
