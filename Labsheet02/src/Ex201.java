import java.text.DecimalFormat;

public class Ex201 {
    public static void main(String[] args) {

        String product ="PB-001",NamePro="Pencil Box";
        int item = 112;
        double price = 30.20;

        DecimalFormat frm = new DecimalFormat("#,###.00"); //อารมณ์เหมือน :n :f2 ในC#

        System.out.println("Product Name : "+NamePro+" ("+product+")");
        System.out.println("Product item : "+item+" ("+frm.format(price)+" baht/price)");

        double total = item*price;

        System.out.println("Total price : "+frm.format(total)+" baht.");
    }
}
