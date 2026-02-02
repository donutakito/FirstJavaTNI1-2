import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Birthday Cake's Details : ");
        System.out.print("Enter a message on cake : ");
        String msgOnCake = sc.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = sc.nextLine();
        System.out.print("How many pound : ");
        double pound = sc.nextDouble();

        BirthdayCake order1 = new BirthdayCake(msgOnCake,pound,flavor,350);
        System.out.print(order1);


        System.out.println("\nCup cake's  Details : ");
        System.out.print("Enter a flavor : ");
        String cup_flavor = sc.next();
        System.out.print("How many piece : ");
        int piece = sc.nextInt();

        CupCake order2 = new CupCake(piece,cup_flavor,65);
        System.out.print(order2);

        System.out.println("\n\nTotal price = "+(order1.calculateTotalPrice() + order2.calculateTotalPrice()));


        System.out.println("Donut Details :");
        System.out.print("Donut Flavor :");
        String donutFlavor = sc.nextLine();
        System.out.print("How many peice of Donut :");
        int peice = sc.nextInt();
        System.out.print("How many discount you get [baht.]: ");
        int discount = sc.nextInt();

        Donut order3 = new Donut(donutFlavor,peice,discount);
        System.out.print(order3);



    }











}
