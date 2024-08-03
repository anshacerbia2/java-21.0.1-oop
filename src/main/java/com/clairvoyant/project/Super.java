package com.clairvoyant.project;

/*
 * Super keyword can be used to call parent constructor or accessing both attribute and method. When you are trying to
 * access the parent constructor you have to use super within the child constructor. Using super within constructor
 * means calling parent constructor.
 *
 * Important:
 * If superclass has constructor with parameters, then the children should at least has one constructor that calls super
 * within it. If children has more than one constructor, then each constructor in children should call super (that match
 * at least one parent's constructor) inside each constructor.
 */
public class Super {
  public static void main(String[] args) {
    var child1 = new Child1();
    System.out.println(child1.name); // Returns "Default"

    var child2 = new Child2("Ansha");
    System.out.println(child2.name); // Returns "Cerbia"
    child2.sayHello(); // Return "Hello Cerbia"
    child2.getParentName(); // Return "Ansha"
    child2.sayHelloParent(); // Return "Hello Ansha"

    var child3 = new Child3("Ansha");
    System.out.println(child3.name); // Returns null as default value of String

  }
}

class Parent1 {
  String name;

  Parent1() {
    this.name = "Default";
  }
}

class Child1 extends Parent1 {
}

class Parent2 {
  String name;

  Parent2(String name) {
    this.name = name;
  }

  void sayHello() {
    System.out.println("Hello " + name);
  }
}

class Child2 extends Parent2 {
  String name;

  Child2(String name) {
    /*
     *  If the parent has constructor with params, then the existence keyword "super" in children is a must.
     *  Calling super is means calling parent constructor, so it's also depend on which one of the constructor
     *  do you want to call if the constructor is overloading.
     */
    super(name); // Calling Parent2 constructor
    this.name = "Cerbia";
  }

  /*
   * Defining constructor that not match any constructor on parents will produce error:
   * There is no parameterless constructor available in 'com.clairvoyant.project.Parent2'
   *
   * E.g.
   * Child2(int age) {
   * }
   *
   * The error will also occur if there is no constructor within this class, because there is a constructor on
   * parent that need arguments which is Parent2(String name)
   */

  void sayHello() {
    System.out.println("Hello " + this.name);
  }

  void getParentName() {
    System.out.println(super.name); // Accessing Parent2 attribute
  }

  void sayHelloParent() {
    super.sayHello();
  }
}

class Parent3 {
  String name;
}

class Child3 extends Parent3 {
  String name;

  Child3(String name) {
    /*
     * If the parent class does not define any constructors, the Java compiler provides a default no-argument
     * constructor. In this case, calling super() in the child class constructor will call this default no-argument
     * constructor, which has no effect beyond satisfying the requirement to call a parent constructor.
     */
    super();
  }
}

