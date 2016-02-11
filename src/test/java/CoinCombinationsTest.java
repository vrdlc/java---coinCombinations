import org.junit.*;
import static org.junit.Assert.*;

public class CoinCombinationsTest {

  @Test
  public void checkCoins_returnsOneQuarterWhenGivenValueOf25_1Quarter(){
    CoinCombinations coinCombinationTest = new CoinCombinations();
    assertEquals(25, (int) coinCombinationTest.checkCoins(25));
  }
  @Test
  public void checkCoins_returnsOneDimeWhenGivenValueof10_1Dime() {
    CoinCombinations coinCombinationTest = new CoinCombinations();
    assertEquals(10, (int) coinCombinationTest.checkCoins(10));
  }

}
