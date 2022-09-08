public class PrimitiveParameters {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.printf("Before incorrectSwap: a=%d, b=%d\n", a, b);
        incorrectSwap(a, b);
        System.out.printf("After incorrectSwap: a=%d, b=%d\n", a, b);
    }
    
    public static void incorrectSwap(int a, int b) {
        int tmp = a;
        a = b;
        
    }
}
