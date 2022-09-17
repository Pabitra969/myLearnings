package recursion;

public class xPowerN {
    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        System.out.println(power(x,n));
    }

    public static int power (int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n-1);
        return x * xnm1;
    }
}
