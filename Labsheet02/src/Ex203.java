import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

import static javax.swing.JOptionPane.*;

public class Ex203 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int lecture = Integer.parseInt(JOptionPane.showInputDialog("How many credits of lecture courses have you registered for?")) ;
        int credits = Integer.parseInt(JOptionPane.showInputDialog("How many credits of laboratory courses have you registered for?"));

        int oj = 1900, ojj = 3500;
        DecimalFormat frm = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null,
                "Lecture:"+lecture+"x"+oj+"="+frm.format(lecture*oj)+
                "\nLaboratory:"+credits+"x"+ojj+ "="+frm.format(ojj*credits)+
                "\nTotal price:"+frm.format(((lecture*oj)+(credits*ojj))));




    }
}
