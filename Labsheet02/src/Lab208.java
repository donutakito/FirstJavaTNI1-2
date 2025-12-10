import javax.swing.*;
import java.util.Scanner;

public class Lab208 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        int hour = Integer.parseInt(JOptionPane.showInputDialog("Input start time (hour) : "));
        int minute = Integer.parseInt(JOptionPane.showInputDialog("Input start time (minute) : "));
        int endhour = Integer.parseInt(JOptionPane.showInputDialog("Input end time (hour) : "));
        int endminute = Integer.parseInt(JOptionPane.showInputDialog("Input end time (minute) : "));

        // แปลงเวลาเข้า-ออกเป็นนาทีรวม
        int start_Minutes = hour * 60 + minute;
        int end_Minutes = endhour * 60 + endminute;

        // แยกชั่วโมงและนาที
        int parkHour = start_Minutes / 60;
        int parkMinute = end_Minutes % 60;

        double price =parkHour * 50 + parkMinute * 0.25;

        JOptionPane.showMessageDialog(null,"Start parking at "+parkHour+":"+parkMinute+
                "\n");

    }
}
