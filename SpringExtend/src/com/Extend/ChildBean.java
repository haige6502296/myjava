package com.Extend;

public class ChildBean {
private String msgOne;
private String msgTwo;
private String msgThree;
private String msgFour;
public void setMsgOne(String msg){
  this.msgOne=msg;
}
public void setMsgTwo(String messageTwo){
  this.msgTwo=messageTwo;
}
public void setMsgThree(String msgThree){
  this.msgThree=msgThree;
}
public void setMsgFour(String msgFour){
  this.msgFour=msgFour;
}
public void getMsgOne(){
  System.out.println("这是ChildBean的getMsgOne()方法:  "+msgOne);
}
public void getMsgTwo(){
  System.out.println("这是ChildBean的getMsgTwo()方法:  "+msgTwo);
}
public void getMsgThree(){
  System.out.println("这是ChildBean的getMsgThree()方法:  "+msgThree);
}
public void getMsgFour(){
  System.out.println("这是ChildBean的getMsgThree()方法:  "+msgThree);
}
}
