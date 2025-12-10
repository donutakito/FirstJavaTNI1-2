import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab207 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        JOptionPane.showMessageDialog(null,"Welcome to the payroll application");
        String name = JOptionPane.showInputDialog("Enter employee name :");
        int workhour = Integer.parseInt(JOptionPane.showInputDialog("Enter total hour for this employee:"));

        double perhour = 7.5,taxrate = 0.15,tax = (workhour*perhour)*taxrate,total = (workhour*perhour)-tax;

        DecimalFormat frm = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null,"Employee name : "+name+
                "\nHour worked:"+workhour+
                "\nHourly wage: $"+perhour+
                "\nGross earnings:$"+frm.format(workhour*perhour)+
                "\nTax rate:"+taxrate+
                "\nTax:$"+frm.format(tax)+
                "\nNet earnings:$"+frm.format(total));







    }
}
