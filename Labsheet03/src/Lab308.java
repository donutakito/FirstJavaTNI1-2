import java.util.Scanner;

public class Lab308 {
    static void main() {
        Scanner sc = new Scanner(System.in);



        int number,maxNum=0,minNum=0,evenNum=0,oddNum=0;
        System.out.print("How man number to input: ");
        int numLoop = sc.nextInt();

        for(int i = 1;i<=numLoop;i++) {

            System.out.print("Enter number " +i+": ");
            number = sc.nextInt();

            if (number > maxNum) maxNum = number;
            if (number < minNum) minNum = number;

            if (number % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }

        System.out.println();
        System.out.print("Maximum = "+maxNum+
                "\nMinimum = "+minNum+
                "\nEven nunber = "+evenNum+
                "\nOdd number = "+oddNum);








    }
}
