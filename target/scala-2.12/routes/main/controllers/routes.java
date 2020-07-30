// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ha_bq/Desktop/tranning-ha_bq-bbs/conf/routes
// @DATE:Thu Jul 30 11:32:41 ICT 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.Reversetest test = new controllers.Reversetest(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.Reversetest test = new controllers.javascript.Reversetest(RoutesPrefix.byNamePrefix());
  }

}
