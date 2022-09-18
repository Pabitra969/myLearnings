package recursion;

public class tilingProblem {
    public static void main(String[] args) {
        System.out.println(tilingProblem1(4));
    }

    public static int tilingProblem1 (int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // work
        // make choice how to fill horizontal or vertical

        // horizontal choice
        int fnm1 = tilingProblem1(n-2);

        // vertical choice
        int fnm2 = tilingProblem1(n-1);

        return fnm1 + fnm2;
    }
}
