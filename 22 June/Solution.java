class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        int count = 0;
        for(int i=0;i<32;++i) {
            count = 0;
            for(int a : nums) {
                if((a & 1 << i) != 0) {
                    count++;
                }
            }
            if(count%3 != 0) {
                num+=1<<i;
            }
        }
        return num;
    }
    
}