import java.util.Scanner;

public class Lab305 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();

        for(int i=firstNum;i<=secondNum;i++)
        {
           if(i%2==0)
           {
               System.out.print(i+" ");
           }
        }






    }
}
