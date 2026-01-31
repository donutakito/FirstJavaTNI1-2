import javax.swing.*;

public class TicketUsed {

    String show_movie_list(Ticket... tickets)
    {
       String result = ""; //เอาไว้เก็บผลรวมทั้งหมดที่รับจากparamiter tickets
       {
           for (Ticket t : tickets)
           {
               result += t.getTicket_id()+": "+t.getMovie().toString()+"\n";//รวมข้อมูลทั้งหมด
           }
           return result;
       }
    }

   public static void main() {
        TicketUsed ticketused = new TicketUsed();
        Ticket[] tickets = new Ticket[] {
                new Ticket("T001", new Movie("Titanic", 120,"PG-13"),"12:00", "B7", 280),
                new Ticket("T002", new Movie("Pokemon", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        while (true)
        {
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want to book or use a ticket?","Ticket"
                    ,JOptionPane.YES_NO_OPTION);

            if (confirm==JOptionPane.YES_OPTION)
            {
                String ticketId = JOptionPane.showInputDialog(null,
                        ticketused.show_movie_list(tickets)+
                        "\nEnter a ticket id for booking:");


                for (Ticket t : tickets) {
                    if (t.getTicket_id().equalsIgnoreCase(ticketId)) { //ถ้าเลขไอดีภาพยนต์เราตรงกับที่กรอก มันจะมาทำตามคำสั่งนี้
                        int choice = Integer.parseInt( //มันจะแสดงโค้ดบรรทัดนี้
                                JOptionPane.showInputDialog(
                                        null,t.getTicket_id() + ": " + t.getMovie() +
                                        "\n\nPress 1 to book a ticket\n" +
                                                "Press 2 to use a ticket\n" +
                                                "Press 3 to see a ticket status" +
                                                "\n\nEnter a menu"
                                ));

                        if (choice==1)
                        {
                            JOptionPane.showMessageDialog(null, t.bookTicket() +
                                    "\n--------------------\n" + t);
                        }
                       if (choice==2)
                        {
                            JOptionPane.showMessageDialog(null,t.useTicket()+
                                    "\n--------------------\n"+t);
                        }
                       if (choice==3)
                        {
                            JOptionPane.showMessageDialog(null,t);
                        }

                    }
                }
            }else break;
        }

    }
}
