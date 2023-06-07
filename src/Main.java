public class Main {
    public static void main(String[] args) {
        int springCost = 400; // simulated user input values
        int summerCost = 600;
        int fallCost =400;
        int winterCost = 800;
        int totalMaintenance = springCost + summerCost + fallCost + winterCost;
        System.out.println("Combining your seasonal maintenance costs of $" + springCost + " in the spring, $" + summerCost + " in the summer, $" + fallCost + " in the fall, and $" + winterCost + " in the winter:");
        System.out.println("Your total annual house maintenance is $" + totalMaintenance);


    }
}