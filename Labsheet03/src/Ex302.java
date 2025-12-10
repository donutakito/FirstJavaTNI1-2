import javax.swing.*;
import java.util.Scanner;

public class Ex302 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mid-term score : ");
        int midScore = sc.nextInt();
        System.out.print("Enter final score : ");
        int finalScore = sc.nextInt();
        System.out.println();

        int totalscore = midScore+finalScore;

        if(totalscore<0||totalscore>100)
        {
            System.out.print("Your score is "+totalscore+"\nEror!!!");
        } else if (totalscore>=80) {
            System.out.print("Your score is "+totalscore+"\nYou get Grade A");
        } else if (totalscore>=70) {
            System.out.print("Your score is "+totalscore+"\nYou get Grade B");
        } else if (totalscore>=60) {
            System.out.print("Your score is "+totalscore+"\nYou get Grade C");
        } else if (totalscore>=50) {
            System.out.print("Your score is "+totalscore+"\nYou get Grade D");
        } else {
            System.out.print("Your score is "+totalscore+"\nYou get Grade F");
        }


    }
}
