public class Movie {
    private  String name;
    private int minutes;
    private String rating;

    Movie(String title,int minutes,String rating)
    {
        this.name=title;
        this.minutes=minutes;
        this.rating=rating;
    }

    Movie()
    {
        this("",0,"");
    }

    String getTitle()
    {
        return this.name;
    }

    public String toString()
    {
        return getTitle()+"("+this.rating+", "+this.minutes+" mins)";
    }


}
