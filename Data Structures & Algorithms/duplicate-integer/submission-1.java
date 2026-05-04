class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
         for (int i = 0; i < (nums.length-1); i++) {
            if (nums[i]==nums[i+1]) {
                return true;
            } 
        }
        return false;
        }
       
    }
//  i=o
//     1==2
//  i=1
//      2==3
//  i=2
//      3==3 true        
 

