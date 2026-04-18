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
        int testcases=  sc.nextInt();
        
        while ( testcases-- >0){
            long n = sc.nextLong();
            System.out.println(helper(n));
            
        }
    }
    
    public static long helper(long n){
        // sum of multiples of k below N formula ->  k* (m * (m+1))/2 
        //where m = n-1/k
        long m1 = (n-1)/3;
        long m2 = (n-1)/5;
        long m3 = (n-1)/15;
        
        
        long sum1= ( 3* ( m1 * (m1+1) )/2); // first get all 3 divisble sum
        long sum2 =  ( 5* ( m2 * (m2+1) )/2); // then get all 5 divisible sum
        long sum3 =  ( 15* ( m3 * (m3+1) )/2); // subtract extra overlapping sums
        return sum1 + sum2 - sum3;
        
    }
}
