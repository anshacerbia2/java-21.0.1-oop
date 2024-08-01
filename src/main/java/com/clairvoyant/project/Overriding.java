package com.clairvoyant.project;

public class Overriding {
  public static void main(String[] args) {
    ChildClass instance = new ChildClass();
    instance.greetings(); // "Hello World from child"
  }
}

class ParentClass {
  void greetings () {
    System.out.println("Hello World from parent");
  }
}

class ChildClass {
  void greetings () {
    System.out.println("Hello World from child");
  }
}

