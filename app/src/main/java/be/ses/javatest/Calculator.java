package be.ses.javatest;

public class Calculator {


  public Float divide(Float x, Float y){
    if (y == 0){
      throw new ArithmeticException("/ by zero not allowed");
    }
    return 1.0f;
  }
}
