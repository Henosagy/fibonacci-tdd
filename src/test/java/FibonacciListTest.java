import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciListTest {
    FibonacciList fib = new FibonacciList();

    @Test
    void numberLessThanZero(){
        assertThrows(IllegalArgumentException.class, ()-> {
            fib.getFibList(-1);
        });
    }


    @Test
    void numberEqualsOne(){
        assertEquals(List.of(0), fib.getFibList(1));
    }

    @Test
    void numberEqualsTwo(){
        assertEquals(List.of(0,1), fib.getFibList(2));
    }

    @Test
    void FibonacciTest(){
        assertEquals(List.of(0,1,1,2,3), fib.getFibList(5));
    }
}