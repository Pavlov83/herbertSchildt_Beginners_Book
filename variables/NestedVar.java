public class NestedVar {
    
    /* This program attempts to declare a variable in an inner scope
    with the same name as one defined in the outter one.
    */

    public static void main(String[] args){
        int count;

        for(count = 0; count < 10; count++){
            System.out.println("This is count: " + count);
           // int count; //illegal as it is already declared in this scope
            for(count = 0; count < 2; count ++){
                System.out.println("This program is in error!");
            }
        }
    }

}
