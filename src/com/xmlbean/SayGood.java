package com.xmlbean;

public class SayGood {
  private String words;
  public void setWords(String words){
    this.words=words;
  }
  public void getWords(){

    System.out.println("Your Words: "+words);
  }
}
