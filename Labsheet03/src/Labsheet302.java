import javax.swing.*;
import java.text.DecimalFormat;
import java.time.Year;
import java.util.Scanner;

public class Labsheet302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String name = JOptionPane.showInputDialog("Enter your name: ");
       int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height(cm.): "));

        DecimalFormat frm = new DecimalFormat("#.0");

       int gender = JOptionPane.showConfirmDialog(null,"Are you biological gender is Male?"
               ,"Gender",JOptionPane.YES_NO_OPTION);

       if (gender==0)
       {
              JOptionPane.showMessageDialog(null,"Hello,"+name+
                      "\nif your height is "+frm.format(height)+" cm."+
                      "\nYour weight should be "+frm.format(height-100)+" kg.");
       }else
       {
           gender=JOptionPane.showConfirmDialog(null,"Are you biological gender is Female?"
                   ,"Gender",JOptionPane.YES_NO_OPTION);

           if (gender==0)
           {
               JOptionPane.showMessageDialog(null,"Hello,"+name+
                       "\nif your height is "+frm.format(height)+" cm."+
                       "\nYour weight should be "+frm.format(height-110)+" kg.");
           }else
           {
               JOptionPane.showMessageDialog(null,"You can use BMI to measure your weight and your height.");
           }



       }












    }
}
