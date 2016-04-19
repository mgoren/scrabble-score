import java.util.HashMap;

public class Scrabble {

  public Integer calculateScore(String word) {
    HashMap<Character,Integer> scores = new HashMap<Character,Integer>();
    scores.put('a', 1);
    scores.put('e', 1);
    scores.put('i', 1);
    scores.put('o', 1);
    scores.put('u', 1);
    scores.put('l', 1);
    scores.put('n', 1);
    scores.put('r', 1);
    scores.put('s', 1);
    scores.put('t', 1);
    scores.put('d', 2);
    scores.put('g', 2);
    scores.put('b', 3);
    scores.put('c', 3);
    scores.put('m', 3);
    scores.put('p', 3);
    scores.put('f', 4);
    scores.put('h', 4);
    scores.put('v', 4);
    scores.put('w', 4);
    scores.put('y', 4);
    scores.put('k', 5);
    scores.put('j', 8);
    scores.put('x', 8);
    scores.put('q', 10);
    scores.put('z', 10);

    return scores.get(word.charAt(0));
  }

}
