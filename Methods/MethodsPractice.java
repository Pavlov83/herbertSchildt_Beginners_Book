class MethodsPractice{

    int loadCapacity;
    int mainTank;
    int consumption;
    int rangeDistance;
    
     int range(){
         return mainTank * consumption;
    }
}

class ApplyMethods{

    public static void main(String[] args){

    MethodsPractice car5 = new MethodsPractice();
    car5.mainTank = 20;
    car5.consumption = 8;
    car5.loadCapacity = 180;

    System.out.println("The range of" + car5.range());

    }

}