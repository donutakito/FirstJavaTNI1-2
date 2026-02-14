package CoffeeShop ;

public class Frappuccino extends Drink{
    private boolean whipped;

    Frappuccino(String size,boolean whipped)
    {
        super("Frappuccino",40,size);
        this.whipped=whipped;
    }

    @Override
    double calculateFinalPrice() {

        double whipPrice=super.getBasePrice()+super.getSizeExtra(); //ราคาตั้งต้น+ไซซ์
        if (whipped) whipPrice += 15; //ถ้าเพิ่มวิป+15
        return whipPrice;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        if (whipped) return msg+"\nAdded whipped 15 Baht."+"\nTotal price = "+calculateFinalPrice()+" Baht."; //ถ้าเพิ่มวิป คืนค่าอันนี้
        return msg+"\nTotal Price = "+calculateFinalPrice()+" Baht.";
    }
}
