package com.lct;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdvisor implements ThrowsAdvice {
  public void afterThrowing(Exception e) {
    System.out.println("如果有异常产生,附加的切入点此行将打印");
  }
}
