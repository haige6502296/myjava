package com.lct;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

// implement MethodBeforeAdvice,just a advisor class
public class BeforeAdvisor implements MethodBeforeAdvice {
  @Override
  public void before(Method method, Object[] args, Object target) throws Throwable {
    System.out.println("additional concern before actual logic");
  }
}
