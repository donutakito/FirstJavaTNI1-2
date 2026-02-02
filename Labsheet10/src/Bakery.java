public class Bakery {
    private String flavor;
    private double unitPrice;
    private int packingCost = 5;

    Bakery(String flavor,double unitPice)
    {
        this.flavor=flavor;
        this.unitPrice=unitPice;
    }

    Bakery()
    {
        this("",0.0);
    }

    String getFlavor()
    {
        return this.flavor;
    }

    double getUnitPrice()
    {
        return this.unitPrice;
    }

    int getPackingCost() //เพิ่มมาใหม่
    {
        return this.packingCost;
    }

    double calculateTotalPrice() //เพิ่มมาใหม่
    {
        return this.unitPrice+this.packingCost;
    }

    @Override
    public String toString() {
        return "Thanks you for your order!";
    }


}
