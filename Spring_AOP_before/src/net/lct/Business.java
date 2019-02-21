package net.lct;

public class Business {
void msg(){
  System.out.println("无返回值的msg()方法被调用了.");
}
int m(){
  System.out.println("必须有值返回的m()方法被调用");
  return 5;
}
int n(){
  System.out.println("必须有值返回的n()方法被调用了");
  return 2;
}
}
