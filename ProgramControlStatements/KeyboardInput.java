import java.util.Scanner;

public class KeyboardInput {
    
    public static void main(String[] args){
        Scanner ch = new Scanner(System.in);
        System.out.println("Press a key and then Enter");
        String in = ch.next();
        System.out.println("Your key is: " + ch);
    }

}
