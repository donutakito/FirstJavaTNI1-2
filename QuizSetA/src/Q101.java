import javax.swing.*;
import java.util.Scanner;

public class Q101 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));

        while (number<=1)
        {
            number = Integer.parseInt(JOptionPane.showInputDialog("The number must be greater than 1\nEnter an integer:"));
        }

        String findFizzBuzz="";

        for (int i=1;i<=number;i++)
        {

            boolean fizz = (i%3==0);
            boolean buzz = (i%5==0);

            if(buzz&&fizz)
            {
                findFizzBuzz += "FizzBuzz"+"\n";
            } else if (fizz) {
                findFizzBuzz +="Fizz"+"\n";
            } else if (buzz) {
                findFizzBuzz +="Buzz"+"\n";
            }else
            {
                findFizzBuzz +=i+"\n";
            }

        }

        JOptionPane.showMessageDialog(null,findFizzBuzz);

    }
}

