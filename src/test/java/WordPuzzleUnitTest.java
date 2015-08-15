import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleUnitTest {

  @Test
  public void check_toReplaceVowelA_true() {
  WordPuzzle1 testResult = new WordPuzzle1();
    assertEquals("-", testResult.replaceVowels("A"));
  }

  @Test
  public void check_toReplaceVowelE_true() {
  WordPuzzle1 testResult = new WordPuzzle1();
    assertEquals("-", testResult.replaceVowels("E"));
  }
}
