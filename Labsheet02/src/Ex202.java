import java.util.Scanner;

public class Ex202 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student-ID : ");
        String stuId = sc.nextLine();
        System.out.print("Enter student name : ");
        String name = sc.nextLine();

        System.out.println();
        System.out.println("Student-Id   : "+stuId);
        System.out.print("Student name : "+name);
    }
}
