package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  public void host() {
    System.out.println("This will be a host method");
  }

  public void hello() {
    System.out.println("Hello Jenkins");
  }


  /**
  *
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
