package ArraysandStrings;

/**
 * Created by yangxiao on 9/27/16.
 */
class Solution {
   public void replaceSpaces(char[] input, int length) {
        int spaceCount = 0;
        for(int i=0;i<=length-1;i++) {
            if(input[i]==' ') {
                spaceCount++;
            }
        }
        int newLength = length + spaceCount*2;
        input[newLength-1] = '\0';

        for(int i=length-1;i>=0;i--) {
          if(input[i]==' ') {
              input[newLength-1] = '0';
              input[newLength-2] = '2';
              input[newLength-3] = '%';
          } else {
              input[newLength-1] = input[i];
          }
        }

    }
}

public class Question4 {
    public static void main(String[] args) {
        char[] test1 = {'a', 'b', 'c', 'd', ' '};
        Solution solution = new Solution();
        solution.replaceSpaces(test1, 5);
        System.out.println(test1);
    }
}
