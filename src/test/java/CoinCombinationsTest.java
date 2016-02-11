import org.junit.*;
import static org.junit.Assert.*;

public class CoinCombinationsTest {

  // @Test
  // public void checkCoins_returnsOneQuarterWhenGivenValueOf25_1Quarter(){
  //   CoinCombinations coinCombinationTest = new CoinCombinations();
  //   assertEquals(25, (int) coinCombinationTest.checkCoins(25));
  // }
  //
  // @Test
  // public void checkCoins_returnsOneDimeWhenGivenValueof10_1Dime() {
  //   CoinCombinations coinCombinationTest = new CoinCombinations();
  //   assertEquals(10, (int) coinCombinationTest.checkCoins(10));
  // }
  //
  // @Test
  // public void checkCoins_returnOneNickelWhenGivenValueOf5_1Nickel() {
  //   CoinCombinations coinCombinationTest = new CoinCombinations();
  //   assertEquals(5, (int) coinCombinationTest.checkCoins(5));
  // }

  @Test
  public void giveChange_returnsCorrectChangeWhenGivenAValueOf99_3Quarters2Dimes0Nickels4Pennies() {
    CoinCombinations coinCombinationTest = new CoinCombinations();
    Integer change = 99;
    assertEquals(0, (int) coinCombinationTest.giveChange (99));
  }

}
