import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product id   : ");
        String proId = sc.nextLine();
        System.out.print("Enter product name : ");
        String proName = sc.nextLine();
        System.out.print("Enter product item : ");
        int proItem = sc.nextInt();
        System.out.print("Enter price per piece : ");
        double piece = sc.nextDouble();
        System.out.println("---------------------------------------");

        DecimalFormat frm = new DecimalFormat("#,###.00");

        System.out.print("Product name : "+proName+" ("+proId+")"+
                "\nProduct item : "+proItem+" ("+piece+" bahht/piece)"+
                "\nTotal price : "+frm.format(proItem*piece));
    }
}
