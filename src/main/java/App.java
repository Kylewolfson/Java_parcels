import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String,Object>();
      int length = Integer.parseInt(request.queryParams("length"));
      int width = Integer.parseInt(request.queryParams("width"));
      int height = Integer.parseInt(request.queryParams("height"));
      int weight = Integer.parseInt(request.queryParams("weight"));
      double cost;
      Parcel myParcel = new Parcel(length, width, height, weight);
      cost = myParcel.cost();
      model.put("myParcel", myParcel);
      model.put("cost", cost);

      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
