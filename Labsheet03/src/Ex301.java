import javax.swing.*;
import java.util.Scanner;

public class Ex301 {
    static void main() {
        Scanner sc = new Scanner(System.in);

            int price = Integer.parseInt(JOptionPane.showInputDialog("Enter total price : "));
            int coupon = JOptionPane.showConfirmDialog(null,"Do you have coupon?",
                    "Select an Option",
                    JOptionPane.YES_NO_CANCEL_OPTION);

            if(coupon==0)
            {
                int discount = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "How mant discount(%) on the coupon?"));

                double beforeDiscount = price*(discount/100.0);
                double total = price-beforeDiscount;

                JOptionPane.showMessageDialog(null,
                        "You get discount "+beforeDiscount+" Baht.\n" +
                                "Total price is "+total+" Baht.");

            }else {
                if (price >= 1500) {
                    double discount = price * 0.10;
                    double total = price - discount;
                    JOptionPane.showMessageDialog(null, "You get discount 10% (" + discount + ")" +
                            "\nTotal price is " + total + " Baht.");

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Total price is " + price + " Baht.");

                }

            }












    }
}
