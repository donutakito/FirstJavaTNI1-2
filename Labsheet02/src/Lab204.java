import java.util.Scanner;

public class Lab204 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input hour : ");
        int hour = sc.nextInt();
        System.out.print("Input minutes : ");
        int minute = sc.nextInt();

        System.out.print("Total time is "+(hour*minute)+" minutes");


    }
}
