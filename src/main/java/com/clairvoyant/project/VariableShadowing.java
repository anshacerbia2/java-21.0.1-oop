package com.clairvoyant.project;

/*
 * Variable shadowing:
 * When the method/constructor has param named the same as class attribute (e.g. name) and inside the method
 * we intend to reassign the class attribute with the method argument. Because the variable we access within block
 * will be match with the closest scope
 */
public class VariableShadowing {
  public static void main(String[] args) {
    var method = new VsMethod();
    method.changeName("Ansha");
    System.out.println(method.name); // Returns null

    var vsInstance = new VsChild("Ansha");
    System.out.println(vsInstance.name);
    /*
     * Returns null, because it returns attribute name on VsChild not on VsParent, while the super change name on
     * VsParent but not on VsChild. However, the VsChild has the same attribute name which is shadowing the VsParent
     * attribute name.
     */
  }
}

class VsMethod {
  String name;

  void changeName(String name) {
    name = name;
  }
}

class VsParent {
  String name;

  VsParent(String name) {
    this.name = name;
  }
}

class VsChild extends VsParent {
  String name; // This creates different attribute from parent instead of overrides parent attribute

  VsChild(String name) {
    super(name);
  }
}
