import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {

        final double DELEK_95_IN_NIS = 7.5;
        final double SOLAR_IN_NIS = 8.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please insert type and quantity:");

        int type = scan.nextInt();
        double quantity = scan.nextDouble();

        double totalPrice = 0;

        if (type == 1) {
            totalPrice = DELEK_95_IN_NIS * quantity;
        } else if (type == 2) {
            totalPrice = SOLAR_IN_NIS * quantity;
        } else {
            System.out.print("Please insert correct type!");
        }

        System.out.println("Total price is: " + totalPrice);
    }
}
/*
Type:
1==> 95 --> 7.5
2==> Diesel --> 8.0
--

quantity:3

totalPrice= ...
 */