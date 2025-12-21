import javax.swing.*;
import java.util.Scanner;

public class Lab506 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: "));
        while (number<=1)
        {
         number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer Again!:"));
        }
        JOptionPane.showMessageDialog(null,number+" is "+(is_prime_number(number)?"":" NOT ")+"Prime number");

    }

    public static boolean is_prime_number(int number)
    {
      for (int i = 2;i<number;i++)
      {
          if(number%i==0)return false;
      }
      return true;
    }


}
