class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        //  for (int i = 0; i < (nums.length-1); i++) {
        //     if (nums[i]==nums[i+1]) {
        //         return true;
        //     } 
        // }
        // return false;

        HashSet<Integer> Set = new HashSet<>();//create
       for(int i=0;i<(nums.length);i++){
        if (Set.contains(nums[i])) {
                return true;
        }
        Set.add(nums[i]);//added element in hashset
           }
        return false;
        }
          
        }
       
    

// i=0
//     h=123    
 

