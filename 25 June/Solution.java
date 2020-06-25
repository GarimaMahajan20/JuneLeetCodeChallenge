class Solution {
    public int findDuplicate(int[] nums) {
        
        Set<Integer> h =new HashSet<>();
        for(int i : nums){
            if(h.contains(i)){
                return i;
            }
            else
            {
                h.add(i);
            }
        }
        return -1;
        
    }
/*        public int findDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
        
    }*/
}