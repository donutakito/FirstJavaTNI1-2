import java.util.Scanner;

public class Ex304 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message to display on laptop: ");
        String message = sc.nextLine();
        System.out.print("Enter a number of loop: ");
        int numofLoop = sc.nextInt();

        for (int i=0;i<numofLoop;i++)
        {
            System.out.println((i+1)+"\t"+message);
        }

    }
}
