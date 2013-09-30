package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import java.util.ArrayList;
import java.util.List;

public class Location extends Controller {
  
    public static Result index() {
        return ok(location.render());
    }

}
