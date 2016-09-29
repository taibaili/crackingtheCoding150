package ArraysandStrings;

/**
 * Created by yangxiao on 9/27/16.
 */

class Reverse {
    String reverseString(String input) {
        StringBuffer result = new StringBuffer();
        for(int i=input.length()-1;i>=0;i--) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }
}

public class Question2 {
    public static void main(String[] args) {
        Reverse re = new Reverse();
        System.out.println(re.reverseString("abcd"));
        System.out.println(re.reverseString(""));
    }
}
