class Solution {
    static Long[] lcmAndGcd(Long A, Long B) {
        Long[] result = new Long[2];
        long hcf = gcd(A, B); // GCD
        long lcm = lcm(A, B, hcf); // LCM
        result[0]=lcm;
        result[1]=hcf;
        
        return result;
    }

    static Long gcd(Long a, Long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static Long lcm(Long a, Long b, Long gcdValue) {
        return Math.abs(a * b) / gcdValue;
    }
}
