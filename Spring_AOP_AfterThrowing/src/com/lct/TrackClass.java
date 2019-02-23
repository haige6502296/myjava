package com.lct;

import org.aspectj.lang.JoinPoint;

public class TrackClass {

  //Throwable 对象throwable不能忘记加入了
public void trackAdvice(JoinPoint jp,Throwable throwable){//advice,没有异常将不会执行
  System.out.println();
  System.out.println("因为有异常,所以额外的切入点来了_________...................");
  System.out.println("Operation方法签名:"+jp.getSignature());
  System.out.println("异常产生了: "+throwable);
  System.out.println("异常切入通知结束!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
}
}
