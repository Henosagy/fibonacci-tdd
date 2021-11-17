import java.util.ArrayList;
import java.util.List;

public class FibonacciList {
    public static void main(String[] args) {
        FibonacciList fibo = new FibonacciList();

        System.out.println(fibo.getFibList(8));

    }
    public List<Integer> fibList = new ArrayList<>();
    int result;

    public int fibonacci(int n){
        if(n <= 0){
            throw new IllegalArgumentException("Number less than one");
        }
        if( n == 1){
            result = 0;
        }
        if(n == 2){
            result = 1;
        }
        if(n > 2){
            for(int i = 3; i <= n; i++){
                result = fibonacci(i-2) + fibonacci(i-1);
            }
        }
        return result;
    }


    public List<Integer> getFibList(int n){
        fibList.clear();
        if(n <= 0){
            throw new IllegalArgumentException("Number less than one");
        }
        if( n == 1){
            fibList.add(fibonacci(1));
        }
        if(n == 2){
            fibList.add(fibonacci(1));
            fibList.add(fibonacci(2));
        }
        if(n > 2){
            fibList.add(fibonacci(1));
            fibList.add(fibonacci(2));

            for(int i = 3; i <= n; i++){
                result = fibonacci(i-1) + fibonacci(i-2);
                fibList.add(result);
            }
        }


        return fibList;
    }



}
