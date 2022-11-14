class Solution {
    
    static long gcd(long a, long b){
        if(b==0)return a;
         return gcd(b,a%b);
    }
    
    
    static long lcm(long a, long b){
      return (a/gcd(a, b)) * b;
        
    }
    
    
    static Long[] lcmAndGcd(Long A , Long B) {
        long a1=gcd(A,B);
        long a2=lcm(A,B);
        return new Long[]{a2,a1};
        
    }
};
