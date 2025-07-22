interface NumericFunc {
    int func(int n); 
}
public class LambdaFactorial {
    public static void main(String[] args) {
   
        NumericFunc factorial = (n) -> {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        };

        System.out.println("The factorial of  5 is " + factorial.func(5));
		System.out.println("The factorial of 6  is " + factorial.func(6));
    }
}