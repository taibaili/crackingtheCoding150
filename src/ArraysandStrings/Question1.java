package ArraysandStrings;

import java.util.*;

class IsUnique {
    public boolean isUnique(String input) {
        if(input.length()>128) {
            return false;
        }

        HashSet charSet = new HashSet();
        for(int i=0;i<input.length();i++) {
            if(charSet.contains(input.charAt(i))) {
                return false;
            } else {
                charSet.add(input.charAt(i));
            }
        }

        return true;
    }
}


class Question1 {
        public static void main(String[] args) {
            String test1 = "abc";
            IsUnique test = new IsUnique();
            boolean result = test.isUnique(test1);
            System.out.println(result);

            System.out.println(test.isUnique("abca"));
        }
}