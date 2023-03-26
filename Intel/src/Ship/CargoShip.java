package Ship;

public class CargoShip extends Ship{

    private int capacity;

    public CargoShip(String name, String year, int capacity) {
        super(name, year);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toString(){

        return  "Name : " + getName() + "\nCapacity : " + getCapacity();
    }
}
