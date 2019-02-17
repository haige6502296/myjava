package com.Extend;

public class ChildBean {
private String msgOne;
private String msgTwo;
private String msgThree;
public void setMsgOne(String msg){
  this.msgOne=msg;
}
public void setMsgTwo(String messageTwo){
  this.msgTwo=messageTwo;
}
public void setMsgThree(String msgThree){
  this.msgThree=msgThree;
}
public void getMsgOne(){
  System.out.println("这是ChildBean的getMessageOne()方法:  "+msgOne);
}
public void getMsgTwo(){
  System.out.println("这是ChildBean的getMessageTwo()方法:  "+msgTwo);
}
public void getMsgThree(){
  System.out.println("这是ChildBean的getMessageThree()方法:  "+msgThree);
}
}
