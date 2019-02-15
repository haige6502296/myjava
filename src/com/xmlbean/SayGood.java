package com.xmlbean;

public class SayGood {
  private String words;
  public void setWords(String words){
    this.words=words;
  }
  public void getWords(){
    System.out.println("The Words: "+words);
  }
}
