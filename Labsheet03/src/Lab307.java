import javax.swing.*;
import java.util.Scanner;

public class Lab307 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double num,sum=0;

        do{
            num = Double.parseDouble(JOptionPane.showInputDialog("Input price [press 0 to stop]:"));
            while(num<0)
            {
                num = Double.parseDouble(JOptionPane.showInputDialog("Invalid price!!!\nInput price [press 0 to stop]:"));
            }
            sum+=num;
        }while(num!=0);

        JOptionPane.showMessageDialog(null,"Total price is "+sum);








    }
}
