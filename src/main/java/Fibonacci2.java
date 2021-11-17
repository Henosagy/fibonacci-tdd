import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci2 {
    int result;
    List<Integer> fibValues = new ArrayList<>();

    public int fibonacci(int n) {
        if(n <= 0){
            throw new IllegalArgumentException("Number less than or equal to 0");
        }
        if(n == 1){
            result = 0;
        }
        if(n == 2){
            result = 1;
        }
        if(n > 2){
            for(int i=3 ; i <= n; i++){
                result = fibonacci(i-1) + fibonacci(i-2);
            }
        }
        return result;
    }

    public List<Integer> fibonacciList(int n){
        fibValues.clear();
        if(n <= 0){
            throw new IllegalArgumentException("Number less than or equal to 0");
        }
        if(n == 1){
            fibValues.add(fibonacci(1));
        }
        if(n == 2){
            fibValues.add(fibonacci(1));
            fibValues.add(fibonacci(2));
        }
        if(n > 2){
            fibValues.add(fibonacci(1));
            fibValues.add(fibonacci(2));
            for(int i=3 ; i <= n; i++){
                result = fibonacci(i-1) + fibonacci(i-2);
                fibValues.add(result);
            }
        }

        return fibValues;
    }

}
