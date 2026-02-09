package CoffeeShop;

public class Espressso extends Drink{
    private int shot;

    Espressso(String size)
    {
        super("Espreso",35,size);
        this.shot=0;
    }

    int getShot()
    {
        return this.shot=shot;
    }

    void addShot(int shot)
    {
       this.shot++;
    }

    double calculateFinalPrice()
    {
        return super.getBasePrice()+(this.shot*15)+super.getSizeExtra();
    }

    @Override
    public String toString() {
        return super.toString()+
                (shot>0?"\nAdded "+this.shot+" shot":"")+
                "\nTotal price = "+calculateFinalPrice()+" Baht.";
    }
}
