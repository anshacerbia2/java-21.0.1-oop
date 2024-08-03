package com.clairvoyant.project3;

public class AnotherIndirectSubClass2 extends IndirectSubClass {
  /*
   * Constructor:
   * - Private-package: Accessible     -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  AnotherIndirectSubClass2() {
    super();
  }

  public AnotherIndirectSubClass2(String a) {
    super("a");
  }

  protected AnotherIndirectSubClass2(String a, String b) {
    this("a", "b", "c");
  }

  private AnotherIndirectSubClass2(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: IndirectSubClass(String a, String b, String c) in com.clairvoyant.project3.IndirectSubClass
     *                                 has private access
     * Since the superclass parameterless constructor is accessible from here we do not need call super here
     */
  }


}
