package com.clairvoyant.project;

public class Method {
  void sayHello() {
    System.out.println("Hello");
  }


  public static void main(String[] args) {
    Method instance = new Method();
    instance.sayHello(); // Return "Hello"
  }
}
