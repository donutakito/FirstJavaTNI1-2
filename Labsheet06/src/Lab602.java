import java.util.Scanner;

public class Lab602 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String[]movies = {"Me Before You","Titanic","Before Sunrise","The holiday","A Walk to remember"};
        double[]rate_score = {4.2,4.9,4.4,3.7,4.3};

        System.out.print("Enter a movie title: ");
        String title = sc.nextLine();

        int findTitle = -1; //เอามาหาว่าเราเจอหนังที่ตำแหน่งIndexไหน
        for (int i =0;i<movies.length;i++)
        {
            if (movies[i].equalsIgnoreCase(title))
            {
                findTitle=i;break;
            }
        }

        if (findTitle!=-1)
        {
            int rank = fine_rank(rate_score,findTitle);
            System.out.print("The rating score of \""+title+"\""+" is "+rate_score[findTitle]+
                    "\nThis movie is ranked number "+rank);

        }
    }

    static int fine_rank(double[] score,int indexTitle)
    {
        int rank = 1;
        for (int i = 0;i< score.length;i++)
        {
            if (score[i]>score[indexTitle]) //ถ้าเรทคะเเนนหนังindexที่์Nมากกว่าเรทหนังเก่า rankจะ+1ไปเรื่อยๆ
            {
                rank++;
            }
        }
        return rank;
    }
}
