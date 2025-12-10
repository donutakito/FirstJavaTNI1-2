import javax.swing.*;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Lab206 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        final int buffet = 299;
        DecimalFormat frm = new DecimalFormat("#,###.00");


        int customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer?"));
        double net = (buffet*customer) *1.07; //หาราคา+NET

        int discount = Integer.parseInt(JOptionPane.showInputDialog("Price with NET is "+frm.format(net) +" baht."+
                "\nHow much of discount(%) on you coupon?"));

        double afterdis = net * (1 - discount/100.0);

        int paid = Integer.parseInt(JOptionPane.showInputDialog("Total price is "+frm.format(afterdis)+" baht."+
               "\nEnter the amount the customer paid:"));


        JOptionPane.showMessageDialog(null,"Total price is "+afterdis+" baht."+
                "\nCustomer paid "+paid+" baht."+
                "\nGet changes "+frm.format(paid-afterdis)+" baht.");




    }
}


