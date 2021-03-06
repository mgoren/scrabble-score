import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnsScoreForWord_10() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 8;
    assertEquals(expected, testScrabble.calculateScore("hello"));
  }

  @Test
  public void calculateScore_returnsScoreForWordCaseInsensitive_10() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 8;
    assertEquals(expected, testScrabble.calculateScore("HeLLo"));
  }

}
