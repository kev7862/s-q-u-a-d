import java.util.Map;
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
Map<String, Object> model = new HashMap<String, Object>();
//retrieving heros ArrayList data from session and placing it in the model with heros key
  model.put("template",  "templates/index.vtl");
  return new ModelAndView(model, "templates/layout.vtl");
}, new VelocityTemplateEngine());

get("/squads/new", (request, response) -> {
Map<String, Object> model = new HashMap<String, Object>();
model.put("template", "templates/squad-form.vtl");
return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());

get("/squads", (request, response) -> {
  Map<String, Object> model = new HashMap<String, Object>();
  model.put("template", "templates/squads.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());

post("/squads", (request, response) -> {
  Map<String, Object> model = new HashMap<String, Object>();
  String name = request.queryParams("name");
  Squad newSquad = new Squad(name);
  model.put("template", "templates/squad-success.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());

get("/squads/:id", (request, response) -> {
  Map<String, Object> model = new HashMap<String, Object>();
Squad squad = Squad.find(Integer.parseInt(request.params(":id")));  
  model.put("squad", squad);
  model.put("template", "templates/squad.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());

  }
}
