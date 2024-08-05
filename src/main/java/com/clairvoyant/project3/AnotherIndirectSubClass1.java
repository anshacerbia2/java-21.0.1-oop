package com.clairvoyant.project3;

public class AnotherIndirectSubClass1 extends DirectSubClass {
  /*
   * Constructor:
   * - Private-package: Accessible     -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  AnotherIndirectSubClass1() {
    super();
  }

  public AnotherIndirectSubClass1(String a) {
    super("a");
  }

  protected AnotherIndirectSubClass1(String a, String b) {
    this("a", "b", "c");
  }

  private AnotherIndirectSubClass1(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: DirectSubClass(String a, String b, String c) in com.clairvoyant.project3.DirectSubClass
     *                                 has private access
     * Since the superclass parameterless constructor is accessible from here we do not need call super here
     */
  }

  public static void main(String[] args) {

  }
}

