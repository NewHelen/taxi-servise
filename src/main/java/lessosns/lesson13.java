package lessosns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class lesson13 {


    @Test
    public void missinMidNum(){
        int[] nums = {1,2,4,5};
        Assertions.assertEquals(3, findNum(nums));
    }

    @Test
    public void missinLastNum(){
        int[] nums = {1,2,3,4};
        Assertions.assertEquals(5, findNum(nums));
    }

    public  void main (String []args){

        //int n = 5;
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(findNum(arr));

    }

    public static int findNum(int[] nums){
        int num = -1;

        for ( int i = 0; i < nums.length-1; i++){
            if (!(nums[i+1] - nums[i]==1)) {

                return nums[i]+1;
            }
        }

        return num;
    }


}
