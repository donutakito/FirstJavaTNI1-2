import javax.swing.*;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab304 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight (kg.):"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm.):"));

        double heightM = height/100;
        double bmi = weight/(heightM*heightM);
        String result ;

       if(bmi>=30)
       {
           result = "Obese";
       } else if (bmi>=25) {
           result = "Overweight";
       } else if (bmi>=18.5) {
           result = "Healthly Weight";
       } else {
           result = "Under Weight";
       }

        DecimalFormat frm = new DecimalFormat(".##");

       JOptionPane.showMessageDialog(null,"Your BMI is "+frm.format(bmi)+
               "\nBMI result is "+result);
           



    }
}
