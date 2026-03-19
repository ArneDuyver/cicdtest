package be.ses.javatest;

public class Doubler {

  public Float divide(Calculator calc, Float x, Float y){
    Float tussenresultaat = calc.divide(x, y);
    return 2*tussenresultaat;
  }
}
