public class ForLoop {
    

    // show square roots form 1 to 99
    public static void main(String[] args){
        double num,sroot, rerr;

        for(num = 0;num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Square root of" + num + "is" + sroot);

            //compute rounding error
            rerr = num -(sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            
        }
    }

}
