class Solution {
    public int longestConsecutive(int[] nums) {
         Arrays.sort(nums);

if(nums.length ==0) return 0;
int count=1;
int value=1;
        for(int i=0;i<nums.length-1;i++){
                if(nums[i] == nums[i+1]){
                    continue;
                }
            if(nums[i+1] == nums[i] + 1){
                count++;
            }
            else{
                value =Math.max(count,value);
               count=1;
            }


        }
        //value= 
      return Math.max(count,value);

     
    }
}
