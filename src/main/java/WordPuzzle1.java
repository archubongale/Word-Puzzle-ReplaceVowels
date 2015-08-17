import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class WordPuzzle1 {


 public static void main(String[] args) {

    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String userInputtedString= request.queryParams("userInput");

      String userOutput = replaceVowels(userInputtedString);
           model.put("userOutput", userOutput);
           model.put("userInput", userInputtedString);

           return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
      }

  public static String replaceVowels(String userInput) {
    String output = " ";
    output=userInput.replaceAll("[AEIOUaeriou]","-");
    return output;
      }
}
