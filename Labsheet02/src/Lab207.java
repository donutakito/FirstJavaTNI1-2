import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Lab207 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        JOptionPane.showMessageDialog(null,"Welcome to the payroll application");

        String empName = (JOptionPane.showInputDialog("Enter employee name :"));
        int workHour = Integer.parseInt(JOptionPane.showInputDialog("Enter total hour for this employee : "));

        final double workperHr = 7.50;
        final double workget = workHour*workperHr;
        float taxrate = 0.15f;
        DecimalFormat frm = new DecimalFormat("#,###.00");


        JOptionPane.showMessageDialog(null,"Employee name : "+empName+
                "\nHour worked : "+workHour+
                "\nHourly wage : "+"$"+frm.format(workperHr)+
                "\nGross earnings : "+"$"+frm.format(workget)+
                "\nTax rate : "+taxrate+
                "\nTax : "+"$"+frm.format(workget*taxrate)+
                "\nNet earnings : "+"$"+frm.format(workget-(workget*taxrate)));



    }
}
