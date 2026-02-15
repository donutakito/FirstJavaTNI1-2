package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int espressoOrder = 0,frappucinoOrder = 0;
        double totalPrice=0;

        while (true)
        {
            System.out.print("Press 1 for ordering Espresso" +
                    "\nPress 2 for ordering Frappucino" +
                    "\nEnter an option: ");

            int option = sc.nextInt();

            if (option==1)
            {
                Espresso order1 = orderEspresso(); //order1 = methodEspresทั้งก้อน
                espressoOrder++;
                totalPrice+=order1.calculateFinalPrice();
            }else if (option==2)
            {
                Frappuccino order2 = orderFrappuccino(); //order2 = methodFrappuทั้งก้อน
                frappucinoOrder++;
                totalPrice+=order2.calculateFinalPrice();
            }else   //ถ้าUserกรอกเลข3 จะจบloop true
            {
                break;
            }

            System.out.print("\nDo you want to order more [y/Y]?: ");
            String orderMore = sc.next();
            System.out.println();

            if (!orderMore.equalsIgnoreCase("y")) break; //ถ้าoederMore!=y จบloopืทันที
        }
        System.out.println();
        System.out.print("Your ordered "+espressoOrder+" Espresso" +
                "\nYour ordered "+frappucinoOrder+" Frappucino" +
                "\nTotal Price = "+totalPrice);

    }

    static Espresso orderEspresso()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size: ");
        String size = sc.next();

        Espresso espresso = new Espresso(size); //contructor

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String addShot = sc.next(); //เพิ่มช็อต

        if (addShot.equalsIgnoreCase("y"))
        {
            System.out.print("How many shots for adding in Espresso?: ");
            espresso.addShot(sc.nextInt());
        }
        System.out.println(espresso); //แสดงtoString
        return espresso;
    }


    static Frappuccino orderFrappuccino()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entera size: ");
        String size = sc.next();

        System.out.print("Do you would like to add whipped cream [y/Y]?: ");
        String addWhip = sc.next();

        Frappuccino frappuccino;

        if (addWhip.equalsIgnoreCase("y"))
        {
            frappuccino = new Frappuccino(size, true); //ถ้าUser ตอบy คืนค่าtrueไป
        } else {
            frappuccino = new Frappuccino(size, false); //ถ้าUser ตอบ!=y คืนค่าfalseไป
        }
        System.out.println(frappuccino); //แสดงtoString
        return frappuccino;

    }


}
