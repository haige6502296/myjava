package com.lct;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {
  public void afterReturning(@Nullable Object returnValue,
                             Method method, Object[] args, @Nullable Object target) throws Throwable {
    System.out.println("additional concern after returning advice");
  }
}
