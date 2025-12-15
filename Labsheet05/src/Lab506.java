import javax.swing.*;
import java.util.Scanner;

public class Lab506 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));

        while (number <= 1) {
            number = Integer.parseInt(JOptionPane.showInputDialog("Number must be more 1 !!\n" +
                    "Enter an integer again:"));
        }

        boolean findPrimeNum = is_prime_number(number);

        if(findPrimeNum)
        {
            JOptionPane.showMessageDialog(null,number+" is Prime number");
        }else
        {
            JOptionPane.showMessageDialog(null,number+" is NOT Prime number");
        }
    }

    static boolean is_prime_number(int number)
    {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
