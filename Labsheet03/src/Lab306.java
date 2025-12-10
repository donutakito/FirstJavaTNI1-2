import javax.swing.*;
import java.util.Scanner;

public class Lab306 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        int sum = 0 ;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer number: "));

        for(int i = 1;i<=num;i++)
        {
            sum+=i;
        }

        JOptionPane.showMessageDialog(null,"Summation of 1 to "+num+" is "+sum);



    }
}
