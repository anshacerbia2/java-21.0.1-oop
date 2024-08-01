package com.clairvoyant.project;

// Overriding the same parent's method
public class Overriding {
  public static void main(String[] args) {
    ChildClass instance = new ChildClass();
    instance.greetings(); // "Hello World from child"
    instance.greetings2("Ansha"); // "Hello Ansha"
    instance.greetings2("morning", "Ansha"); // "Good morning Ansha"
  }
}

class ParentClass {
  void greetings () {
    System.out.println("Hello world from parent");
  }

  void greetings2 (String name) {
    System.out.println("Hello " + name);
  }
}

class ChildClass extends ParentClass {
  void greetings () {
    System.out.println("Hello world from child");
  }

  void greetings2 (String condition, String name) {
    System.out.println("Good " + condition + " " + name);
  }
}

