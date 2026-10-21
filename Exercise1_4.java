public class Exercise1_4 {
    public static void main(String[] args) {
        double principal = 5000.00;
        double rate = 0.04;
        int years = 10;

        double amount = principal * Math.pow(1 + rate, years);

        System.out.println("Investment: $" + principal);
        System.out.println("Annual interest rate: " + (rate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.println("Amount after " + years + " years: $" + amount);
    }
}
