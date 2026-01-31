import javax.swing.*;
import java.util.stream.Stream;

public class TicketInfo {

    String select_showtime(Movie movie)
    {
        String time = JOptionPane.showInputDialog("Press 1 to select show time = 13.00" +
                "\nPress 2 to select show time = 14.30" +
                "\nPress 3 to select show time = 15.00" +
                "\nEnter a number:");

        if (time.equals("1"))return "13.00";
        else if (time.equals("2"))return "14.30";
        else if (time.equals("3")) return "15.00";
        else return "Eror time";

    }

    String select_seat_number()
    {
        String row = JOptionPane.showInputDialog("Select seat row[A-G]:");
        String seatNum = JOptionPane.showInputDialog("Select seat number[1-12]");
        return row.toUpperCase()+seatNum;
    }

    static void main()
    {
        Movie movie = new Movie("Titanic",120,"PG-13"); //ประกาศobj จากclass Movie
        TicketInfo ticketInfo = new TicketInfo(); //ประกาศobj จากclassTicketInfo

        String show_time = ticketInfo.select_showtime(movie); //เรียกใช้method
        String seat_number = ticketInfo.select_seat_number(); //เรียกใช้method

        Ticket ticket = new Ticket("T001",movie,show_time,seat_number,240);
        JOptionPane.showMessageDialog(null,ticket); //เเสดงผลลัพ

    }
}
