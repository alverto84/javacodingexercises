package com.adominguez.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class ReverseArray implements ImplementationType {

  public static void main(String args[]) {
    ReverseArray ra = new ReverseArray();
    //ra.imperative();
    ra.declarative();
  }

  @Override
  public void imperative() {
    String str = "Saket Saurav";
    char[] array = str.toCharArray();
    for (int i = array.length - 1; i >= 0; i--) {
      System.out.println(array[i]);
    }
  }

  @Override
  public void declarative() {
    String str = "Saket Saurav";
    Optional.of(str).map(s -> s.split("")).map(Arrays::asList)
        .map(list -> {
          Collections.reverse(list);
          return list;
        })
        .stream().forEach(System.out::println);
  }
}
