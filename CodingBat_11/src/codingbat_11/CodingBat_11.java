
package codingbat_11;

import java.util.Arrays;
import java.util.Random;


public class CodingBat_11 {

public static int [] nums(){
    Random rn = new Random();
    int []nums = new int[rn.nextInt(20)+1];
    
    for(int i=0;i<nums.length;i++){
        nums[i] = rn.nextInt(10)+1;
        
    }
     System.out.println(Arrays.toString(nums));
    return nums;
} 
    
public static boolean tripleUp(int []nums){
    
   for(int i=0;i<nums.length-2;i++){
       if(nums[i]+1==nums[i+1] && nums[i+1]+1==nums[i+2]){
           return true;
       }
   } 
   return false;
}

    public static void main(String[] args) {
        
        System.out.println("değer: "+tripleUp(nums()));
    }
    
}
