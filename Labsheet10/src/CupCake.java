public class CupCake extends Bakery {
    private int piece;

    CupCake(int piece,String flavor,double unitPrice)
    {
        super(flavor,unitPrice);
        this.piece=piece;
    }

    boolean isPacking()
    {
      return this.piece>=6; //ถ้าจำนวนคัพเค้กมากกว่าหรือเท่ากับ6 isPacking = TRUE
    }

    int getBoxNumber()
    {
       if (isPacking()) //ถ้าisPacking เป็น True
       {
        return this.piece/6;   //ให้รีเทินค่านี้กับไป แปลภาษาคนก็ประมาณว่า อันนี้มีกี่กล่อง 6ชิ้น=1กล่อง
       }
       return 0; //ถ้าไม่ถึง6ชิ้น ก็ให้รีเทินค่าไปว่า0กล่อง
    }

    int getBagNumber()
    {
        return this.piece%6;
    }

    @Override
    int getPackingCost()
    {
      if (isPacking()) return getBoxNumber() * super.getPackingCost();
      return 0;
    }

    @Override
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
