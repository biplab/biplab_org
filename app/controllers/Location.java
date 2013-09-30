package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {
  
    public static List<String> menuList = new ArrayList<String>();
    public static Result index() {
        menuList.add("Biography");
        menuList.add("Photos");
        menuList.add("Resume");
        menuList.add("Interests");
        return ok(index.render(menuList));
    }

}
