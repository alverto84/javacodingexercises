package com.adominguez.exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWordsUsingHashMap {

  public static void main(String args[]) {
    CountWordsUsingHashMap count = new CountWordsUsingHashMap();
    count.declarative();
    count.imperative();
  }

  public void imperative() {
    //Imperative
    String str = "This this is is done by Saket Saket";
    String[] words = str.split(" ");
    HashMap map = new HashMap<String, Integer>();
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      if (map.containsKey(word)) {
        int value = (int) map.get(word);
        map.put(word, value + 1);
      } else {
        map.put(word, 1);
      }
    }
    System.out.println(map);
  }

  public void declarative() {
    String str = "This this is is done by Saket Saket";

    List<String> list = Stream.of(str).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
        .collect(Collectors.toList());

    Map<String, Integer> wordCounter = list.stream()
        .collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));

    System.out.println(wordCounter);
  }
}
