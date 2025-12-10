import java.text.DecimalFormat;

public class Ex201 {
    static void main() {
        String proId = "PB-001",proName = "Pencel Box";
        int manyPro = 112 ;
        double price = 30.20;

        DecimalFormat frm = new DecimalFormat("#,###.00");

        System.out.println("Product name : "+proName+" ("+proId+")");
        System.out.println("Product item : "+manyPro+ "("+price+" baht/piece)");
        System.out.print("Total price : "+frm.format(manyPro*price)+" baht.");
    }
}
