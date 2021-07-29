public class FindMaxAndmin {

    public static void main(String[] args){

        
        int min,max;

        int nums[] = {2,34,1,67,54,890};

    min = max = nums[0];
    for(int i = 0; i < 5; i++){
        if(nums[i] < min) min = nums[i];
        if(nums[i] > max) max = nums[i];
    }    
    System.out.println("min and max: " + min + " max  " + max);
    }
    
}


// Array can be initialized by

//int myArr[] = {1,2,4,3,7,5,8,55,0};