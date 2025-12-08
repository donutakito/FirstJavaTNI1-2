import javax.swing.*;
import java.util.Scanner;

public class Lab402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String id = JOptionPane.showInputDialog("Enter student-id");
        String mes = "";

     while (id.length()<10)
     {
         id = JOptionPane.showInputDialog("Enter student-id");
         if(id.length()>=10)break;
     }

     switch (id.substring(2,5))
     {
         case "131" : mes = "Information Teachnology (IT)"; break;
         case "132" : mes = "Multimedia Teachnology (MT)"; break;
         case "133" : mes = "Digital Business Information Teachnology (BI)"; break;
         case "134" : mes = "Digital Information in Mass Communication (DC)"; break;
         case "135" : mes = "Data Science and Data Analytics (DS)"; break;
         default:mes = "Cannot found major";break;


     }
     JOptionPane.showMessageDialog(null,"Student ID:"+id+
             "\nMajor:"+mes);


    }
}
