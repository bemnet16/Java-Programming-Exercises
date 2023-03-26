package Ship;

public class Ship {

    private String name; // To hold the name of the ship
    private String year; // To hold the year that the ship was built

    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toString(){

        return "Name : " + getName() + "\nYear : " + getYear();
    }
}
