package ArraysandStrings;

/**
 * Created by yangxiao on 9/27/16.
 */
class PermutationString {
    boolean isPermutation(String input1, String input2) {
        if(input1.length() != input2.length()) return false;
        Reverse re = new Reverse();
        String reversedInput = re.reverseString(input1);
        return reversedInput.equals(input2);
    }
}



public class Question3 {
  public static void main(String[] args) {
      PermutationString pe = new PermutationString();
      System.out.println(pe.isPermutation("abcd","dcba"));
      System.out.println(pe.isPermutation("abcds", "asdfadsf"));
  }
}
