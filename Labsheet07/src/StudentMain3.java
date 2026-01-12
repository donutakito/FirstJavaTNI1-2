import javax.swing.*;

public class StudentMain3 {
    public static void main(String[] args) {

        Student[] stu = new Student[3];

        for (int i =0;i< stu.length;i++)
        {
            stu[i] = new Student();
            stu[i].id=JOptionPane.showInputDialog("Enter student id "+(i+1));
            stu[i].name=JOptionPane.showInputDialog("Enter student name "+(i+1));
            stu[i].doHomework(Integer.parseInt(JOptionPane.showInputDialog("Enter homework's score "+(i+1))));
            stu[i].takeExam(Integer.parseInt(JOptionPane.showInputDialog("Enter exam's score "+(i+1))));
        }

        for (Student s : stu)
        {
            System.out.println();
            s.showStatus();
        }
    }
}
