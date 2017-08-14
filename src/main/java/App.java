import java.util.map;
import java.util.ArrayList;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static  spark.Spark.*;

public class App {
  public static void main(String [] args ) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    get("/", (request,response) -> {
  model.put("heros", request.session().attribute("heros"));
  model.put("template",  "templates/index.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());
  }
}
