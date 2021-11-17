import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Fibonacci2Test {
    Fibonacci2 f = new Fibonacci2();

    @Test
    void numberLessThanOrEqualToZero(){
        assertThrows(IllegalArgumentException.class,
                ()->{
                        f.fibonacci(0);
        });
    }

    @Test
    void numberGreaterThanZero(){
        assertEquals(2, f.fibonacci(2));
    }

    @Test
    void fibOfOne() {
        assertEquals(0, f.fibonacci(1));
    }

    @Test
    void fibOfTwo() {
        assertEquals(1, f.fibonacci(2));
    }

    @Test
    void fibOfNumberGreaterThanTwo() {
        assertEquals(8, f.fibonacci(7));
    }

    @Test
    void listNumberLessthanOrEqualToZero(){
        assertThrows(IllegalArgumentException.class,
                ()->{
                    f.fibonacciList(0);
                });
    }

    @Test
    void fibListOfOne() {
        assertEquals(List.of(0), f.fibonacciList(1));
    }

    @Test
    void fibListOfTwo() {
        assertEquals(List.of(0,1), f.fibonacciList(2));
    }

    @Test
    void fibListOfGreaterThanTwo() {
        assertEquals(List.of(0,1,1,2,3), f.fibonacciList(5));
    }
}