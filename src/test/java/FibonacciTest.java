import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fib = new Fibonacci();

    @Test
    void numberLessThanZero(){
        assertThrows(IllegalArgumentException.class, ()-> {
            fib.fibonacci(-1);
        });
    }


    @Test
    void numberEqualsOne(){
        assertTrue(fib.fibonacci(1) == 0);
    }

    @Test
    void numberEqualsTwo(){
        assertTrue(fib.fibonacci(2) == 1);
    }

    @Test
    void FibonacciTest(){
        assertTrue(fib.fibonacci(5)==3);
    }

}