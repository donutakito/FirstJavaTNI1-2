import javax.swing.*;
import java.util.Scanner;

public class Lab205 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int minute = Integer.parseInt(JOptionPane.showInputDialog("Input minutes : "));

        JOptionPane.showMessageDialog(null,
                minute +" minutes is "+(minute/60)+" hour "+(minute%60)+" minutes");
    }
}
