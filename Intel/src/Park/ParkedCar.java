package Park;

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private double noMinute;

    public ParkedCar(String make,String model,String color,String licenseNumber,double noMinute){
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.noMinute = noMinute;
    }
    public ParkedCar(ParkedCar park){
        this(park.make,park.model,park.color,park.licenseNumber,park.noMinute);
    }
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }
    public String getLicenseNumber(){
        return this.licenseNumber;
    }
    public double getNoMinute(){
        return this.noMinute;
    }
    public void setNoMinute(double noMinute){
        this.noMinute = noMinute;
    }
}
