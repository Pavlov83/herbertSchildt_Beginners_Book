package variables;

public class DynamicInitialization {
    public static void main(String[] args){
        double radius = 4, height = 5;

        // dynamically initialize volume
        double volume = 3.1416 * radius * height;//volume is dynamically initialized at runtime
        System.out.println("Volume is " + volume);
    }
    
}
