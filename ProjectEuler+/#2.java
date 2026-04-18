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
        int t =  sc.nextInt();
        while(t-- > 0){
            
            long n = sc.nextLong();
            System.out.println(helper(n));
            
        }
    }
    public static long helper(long n ){
        // generate the Running sum of fibonnaci numbers and if in between generation
        // we find an even number, add it to the sum
        long sum = 0;
        
        long a = 1;
        long b = 2;
        // a =b   , b = a+b
        while( b <= n){
            if( b%2 == 0 ) sum +=b;
            long c = a+b;
            a= b;
            b=c;
        }
        return sum;
    }
}
