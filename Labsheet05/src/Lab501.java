import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab501 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int answer = JOptionPane.showConfirmDialog(null, "Do you want to check your BMI?",
                    "Check BMI", JOptionPane.YES_NO_OPTION);

            if (answer == 0) {
                double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight (kg.):"));
                double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm.):"));
                double bmi = cal_bmi(weight, height);
                String checkBmi = check_bmi(bmi);

                DecimalFormat frm = new DecimalFormat("##.##");
                JOptionPane.showMessageDialog(null, "Your BMI = " + frm.format(bmi) +
                        "\nYour BMI result = " + checkBmi);
            } else if (answer == 1) {
                JOptionPane.showMessageDialog(null, "END PROGRAM!!!");break;
            }
        }

    }

    static double cal_bmi(double weight, double height)
    {
        double heightM = height/100.0;
        return  weight / (heightM * heightM);
    }

    static String check_bmi(double bmi)
    {
        String result = "";
        if (bmi>30) {
            result = "Obese";
        } else if (bmi>=25) {
            result =  "Over Weight";
        } else if (bmi>=18.5) {
            result = "Healthy Weight";
        } else if (bmi<18.5) {
            result = "Under Weight";
        }
        return result;
    }
    
}
