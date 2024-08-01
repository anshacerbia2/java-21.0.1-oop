package com.clairvoyant.project;

// Overloading means duplicating method, can be applied on both constructor and method
public class Overloading {
  String name;
  int age;

  /*
   * Constructor Overloading:
   * It's possible to have multiple constructor as long as its params length or params type are different
   */
  Overloading(String name, int age) {
    this.name = name; // This refers to the instance that will be created by this class
    this.age = age;
  }

  Overloading(String name) {
    this.name = name;
  }

  /*
   * Method Overloading:
   * It's possible to have multiple constructor as long as its params length or params type are different
   */
  void sayHello() {
    System.out.println("Hello");
  }

  void sayHello(String name) {
    System.out.println("Hello " + name);
  }

  public static void main(String[] args) {
    Overloading instance1 = new Overloading("Ansha"); // Calling constructor 1
    Overloading instance2 = new Overloading("Ansha", 17); // Calling constructor 2

    System.out.println(instance1.name); // Returns "Ansha"
    System.out.println(instance2.name); // Returns "Ansha"
    System.out.println(instance1.age); // Returns 0 (int default value)
    System.out.println(instance2.age); // Returns 17
  }
}

