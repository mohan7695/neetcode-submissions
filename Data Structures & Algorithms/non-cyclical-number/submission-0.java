class Solution {
    public boolean isHappy(int n) {
    
       int k=n;
       if(n ==1) return true;
       if(n==4) return false;

        while( n!=1 && n!=4){
                 int sum=0;
              while(n > 0){
                     int d=n%10;
                     sum +=d*d;
                     n/=10;
              }
              n=sum;
        }
        return (n == 1) ? true:false;
    }
}
