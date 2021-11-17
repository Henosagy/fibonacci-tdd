public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        int a= fib.fibonacci(7);
        System.out.println(a);
    }
    int result = 0;

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
            result = 1;
            for(int i = 3; i <= n; i++){
                int temp1 =  fibonacci(i-2);
                int temp2 = fibonacci(i-1);
                result = temp1 + temp2;
            }
        }
        return result;
    }
}
