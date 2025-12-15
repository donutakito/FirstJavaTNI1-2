import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab501 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int answer = JOptionPane.showConfirmDialog(null,"Do you want to check your BMI?",
                "Check BMI",JOptionPane.YES_NO_OPTION);

        if(answer==0)
        {
            double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight(kg.):"));
            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm.):"));
            double heightM = height / 100.0; //แปลงส่วนสู.จากเซนติเมตรเป็ฯเมตร
            double bmi = cal_bmi(weight,heightM); //เรียกใช้เมธอดcalbmi
            String result = check_bmi(bmi);
            DecimalFormat frm = new DecimalFormat(".##");

            JOptionPane.showMessageDialog(null,"Your BMI = "+frm.format(bmi)+
                    "\nYour BMI result = "+result);

        }else
        {
            JOptionPane.showMessageDialog(null,"END PROGRAM!!");
        }
    }

    static double cal_bmi(double weight,double heightM)
    {
        double bmi = weight / (heightM * heightM);
        return  bmi;
    }

    static String check_bmi(double bmi)
    {
       String result = " " ;
       if (bmi>30)
       {
           result = "Obese";
       } else if (bmi<=18.5) {
           result = "Under Weight";
       } else if (bmi<=24.9) {
           result = "Healthy Weight";
       }else if (bmi<=29.9)
       {
           result = "Over Weight";
       }
       return result ;
    }


}
