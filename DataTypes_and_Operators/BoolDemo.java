package DataTypes_and_Operators;

public class BoolDemo {

    public static void main(String args){
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        //Boolean value can control the if statement

        if(b) System.out.println("This is executed");

        //Also can be used to evaluate the outcome of expression
        System.out.println("10 > 9 is " + (10 > 9));

    }
    
}
