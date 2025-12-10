import java.util.Scanner;

public class Lab303 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for X coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter the value for Y coordinate: ");
        int y = sc.nextInt();

        String result =
                (x>0&&y>0)?"First quadrant":
                        (x<0&&y>0)?"Second quadrant":
                                (x<0&&y<0)?"Third quadrant":
                                        (x==0&y==0)?"Origin":"Origin";
        System.out.print("The coordinate point ("+x+","+y+")"+ " lies in the "+result);



    }
}
