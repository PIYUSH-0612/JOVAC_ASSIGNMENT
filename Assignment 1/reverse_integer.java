class Solution {
    public int reverse(int n) {
        int rem=0;
        long sum=0;
        if(n>0){
            while(n>0){
                rem=n%10;
                sum=sum*10+rem;
                n/=10;
            }
            
        }
        else if(n<0){
            n=-1*n;
             while(n>0){
                rem=n%10;
                sum=sum*10+rem;
                n/=10;
            }
            sum=-1*sum;
            

        }
        if(sum<-(Math.pow(2,31)) || sum>(Math.pow(2,31)-1))
            return 0;
        else
            return (int)sum;

    }
}
