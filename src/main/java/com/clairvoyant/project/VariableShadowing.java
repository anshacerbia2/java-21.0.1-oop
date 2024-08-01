package com.clairvoyant.project;

/*
 * Variable shadowing:
 * When the method has param named the same as class attribute (e.g. name) and inside the method we intend to reassign
 * the class attribute with the method argument. Because the variable we access within block will be match with the
 * closest scope
 */
public class VariableShadowing {
  public static void main(String[] args) {
    var method = new VsMethod();
    method.changeName("Ansha");
    System.out.println(method.name); // Returns null
  }
}

class VsMethod {
  String name;

  void changeName(String name) {
    name = name;
  }
}
