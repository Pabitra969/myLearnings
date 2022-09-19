package recursion;

public class friendPairingProblem {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(totalNumberOfWays(n));
    }
    public static int totalNumberOfWays(int n) {
        // baseCase
        if (n == 1 || n == 2) {
            return n;
        }

//        // work
//           // choice -> single
//        int single = totalNumberOfWays(n-1);
//           // choice -> pair
//        int pairWays = (n-1) * totalNumberOfWays(n-2);
//
//        // total ways
//
//        return single + pairWays;

        return totalNumberOfWays(n-1) + (n-1) * totalNumberOfWays(n-2);
    }
}
