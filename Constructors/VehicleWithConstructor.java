public class VehicleWithConstructor {

    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; //fuel consmption in miles per gallon

    //Constructor for vehicle which accepts parameters
    VehicleWithConstructor(int p,int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //return the range
    int range(){
        return mpg * fuelcap;
    }

    //compute fuel needed for a given distance
    double fuelneeded(int miles){
        return(double) miles/mpg;
    }    
}

class VehConsDemo{
    public static void main(String args[]){


        //construct complete vehicles
        VehicleWithConstructor minivan = new VehicleWithConstructor(7,16,21);
        VehicleWithConstructor sportscar = new VehicleWithConstructor(20, 23, 30);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + "miles minivan needs " + gallons + "gallons of fuel");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go " + dist + "miles sportscar needs " + gallons);
    }
}