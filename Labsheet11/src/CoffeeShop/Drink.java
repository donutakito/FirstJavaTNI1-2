package CoffeeShop;

import java.util.Locale;

public abstract class Drink implements Priceable  {

private String drinkName;
private double basePrice;
private String size;


Drink(String drinkName,double basePrice, String size)
{
    this.drinkName=drinkName;
    this.basePrice=basePrice;
    this.size=size;
}

String getDrinkName()
{
   return this.drinkName;
}

//Price
public double getBasePrice()
{
    return this.basePrice;
}

//Price
public double getSizeExtra()
{
    if (size.equalsIgnoreCase("s"))return 0;
    if (size.equalsIgnoreCase("m"))return 10;
    if (size.equalsIgnoreCase("l"))return 15;
    return -1;
}


//abstract
abstract double calculateFinalPrice();

    @Override
    public String toString() {
        return "Your order: "+this.drinkName+"(Size: "+this.size.toUpperCase()+")";
    }

}
