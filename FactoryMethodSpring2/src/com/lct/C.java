package com.lct;

import org.jetbrains.annotations.Contract;

public class C {
  @Contract(" -> new")
  public static FactoryInterface getImplement() {

    return new A();
//    or use: return new B();
  }
}
