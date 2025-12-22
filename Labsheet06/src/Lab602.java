import java.util.Scanner;

public class Lab602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] movies = {"Me Before You","Titanic","Before Sunrise,","The Holiday","A walk to Remember"};
        double[] rate_scores = {4.2,4.9,4.4,3.7,4.3};

        System.out.print("Enter a movie title: ");
        String title = sc.nextLine();
        System.out.println();

        int canFindMovie = -1;

        for(int i=0;i<movies.length;i++)
        {
            if (movies[i].equalsIgnoreCase(title))
            {
                canFindMovie=i; //ถ้าเจอที่ันเข้าเงื่อไข canfindจะมีค่าเป็นIนั้นๆ
                break;
            }
        }

        if (canFindMovie!=-1) //ถ้าcanfindไม่=1แปลว่าเจอหนัง ชื่อตรง
        {
            System.out.print("The rating score of \""+title+"\""+" is "+rate_scores[canFindMovie]);
            int rank = find_rank(rate_scores,canFindMovie);
            System.out.println("\nThis movie is ranked number "+ rank);
        }else {
            System.out.println("Cannot find this movie title...");
        }

    }

    public static int find_rank(double[]ratescore,int canfind)
    {
        int rank = 1; //อันดับเริ่มจาก1ก่อนเสมอ ถ้าไม่เจอเลทที่ดีกว่าอันดับกจะคงอยู่เเบบบนี้ ถ้าเจอก็+1

       for (int i =0;i<ratescore.length;i++)
       {
           if (ratescore[i]>ratescore[canfind])rank++;
       }
        return rank;
    }
}
