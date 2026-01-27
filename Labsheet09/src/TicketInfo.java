import javax.swing.*;

public class TicketInfo {

    String select_showtime(Movie movie)
    {
        String show_time=JOptionPane.showInputDialog(movie.toString()+//เลือกเวลาเป็นstrnig
                "\nPress 1 to select show time = 13.00" +
                "\nPress 2 to select show time = 14.30" +
                "\nPress 3 to select show time = 15.00" +
                "\nEnter a number:");

        if (show_time.equals("1"))return "13:00";
        else if (show_time.equals("2"))return  "14.30";
        else if (show_time.equals("3"))return "15.00";
        else return "Eror Time";
    }

    String select_seat_number()
    {
       String row  = JOptionPane.showInputDialog("Select seat row [A-G]:"); //เลือกที่นั่ง
       String seatNumber = JOptionPane.showInputDialog("Select seat number:");//ตัวเลขที่นรั่ง
       return row.toUpperCase()+seatNumber;//คืนค่า
    }

    static void main() {

        TicketInfo info = new TicketInfo();
        Movie movie = new Movie("Titanic",120,"PG-13");
        String showTime = info.select_showtime(movie);//เรียกใช้ไอmethodด้านบนอะ
        String seatNumber = info.select_seat_number();//เหมือยกัน
        Ticket ticket = new Ticket("T001",movie,showTime,seatNumber,240);

        JOptionPane.showMessageDialog(null,ticket.toString());

    }
}
