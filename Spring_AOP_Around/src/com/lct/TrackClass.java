package com.lct;

import org.aspectj.lang.ProceedingJoinPoint;

public class TrackClass {
public Object businessAdvice(ProceedingJoinPoint pjp){
  System.out.println("在调用实际业务方法之前:");
  Object obj= null;
  try {
    obj = pjp.proceed();//Around here
  } catch (Throwable throwable) {
    throwable.printStackTrace();
  }
  System.out.println("在调用实际业务方法之后");
return obj;
}
}
