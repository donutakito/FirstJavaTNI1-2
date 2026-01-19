import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Student st = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name : ");
        st.setName(sc.nextLine());
        System.out.print("Enter student year : ");
        st.setStudy_year(sc.nextInt());
        System.out.print("Enter mid_term score : ");
        st.addPoint(sc.nextInt());
        System.out.print("Enter final_term score : ");
        st.addPoint(sc.nextInt());
        System.out.print("--------------------------------");

    }

    void showInfo(Student st)
    {
        System.out.println("Name : "+st.getName());
        System.out.println("Year : "+st.getStudy_year());
        System.out.println("Score : "+st.getScore());
        System.out.println("Year : "+st.getGrade());

    }
}
