package recursion;

public class binaryStringProblem {
    public static void main(String[] args) {
        printBinString(4,0,"");
    }

    public static void printBinString (int n, int lastPlace, String newStr) {
        // base Case
        if (n == 0) {
            System.out.println(newStr);
            return;
        }

        // work
//        if (lastPlace == 0) {
//            // sit 0 on chair n
//            printBinString(n-1,0,newStr.append("0"));
//            printBinString(n-1,1,newStr.append("1"));
//        } else {
//            printBinString(n-1,0,newStr.append("0"));
//        }

        printBinString(n-1,0,newStr+"0");
        if (lastPlace == 0) {
            printBinString(n-1,1,newStr+"1");
        }
    }
}
