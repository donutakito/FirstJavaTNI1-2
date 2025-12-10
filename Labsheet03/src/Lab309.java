import javax.swing.*;
import java.util.Scanner;

public class Lab309 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int chicken = 99,pork=89,beef=109,totalPrice=0;


       while (true) {

           int menu = JOptionPane.showConfirmDialog(null, "Do you want to order menu?",
                   "Yakitori shop", JOptionPane.YES_NO_OPTION);

           if (menu == 0) {

               while (true) {

                   int order = Integer.parseInt(JOptionPane.showInputDialog("Yakitori Menu\n" +
                           "[1] Chicken Wing 99 B.\n" +
                           "[2] Pork with Leek 89 B.\n" +
                           "[3] Beef Tongue 109 B.\n" +
                           "[0] Exit and Calculate\n" +
                           "Enter menu number:"));

                   switch (order) {
                       case 1:
                           totalPrice += chicken;
                           break;
                       case 2:
                           totalPrice += pork;
                           break;
                       case 3:
                           totalPrice += beef;
                           break;
                   }
                   if (order == 0) {
                       JOptionPane.showMessageDialog(null, "Total price is " + totalPrice + " Baht.");
                       break;
                   }
               }

           }else break;










       }




















    }
}
