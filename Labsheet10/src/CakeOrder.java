import java.util.Scanner;

public class CakeOrder {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Birthday Cake's Details: ");
        System.out.print("Enter a message on Cake: ");
        String msg = sc.nextLine();
        System.out.print("Enter a flavor :");
        String flavor = sc.nextLine();
        System.out.print("How many pound : ");
        double pound = sc.nextDouble();

        BirthdayCake order1 = new BirthdayCake(msg,pound,flavor,350);
        System.out.println(order1);
        System.out.println();

        System.out.println("Cup cake's Details:");
        System.out.print("Enter a flavor : ");
        String flavorCupcake = sc.next();
        System.out.print("How many peice : ");
        int piece = sc.nextInt();

        CupCake order2 = new CupCake(piece,flavor,65);
        System.out.print(order2);



    }
}
