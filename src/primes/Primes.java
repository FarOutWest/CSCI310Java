/**
 *
 * @author West
 */

package primes;

import static kiss.API.*;

public class Primes {
    void printSum() {
        int x = readInteger();
        int y = readInteger();
        println("x+y=" + (x+y));
    }
    
    int sum(int x, int y) { return x+y; }
    
    boolean isPrime(int n) {
        int y = (int)(sqrt(n)+1.0);
        for (int factor = 2; factor <= y; ++factor) {
            if (n % factor == 0) return false;
        }
        return true;
    }
}
