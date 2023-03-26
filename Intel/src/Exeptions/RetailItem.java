package Exeptions;

public class RetailItem {

    private double price;
    private double unit;

    public RetailItem(double price, double unit) throws PriceException,UnitException {

        if(price < 0)
            throw new PriceException();
        if(unit < 0)
            throw new UnitException();

        this.price = price;
        this.unit = unit;
    }

}
