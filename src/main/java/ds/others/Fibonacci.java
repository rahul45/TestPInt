package ds.others;

public class Fibonacci {
    public void fibonacci(int n){
        int x1=1,x2=1,x3;
        if( n <= 0){
            return;
        }
        if(n == 1){
            System.out.println(x1);
            return;
        }
        if(n == 2) {
            System.out.println(x1+"\t"+x2);
            return;
        }

        if(n > 2){
            System.out.print(x1+"\t"+x2);
            for(int i =2 ;i<n ;i++){
                x3 = x1+x2;
                System.out.print("\t"+x3+"\t");
                x1=x2;
                x2=x3;

            }
        }

    }
    private static void fibo(int n) {
        System.out.println();
        if (n > 0) {
            int a = 1, b = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(a + "\t");
                int temp = a;
                a = b;
                b = temp + b;
            }
        }
    }

    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();
        f.fibonacci(1);
        fibo(1);
    }
}
