package com.lct;

import java.util.List;

public class Questions {
  private int id;
  private String name;
  private List<String> answers;
  public Questions(){}
  public Questions(int id,String name,List<String>answers){
    this.id=id;
    this.name=name;
    this.answers=answers;
  }
  void displayInfo(){
    System.out.println(id+","+name);
    System.out.println("The answers are: ");
    for (String s:
        answers ) {
      System.out.println(s);
    }
//        while(itr.hasNext()){
//        System.out.println(itr.next());
//    }
  }
}
