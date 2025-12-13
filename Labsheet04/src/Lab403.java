import javax.swing.*;
import java.util.Scanner;

public class Lab403 {
    static void main() {
        Scanner sc = new Scanner(System.in);

         String USER = "admin" , PASSWORD = "Admin1234";

         String userName = JOptionPane.showInputDialog("Enter username:");
         String pass = JOptionPane.showInputDialog("Enter password");

         while (!userName.equalsIgnoreCase(USER)&&!pass.equals(PASSWORD))
         {
             JOptionPane.showMessageDialog(null,"Login Fail...",
                     "Incorrrect username or password",JOptionPane.WARNING_MESSAGE);
             userName = JOptionPane.showInputDialog("Enter username:");
             pass = JOptionPane.showInputDialog("Enter password");

         }
         JOptionPane.showMessageDialog(null,"Login Success!!");

    }
}
