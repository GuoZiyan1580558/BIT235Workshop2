public class Exercise1_6 {
    public static void main(String[] args) {
        double fuelNormal = 8;
        double fuelRough = 8 * 1.15;
        double tankCapacity = 40;

        double distanceNormal = tankCapacity / fuelNormal * 100;
        double distanceRough = tankCapacity / fuelRough * 100;

        System.out.println("Distance on normal roads: " + distanceNormal + " km");
        System.out.println("Distance on rough roads: " + distanceRough + " km");
    }
}
