class Solution {

    private int w[];
    private int totalWeight=0;
    
    public Solution(int[] w) {
         this.w=w;
         for(int i=0;i<w.length;i++){
            totalWeight+=w[i];
        }
    }
    
    public int pickIndex() {
        int rand=(int)(Math.random()*totalWeight);
        int sum=0;
        for(int i=0;i<w.length;i++){
            sum+=w[i];
            if(sum>rand){
                return i;
            }
        }
        return w.length-1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */