import java.util.Scanner;

public class Q102 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int answer=0 ;

            while (answer==0) {
                System.out.print("Enter an integer to find its list of factors: ");
                int num = sc.nextInt();
                while (num <= 1) {
                    System.out.print("Invalaid number!!! Please enter an integer again: ");
                    num = sc.nextInt();
                }

                String result = "";
                for (int i = 1; i <= num; i++) {
                    boolean numfac = (num % i == 0);

                    if (numfac) {
                        result += i + " ";

                    }
                }
                System.out.print("The factor list is: " + result);
                System.out.println("\n");

                System.out.print("Find more factors? [0=Yes/1=No]: ");
                answer = sc.nextInt();

                while (answer!=0&&answer!=1)//ถ้าเราไม่พิม0หรือ1 จะต้องทำการป้อนใหม่เรื่อยๆเพราะบังคับเเค่สองตัวนี้เท่านั้น
                {
                    System.out.print("Find more factors? [0=Yes/1=No]: ");
                    answer = sc.nextInt();
                }
            }
            System.out.println("");
            System.out.println("END PROGRAM");



    }

}
