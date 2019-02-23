package net.lct;

import org.aspectj.lang.JoinPoint;

public class TrackClass {
  public void businessAdvice(JoinPoint jp) {
    System.out.println("附加的关注点插入!!!");
  }
}
