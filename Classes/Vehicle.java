public class Vehicle {

    int passengers; //number of passengers
    int fuelCap; //fuel capacity in gallons
    int mpg;     //fuel consumption in miles per gallon


    public static void main(String[] args){

    Vehicle minivan1 = new Vehicle();
    Vehicle sportscar = new Vehicle();

    int range1,range2;

    minivan1.passengers = 7;
    minivan1.fuelCap = 65;
    minivan1.mpg = 21;

    sportscar.passengers = 2;
    sportscar.fuelCap = 20;
    sportscar.mpg = 2;

    range1 = minivan1.fuelCap * minivan1.mpg;
    range2 = sportscar.fuelCap * sportscar.mpg;

    System.out.println("Minivan can carry: " + minivan1.passengers + minivan1.fuelCap + "gallons");
    System.out.println("Sportscar can carry: " + sportscar.passengers + sportscar.fuelCap + "gallons");

   }
    
}
