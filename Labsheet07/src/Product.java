public class Product {
    public String name;
    public double price = 0 ;
    public int quantity = 0 ;


    public void addStock(int amount)
    {
        System.out.println();
        quantity+=amount;
        System.out.println("Added "+amount+" items to stock");
    }

    public void sell(int amount)
    {
        if (amount<=quantity)
        {
            System.out.println("Sold "+amount+" items");
            quantity-=amount;
        }else
        {
            System.out.println("Not enough items in stock...");
        }
    }

    public void changePrice(double newPrice)
    {
        if (newPrice>0)
            price=newPrice;
            System.out.println("Change price  to "+price+" Baht");
            System.out.println();

    }

    public double stockvalue()
    {
        return price*quantity;
    }

    public void showInfo()
    {
        System.out.println("Name   : "+name);
        System.out.println("Price  : "+price+" Baht/Item");
        System.out.println("Stock  : "+quantity+" Items");
        System.out.println("Stock Value : "+ stockvalue()+" Baht");
    }

}
