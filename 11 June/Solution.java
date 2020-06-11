class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int current = 0;
        while(current <= right) {
            if(nums[current] == 0){
                int temp =nums[current];
                nums[current]=nums[left];
                nums[left]=temp;
                left++;
                current++;
            }
            else if(nums[current] == 1) {
                current++;
            }
            else {
                int temp =nums[current];
                nums[current]=nums[right];
                nums[right]=temp;                
                right--;
            }
        }     
    }
}
//It can also be done using Arrays.sort(nums) but since the question specifies thereby using two pointer approach.
