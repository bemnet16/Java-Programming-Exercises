package Exeptions;

public class PriceException extends Exception {


    public PriceException() {
        super("price can't be negative:");
    }
}
