public class CupCake extends Bakery {
    private int piece;

    CupCake(int piece,String flavor,double unitPrice)
    {
        super(flavor,unitPrice);
        this.piece=piece;
    }

    boolean isPacking()
    {
       return this.piece>=6;
    }

    int getBoxNumber()
    {
        if (isPacking())
        {
            return this.piece/6;
        }
        return 0;
    }

    int getBagNumber()
    {
        return this.piece%6;
    }

    int getPackingCost()
    {
        if (isPacking()) return getBoxNumber() * super.getPackingCost();
        return 0;
    }

    double calculateTotalPrice()
    {
        return (this.piece * super.getUnitPrice()) + getPackingCost() + (getBagNumber() * 0.5);
    }

    @Override
    public String toString() {
        return super.toString()+"\nCup cake ("+super.getFlavor()+") With "+(isPacking()?getBoxNumber()+" Box ":"")+getBagNumber()+" Bag "+
                "\nTotal price of Cup cake = "+calculateTotalPrice();
    }
}
