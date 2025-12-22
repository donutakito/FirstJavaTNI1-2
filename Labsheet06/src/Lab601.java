import java.util.Scanner;

public class Lab601 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[]num = new int[5];

        for (int i =0;i<num.length;i++)
        {
            System.out.print("Enter number "+(i+1)+": ");
            num[i] = sc.nextInt();
            while(num[i]<=0)
            {
                System.out.print("The number must be positive! Enter number again: ");
                num[i] = sc.nextInt();

            }

        }
        System.out.println();
        System.out.print("List of even number: ");
        for (int _num : num)
        {
            if (_num%2==0)
            {
                System.out.print(_num+" ");
            }
        }
        System.out.print("\nList of odd number: ");
        for (int _num : num)
        {
            if (_num%2!=0)
            {
                System.out.print(_num+" ");
            }
        }
    }
}
