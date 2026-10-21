import java.util.Scanner;

public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = PI * Math.pow(radius, 2);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        input.close();
    }
}
