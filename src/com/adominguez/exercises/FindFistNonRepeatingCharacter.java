package com.adominguez.exercises;

public class FindFistNonRepeatingCharacter implements ImplementationType {

  public static void main(String args[]) {
    FindFistNonRepeatingCharacter find = new FindFistNonRepeatingCharacter();
    find.declarative();
    find.imperative();
  }

  @Override
  public void imperative() {

    String IN = "aaabcccdeeef";
    char res = 0;
    char[] chars = IN.toCharArray();
    for (int i = 0; i < chars.length - 2; i++) {
      char first = chars[i];
      char second = chars[i + 1];
      char third = chars[i + 2];
      if (first != second && second != third) {
        res = second;
        break;
      }
    }
    System.out.println(res);

  }

  @Override
  public void declarative() {

  }
}
