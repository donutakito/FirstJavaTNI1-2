import javax.swing.*;
import java.util.Scanner;

public class Lab309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int chicken = 99,pork = 89,beef = 109;
        int price = 0;

        while(true) {
            int ordermenu = JOptionPane.showConfirmDialog(null,
                    "Do you want to order menu?",
                    "Yakitori Shop", JOptionPane.YES_NO_OPTION);

            if (ordermenu == 0) {
                while (true) {
                    int order = Integer.parseInt(JOptionPane.showInputDialog("Yakitori Menu\n" +
                            "[1] Chicken Wing 99 B.\n" +
                            "[2] Pork with Leek 89 B.\n" +
                            "[3] Beef Tongue 109 B.\n" +
                            "[0] Exit and calculate\n" +
                            "Enter menu number:"));
                    switch (order) {
                        case 1: price += chicken; break;
                        case 2: price += pork; break;
                        case 3: price += beef;break;
                    }
                    if (order == 0) {
                        JOptionPane.showMessageDialog(null, "Total price is " + price + " Baht.");
                        break;
                    }

                }
            }else break;











        }



















    }
}
