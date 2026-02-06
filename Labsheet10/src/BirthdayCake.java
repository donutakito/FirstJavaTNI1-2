public class BirthdayCake extends Bakery {
    private String message;
    private double pound;

    BirthdayCake(String message,double pound,String flavor,double unitPrice)
    {
        super(flavor,unitPrice);
        this.message=message;
        this.pound=pound;
    }

    String getMessage()
    {
        return this.message;
    }

    void changeMessage(String new_message)
    {
        this.message=new_message;
    }

    @Override
    int getPackingCost() {
        if (this.pound>=3)return 10;
        return super.getPackingCost();
    }

    @Override
    double calculateTotalPrice() {
        return super.getUnitPrice() * this.pound + getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n"+super.getFlavor()+" birthday cake (message = "+this.message+")" +
                "\nTotal price of Birthday Cake = "+calculateTotalPrice();
    }
}
