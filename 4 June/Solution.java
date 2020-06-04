class Solution {
    public void reverseString(char[] s) {
        
        int n=s.length-1;
        int i=0;
        
        reverse(s,i,n);
        System.out.println(s);
        
    }
    
    public void reverse(char []s,int i , int n)
    {
        char t='\0';
        if(i<n)
        {
            t=s[i];
            s[i]=s[n];
            s[n]=t;
            reverse(s,i+1,n-1);
        }
    }
}

//Using two pointer approach. 
