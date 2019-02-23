package net.lct;

import org.aspectj.lang.JoinPoint;

public class TrackBusiness {
  public void myAdvice(JoinPoint jp){//it is advice
    System.out.println("附加的切入点!!!!_____before");
  }
}
