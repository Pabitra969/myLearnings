package recursion;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "ppaabiittra";
        StringBuilder newStr = new StringBuilder();
        boolean[] map = new boolean[26];
        removeDuplication(str,0,newStr,map);
    }

    public static void removeDuplication(String str, int idx, StringBuilder newStr, boolean[] map) {
        // baseCase
        if (idx == str.length() - 1) {
            System.out.println(newStr);
            return;
        }

        // work
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            // duplicate
            removeDuplication(str,idx+1,newStr,map);
        } else {
            map[currChar-'a'] = true;
            removeDuplication(str,idx+1,newStr.append(currChar),map);
        }
    }
}
