class Max {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt=cnt+1;
                // maxi = Math.max(maxi, cnt);
                if(maxi<cnt) maxi=cnt;//increases the speed of the code by 1ms
            }
            else{
                cnt=0;
            }
        }
        return maxi;
    }
}    
public class max_consecutive {
    public static void main(String args[]){
        int nums[]={1, 1, 0, 0, 1, 1, 1, 0};
        System.out.println(Max.findMaxConsecutiveOnes(nums));
    }
}
