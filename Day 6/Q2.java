package Leet75;

public class Q2 {
    public static void main(String[] args) {
        int nums[]=new int[]{2,1,-1};
        System.out.println(pivot(nums));

    }
    public static int pivot(int[] nums)
    {
        int sum=0;
        int start = 0, index = 0;

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }

        for(index=0; index<nums.length; index++){

            sum = sum - nums[index];
            if(start == sum){
                return index;            }
            start = start + nums[index];
        }

        return -1;
    }
}


