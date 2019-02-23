package com.Extend;

public class BeanClass {
  private String msgOne;
  private String msgTwo;

  public void setMsgOne(String msgOne) {
    this.msgOne = msgOne;
  }

  public void setMsgTwo(String msgTwo) {
    this.msgTwo = msgTwo;
  }

  public void getMsgOne() {
    System.out.println("这是BeanClass类的getMsgOne()方法:  " + msgOne);
  }
  public void getMsgTwo(){
    System.out.println("这是BeanClass类的getMsgTwo()方法:  "+msgTwo);
  }

}
