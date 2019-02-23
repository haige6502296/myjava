package com.lct;

public class A {
  B b;

  public A() {
    System.out.println("a is created.");
  }

 /* public B getB() {
    return b;
  }*/

  public void setB(B b) {
    this.b = b;
  }

  void print() {
    System.out.println("Hello a!");
  }

  void diplay() {
    print();
    b.print();
  }
}
