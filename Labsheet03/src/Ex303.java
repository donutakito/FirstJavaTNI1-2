import java.util.Scanner;

public class Ex303 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = sc.nextInt();
        System.out.println();
        if (num1==num2&&num2==num3)
        {
            System.out.print("All number are the same.");
        }else
        {
            System.out.print("All number are NOT the same.");
        }



    }
}
