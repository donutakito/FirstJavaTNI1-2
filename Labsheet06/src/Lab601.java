import java.util.Scanner;

public class Lab601 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];

        for (int i =0 ;i<number.length;i++)
        {
            System.out.print("Enter number "+(i+1)+": ");
            int num= sc.nextInt();
            while (num<=0)
            {
                System.out.print("The number must be positive! Enter number again:");
                num= sc.nextInt();
            }
            number[i]=num;

        }
        System.out.println();
        System.out.print("List of even number: ");
        for (int _num : number)
        {
            if (_num%2==0)
            {
                System.out.print(_num+" ");
            }
        }
        System.out.print("\nList of odd number: ");
        for (int _num : number)
        {
            if(!(_num%2==0))
            {
                System.out.print(_num+" ");
            }
        }



    }
}
