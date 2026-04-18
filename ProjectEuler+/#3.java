import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(helper(n));
        }
    }
    public static long helper(long n ){
        long maxPrime = -1 ;
        
        // 1. Breaking the even things
        while( n%  2 == 0){
            n = n/2;
        }    
        // 2. Check odd factors
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }
        // 3. If n is still > 2, it is prime
        if (n > 2) {
            maxPrime = n;
        }
        return maxPrime;
            
    }
}
