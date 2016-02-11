import java.util.HashMap;
import java.util.Random;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class CoinCombinations {
  public static void main(String[] args) {

  }
    public static Integer giveChange(Integer change) {
      Integer quarters = 0;
      Integer dimes = 0;
      Integer nickels = 0;
      Integer pennies = 0;
      while (change > 0) {
        if (change >= 25) {
          change -= 25;
          quarters ++;
        } else if (change >= 10) {
         change -= 10;
         dimes ++;
        } else if (change >= 5) {
         change -= 5;
         nickels ++;
        } else {
         change -= 1;
         pennies ++;
        }
      } return change;
    }
}
