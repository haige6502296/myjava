package com.lct;

public class C {
  public static FactoryInterface getImplement() {
    return new A();
//    or use: return new B();
  }
}
