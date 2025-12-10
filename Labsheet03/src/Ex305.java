import javax.swing.*;
import java.util.Scanner;

public class Ex305 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int score = Integer.parseInt(JOptionPane.showInputDialog("Enter your score: "));

        while(score<0||score>100)
        {
            score=Integer.parseInt(JOptionPane.showInputDialog("Invalaid!!\nEnter your score:"));
        }

       String result = (score>=50)?" (PASS)":" (FALT)";

        JOptionPane.showMessageDialog(null,"Your score is "+score+result);


    }
}

