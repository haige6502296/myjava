package net.lct;

import org.aspectj.lang.JoinPoint;

public class TrackClass {
  public void myadvice(JoinPoint jp, Object result)//it is advice (after advice)
  {
    System.out.println("额外的关注点输出!!!!!");
    System.out.println("方法签名:  "  + jp.getSignature());
    System.out.println("通知结果: "+result);
    System.out.println("结束这个通知...");
  }
}
