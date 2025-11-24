import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Id : ");
        String proId = sc.nextLine();
        System.out.print("Enter Product Name : ");
        String proName = sc.nextLine();
        System.out.print("Enter Product item : ");
        int item = sc.nextInt();
        System.out.print("Enter Price per piece : ");
        double price = sc.nextDouble();

        System.out.println("-------------------------------------------");
        DecimalFormat frm = new DecimalFormat("#,###.00");
        System.out.print("Product name : "+proName+" ("+proId+")"+"\nPoduct item : "+item+" ("+price+" baht/piece)"+"\nTotal price : "+frm.format(item*price)+" baht");

    }
}
