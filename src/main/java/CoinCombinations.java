import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class CoinCombinations {
  public static void main(String[] args) {
    staticFileLocation("/public");
//Home page
    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());


    //Change Given Page
  get("/results", (request, response) -> {
    HashMap model = new HashMap();
    String change = request.queryParams("change"); //FORM INPUT
    Integer integerChange = Integer.parseInt(change); //CHANGING FORM INPUT TO INTEGER
    String results = giveChange(integerChange); //RUN INTEGER THROUGH giveChange LOOP
    model.put("integerChange", integerChange);
    model.put("results", results);
    model.put("template", "templates/results.vtl");
    return new ModelAndView(model, "templates/layout.vtl");
  }, new VelocityTemplateEngine());


  }
    public static String giveChange(Integer change) {
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
      } return "Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.";
    }
}
