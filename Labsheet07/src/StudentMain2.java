import java.util.Scanner;

public class StudentMain2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter student name: ");
       s1.name = sc.nextLine();
       System.out.print("Enter student id: ");
       s1.id = sc.nextLine();
       System.out.print("Enter homework score:  ");
       s1.doHomework(sc.nextInt());
       System.out.print("Enter exam score:  ");
       s1.takeExam(sc.nextInt());
       System.out.println();
       s1.showStatus();






    }
}
