package com.lct;

import java.util.Iterator;
import java.util.List;

public class Question {
private int id;
private String name;
private List<Answers> answers;

  public Question() {
  }
public  Question(int id,String name,List<Answers>answers){
  super();
  this.id=id;
  this.name=name;
  this.answers=answers;
}
 void disInfo(){
  System.out.println(id+","+name);
  System.out.println("The answers are: ");
 for (Answers a:answers) {
    System.out.println(a);
  }
/*  Iterator<Answers> itr=answers.iterator();
  while(itr.hasNext()){
    System.out.println(itr.next());
  }*/
}
}
