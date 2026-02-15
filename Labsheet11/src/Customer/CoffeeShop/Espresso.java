package CoffeeShop;

public class Espresso extends Drink{
    private int shot;

    Espresso(String size)
    {
        super("Espresso",35,size);
        this.shot=0;
    }

    void addShot(int addshot)
    {
        this.shot+=addshot;
    }

    @Override
    double calculateFinalPrice() {
        return super.getBasePrice() + super.getSizeExtra() + (this.shot * 15);
    }

    @Override
    public String toString() {

        String msg = super.toString();
        //ถ้าเพิ่มช็อตแสดงบรรทัดล่าง
        if (shot>0)return msg+"\nAdded "+this.shot+" shot"+"\nTotal price = "+calculateFinalPrice()+" Baht.";
        return msg+"\nTotal Price = "+calculateFinalPrice()+" Baht.";

    }
}