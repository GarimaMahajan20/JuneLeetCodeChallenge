void reverseString(char* s, int sSize){

    int i =0;
    int j=sSize-1;
    char t='\0';
    for(i=0;i<j;i++)
    {
        t=s[i];
        s[i]=s[j];
        s[j]=t;
        j--;
    }
}