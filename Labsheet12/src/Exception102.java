import javax.swing.*;
import java.util.InputMismatchException;

public class Exception102 {
    static void main() {

        int num=0;
        boolean loop=true;

        while (loop){
            try {
                String input =JOptionPane.showInputDialog("Enter an Integer: ");
                num=Integer.parseInt(input);
                loop=false;
            }catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Error: "+e.getMessage()
                        ,"Error Message",JOptionPane.WARNING_MESSAGE);
            }
        }
       JOptionPane.showMessageDialog(null,"You inputted number = "+num);

    }
}
