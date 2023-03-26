package Ship;

public class CruiseShip extends Ship{

    private int maxPassenger;

    public CruiseShip(String name, String year, int maxPassenger) {
        super(name, year);
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public String toString(){

        return  "Name : " + getName() + "\nMAX Passenger : " + getMaxPassenger();
    }
}
