package com.lct;

public class Address {
  private String city;
  private String area;
  private String country;
  public Address(String city, String area, String country){
    super();
    this.city=city;
    this.area = area;
    this.country=country;
  }
  public String toString(){
    return country+city+ area ;
  }
}
