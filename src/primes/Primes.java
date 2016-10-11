/**
 *
 * @author West
 */
package primes;

import static kiss.API.*;

public class Primes {
    void testSmallPrimes() {
        Primes primes = new Primes();
        assert primes.isPrime(2) == true;
        assert primes.isPrime(3) == true;
        assert primes.isPrime(5) == true;
    }
    
    void testSmallComposites() {
        Primes primes = new Primes();
        assert primes.isPrime(4) == false;
        assert primes.isPrime(6) == false;
        assert primes.isPrime(8) == false;
    }
    
    boolean isPrime(int n) {
        return true;
    }
    
    void testHi() {
        println("Hi");
    }
}
