import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number to input: ");
        int num = sc.nextInt();

        int maxnum = num, minnum = num, evennum = 0, oddnum = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + ":");
            int number = sc.nextInt();

            if (number > maxnum) maxnum = number;
            if (number < minnum) minnum = number;

            if (number % 2 == 0) evennum++;
            if(number%2 != 0)oddnum++;
        }
        System.out.print("Maximum = " + maxnum +
                "\nMininum = " + minnum +
                "\nEven number = " + evennum +
                "\nOdd number = " + oddnum);
    }
















}
