package Ship;

public class ShipMain {

    public static void main(String[] args) {

        Ship[] s = new Ship[3];

        Ship e = new Ship("bem","1993");
        CruiseShip c = new CruiseShip("hi","2001",100);
        CargoShip v = new CargoShip("sdf","4949",8000);



       try {
           for(Ship n:s){
               System.out.println(n.toString());
           }
       }catch (Exception a){
           System.out.println("there is nothing. ");
       }
    }
}
