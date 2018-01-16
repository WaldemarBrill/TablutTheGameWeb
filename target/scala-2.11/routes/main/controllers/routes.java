
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Repository/TablutTheGameWeb/conf/routes
// @DATE:Tue Jan 16 02:44:30 CET 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTablutController TablutController = new controllers.ReverseTablutController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTablutController TablutController = new controllers.javascript.ReverseTablutController(RoutesPrefix.byNamePrefix());
  }

}
