import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int sum=0;
        boolean b=true;
        while(x>0){
            int r=x%10;
             sum=r+sum*10;
             x/=10;
        }
        if(t==sum){
            return b;
        }
        else{
            b=!b;
            return b;
        }
    }

public  void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();

    isPalindrome(x);
   
}
    
}
