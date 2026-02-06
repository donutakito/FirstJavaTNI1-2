public class Donut extends Bakery{
    private double discount;
    private int priceofDonut = 20;

    Donut(String flavor,int peice,double discount)
    {
        super(flavor,peice);
        this.discount=discount;
    }

    @Override
    double calculateTotalPrice() //beforeGetdiscount
    {
        return super.getUnitPrice()*priceofDonut;
    }

    double getDiscount() //after
    {
        return calculateTotalPrice()-this.discount;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTotal price Before Discount = "+calculateTotalPrice()+
                "\nAfter = "+getDiscount();
    }
}
