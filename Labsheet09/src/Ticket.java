public class Ticket {
    private String ticket_id;
    private  Movie movie;
    private String show_time;
    private String seat_number;
    private double price;
    private boolean is_booked;
    private boolean is_used;


    Ticket(String ticket_id,Movie movie,String show_time,String seat_number,double price)
    {
        this.ticket_id=ticket_id;
        this.movie=movie;
        this.show_time=show_time;
        this.seat_number=seat_number;
        this.price=price;
    }

    Ticket()
    {
        this("",null,"","",0.0);
    }

    String getTicket_id()
    {
        return this.ticket_id;
    }

    Movie getMovie()
    {
      return this.movie;
    }

    String bookTicket()
    {
      if (is_booked==false)
      {
          this.is_booked=true;
          return "Ticket booked successfully!!";
      }
      return "This ticket is already booked";
    }


    public String usedTicket()
    {
        if (is_booked==false)return "Please book the ticket first"; //pyยังไม่ได้จอง
        if (is_used == true)//ใช้ตั๋วเเล้ว
        {
            return "Ticket already used";
        }
        is_used = true;
        return "Enjoy the movie!!";
    }

    public String toString()
    {
        return "Ticket ID: " + ticket_id +
                "\nMovie: " + movie +
                "\nShow Time: " + show_time +
                "\nSeat Number: " + seat_number +
                "\nTicket Price: " + price +
                "\nBooked: " + (is_booked ? "Yes" : "No") +
                "\nUsed: " + (is_used ? "Yes" : "No");
    }



}
