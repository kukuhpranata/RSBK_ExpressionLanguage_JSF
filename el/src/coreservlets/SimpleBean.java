package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class SimpleBean {
  private String[] colors =
    { "red", "orange", "yellow" };
  
  public String getMessage() {
    return("Hello, World, Kukuh's here");
  }
  
  public String[] getColors() {
    return(colors);
  }
}