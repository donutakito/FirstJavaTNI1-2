import javax.swing.*;
import java.util.Scanner;

public class Lab402 {
    static void main() {
        Scanner sc = new Scanner(System.in);

       String stuID = JOptionPane.showInputDialog("Enter srudent ID:");

       while(stuID.length()<10)
       {
           stuID = JOptionPane.showInputDialog("Enter srudent ID:");
       }

        String major = "";

        switch (stuID.substring(2,5))
        {
            case "131" : major="Information Technology(IT)"; break;
            case "132" : major="Multimedia Technology(MT)"; break;
            case "133" : major="Digital Business Information Technology (BI)"; break;
            case "134" : major ="Digital Technology in Mass Communication (DC)"; break;
            case "135" : major ="Data Science and Data Analytics (DS)"; break;
            default:major ="Cannot found major";

        }

        JOptionPane.showMessageDialog(null,"Student ID: "+stuID+
                "\nMajor: "+major);



    }
}
