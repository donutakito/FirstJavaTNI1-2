import javax.swing.*;
import java.util.Scanner;

public class Lab302 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String name = JOptionPane.showInputDialog("Enter your name:");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm.):"));
        int gender = JOptionPane.showConfirmDialog(null,
                "Are your biological gender is Male?"
                ,"Gender"
                ,JOptionPane.YES_NO_OPTION);

        if(gender==0)
        {
            JOptionPane.showMessageDialog(null,"Hello,Mr."+name+
                    "\nIf your height is "+height+" cm."+
                    "\nYour weight should be "+(height-100)+" kg.");
        }else
        {
            gender = JOptionPane.showConfirmDialog(null,
                    "Are your biological gender is Female?"
                    ,"Gender"
                    ,JOptionPane.YES_NO_OPTION);
            if (gender==0)
            {
                JOptionPane.showMessageDialog(null,"Hello,Ms."+name+
                        "\nIf your height is "+height+" cm."+
                        "\nYour weight should be "+(height-110)+" kg.");
            }else {
              JOptionPane.showMessageDialog(null,"You must use BMI to measure your weight and height.");
            }
        }



    }
}
