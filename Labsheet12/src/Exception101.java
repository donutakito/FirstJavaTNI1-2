import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception101 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int number=0;
        boolean is_loop = true;

        while (is_loop) {

            try {
                System.out.print("Enter a number: ");
                number = sc.nextInt();
                is_loop=false; //ถ้าเกิดว่าด้านบนเกิดการป้อนData typeผิด บรรทัดนี้จะข้ามทันที จะข้ามไปทำงานในcatch
            } catch (InputMismatchException e) {
                sc.next();//อารมณ์เหมือนตัวกวาดข้อมูลที่เรากรอกผิดก่อนหน้านี้ออกไป
                System.out.print("Input wrong Data type!!");
            }
        }
        System.out.println();
        System.out.println("You inputted number = " + number);
    }
}
