import javax.swing.*;

public class Lab502 {
    static void main() {

        while (true) {
            int answer = JOptionPane.showConfirmDialog(null, "Do you want to check your score?",
                    "Check score", JOptionPane.YES_NO_OPTION);
            if (answer == 0) {
                int midScore = input_score("Enter midterm-score:", 45);
                int finalScore = input_score("Enter final-score:", 55);
                int totalScore = cal_score(midScore, finalScore);
                String grade = find_grade(totalScore);

                JOptionPane.showMessageDialog(null, "Your score is " + totalScore +
                        "\nYou get grade " + grade);
            }else
            {
                JOptionPane.showMessageDialog(null,"END PROGRAM!!!"); break;
            }
        }
    }

    static int input_score(String msg,int limit_score){
     int score = Integer.parseInt(JOptionPane.showInputDialog(null,msg));

     while (score<0||score>limit_score)
     {
         score = score = Integer.parseInt(JOptionPane.showInputDialog(null,"Score must be in range between 0 to "+limit_score+
                 "\n"+msg));
     }

      return score;
    }

    static int cal_score(int midScore,int finalScore){
        return midScore+finalScore;
    }

    static String find_grade(int totalScore){
        String grade = "";

        if(totalScore>=80&&totalScore<=100)
        {
            grade = "A";
        } else if (totalScore>=70) {
            grade="B";
        } else if (totalScore>=60) {
            grade="C";
        } else if (totalScore>=50) {
            grade="D";
        }else
        {
            grade ="F";
        }
        return grade;
    }
}
