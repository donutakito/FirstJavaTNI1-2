import java.util.Scanner;

public class Lab301 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        if(number==0)
        {
            System.out.print("This is Zero number.");
        }else
        {
            String OddnumOrEvennum = (number%2==0)?"Even":"Odd";
            String PosiOrNega = (number>0)?"Positive number.":"Negative number.";

            System.out.print("This number is "+OddnumOrEvennum+" and "+PosiOrNega);
        }




    }
}
