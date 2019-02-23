package com.lct;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor {
  public Object invoke(MethodInvocation invocation) throws Throwable {
    Object obj;
    System.out.println("additional concern before actual logic");
    obj = invocation.proceed();//这里处理a.m();
    System.out.println("additional concern after actual logic");
    return obj;
  }
}
