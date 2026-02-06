import java.util.Scanner;

public class CakeOrder2 extends Bakery {

    String selectFlavor()
    {
        Scanner sc = new Scanner(System.in);
        String flavor = "";
        System.out.print("Press 1 for Chocolate" +
                "\nPress 2 for Vanilla" +
                "\nPress 3 for Strawberry" +
                "\nPress 4 for Lemon" +
                "\nPress 5 for Red Velvet" +
                "\nEnter a flavor number: ");
        int flavorChoice = sc.nextInt(); //ช้อยตัวเลือก
        while (flavorChoice<1||flavorChoice>5) //ถ้าป้อนนอกเหนือจาก1-5ให้วนใหม่
        {
            System.out.print("Enter a flavor number: ");
            flavorChoice = sc.nextInt();
        }

        if (flavorChoice==1) flavor="Chocolate"; //returnค่าตามที่เห็น
        if (flavorChoice==2) flavor="Vanilla";
        if (flavorChoice==3) flavor="Strawberry";
        if (flavorChoice==4) flavor="Lemon";
        if (flavorChoice==5) flavor="Red Velvet";
        return flavor; //return resultนะ
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CakeOrder2 callFlavor = new CakeOrder2(); //เอาไว้เรียก selectFlavor
        System.out.print("Press 1 to order Birthday Cake" +
                "\nPress 2 to order Cup Cake" +
                "\nPress 3 to order Donut"+
                "\nEnter an option: ");
        int option = sc.nextInt();
        System.out.println();

        if (option == 1) { //สั่งเค้ก
            String flavor = callFlavor.selectFlavor(); //เรียกใช้selectFlavor()
            sc.nextLine();
            System.out.print("\nEnter a message: ");
            String msg = sc.nextLine();
            System.out.print("How many pound: ");
            double pound = sc.nextDouble();
            BirthdayCake orderCake = new BirthdayCake(msg, pound, flavor, 350);
            System.out.print("\n"+orderCake);
        } else if (option == 2) {
            String flavor=callFlavor.selectFlavor();  //เรียกใช้selectFlavor()
            System.out.print("\nHow many pieces: ");
            int piece = sc.nextInt();
            System.out.println();
            CupCake orderCupCake = new CupCake(piece,flavor, 70);
            System.out.print("\n"+orderCupCake);
        } else if (option==3)
        {
            String flavor=callFlavor.selectFlavor();  //เรียกใช้selectFlavor()
            System.out.print("\nHow many peice of Donut: ");
            int peice = sc.nextInt();
            System.out.print("How many discount you get [baht.]: ");
            int discount = sc.nextInt();
            Donut orderDonut = new Donut(flavor,peice,discount);
            System.out.print("\n"+orderDonut);

        }else
        {
            System.out.println("Wrong option!! Try again!!");return; //return=break;
        }


    }
}
