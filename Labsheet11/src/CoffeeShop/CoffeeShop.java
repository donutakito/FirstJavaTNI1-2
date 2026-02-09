package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // while (true) {
            System.out.print("Press 1 for ordering Espresso" +
                    "\nPress 2 for ordering Frappucino" +
                    "\nEnter an option: ");
            int pressOrder = sc.nextInt();

            if (pressOrder==1)
            {
                orderEspresso();
            }


       // }



    }

    static Espressso orderEspresso()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size: ");
        String size = sc.next();

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String addShot = sc.next();

        Espressso order1 = new Espressso(size);
        return order1;
    }

   /* Frappuccino orderFrappucino()
    {

    }*/

}
