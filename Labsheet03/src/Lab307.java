import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab307 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat frm = new DecimalFormat("#.0");
        int price, total = 0;

     do
     {
         price = Integer.parseInt(JOptionPane.showInputDialog("Input price [press 0 to stop]:"));
         total+=price;

     }while(price!=0);

      JOptionPane.showMessageDialog(null,"Total price is "+frm.format(total)+" baht.");


    }
}
