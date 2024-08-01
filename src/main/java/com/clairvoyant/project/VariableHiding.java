package com.clairvoyant.project;

// Subclass attribute hidding superclass attribute
public class VariableHiding {
  public static void main(String[] args) {
    VhChild instance = new VhChild("Ansha");
    System.out.println(instance.name);
    /*
     * Returns null, because it returns attribute name on VhChild not on VhParent, while the keyword super change name
     * on VhParent but not on VhChild. However, the VhChild has the same attribute name which is hiding the VhParent
     * attribute name.
     */
  }
}

class VhParent {
  String name;

  VhParent(String name) {
    this.name = name;
  }
}

class VhChild extends VhParent {
  String name; // This creates different attribute from parent instead of overrides parent attribute

  VhChild(String name) {
    super(name);
  }
}
