public class Exercise1_7 {
    public static void main(String[] args) {
        String original = "I love java programming";
        String result = original.substring(7, 11);

        System.out.println("Original string: " + original);
        System.out.println("Substring from index 7 to 11: " + result);
        System.out.println("Length of the substring: " + result.length());
    }
}
