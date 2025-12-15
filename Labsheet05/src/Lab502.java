import javax.swing.*;
import java.util.Scanner;

public class Lab502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true) {


            int answer = JOptionPane.showConfirmDialog(null, "Do you want to check your score?",
                    "Check score", JOptionPane.YES_NO_OPTION);

            if (answer == 0) {
                int midScore = input_score("Enter mid-term score:", 45);
                int finalScore = input_score("Enter final-score:", 55);
                int totalScore = cal_score(midScore,finalScore);
                String grade = find_grade(totalScore);
                JOptionPane.showMessageDialog(null,"your score is "+totalScore+"\nYou get grade "+grade);


            } else {
                JOptionPane.showMessageDialog(null, "END PROGRAM!!"); break;
            }

        }


    }

    public static int input_score(String message, int limit_score) //FInd Mid score FInal score
    {
        int score = Integer.parseInt(JOptionPane.showInputDialog(message));

        while(score<0||score>limit_score)
        {
            score = Integer.parseInt(JOptionPane.showInputDialog("Score must be in range between 0 and "
                    +limit_score+"\n"+
                    message));
        }

        return score;
    }

    static int cal_score(int midterm,int finalscore) //คำนวน
    {

        return midterm+finalscore;

    }

    static String find_grade(int totalScore) // หาเกรด
    {
        String grade = "";

        if(totalScore>=80)
        {
            grade ="A";
        }
        else if (totalScore>=70)
        {
            grade="B";
        }else if (totalScore>=60)
        {
            grade="C";
        }else if (totalScore>=50)
        {
            grade="D";
        }else {
            grade ="F";
        }
        return grade;

    }


}


























