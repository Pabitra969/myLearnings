package recursion;

public class xPowerNOptimized {
    public static void main(String[] args) {
        System.out.println(optimisedPower(2, 4));
    }

    public static int optimisedPower (int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimisedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            return a * halfPowerSq;
        }
        return halfPowerSq;
    }
}
