package com.clairvoyant.project3;

import com.clairvoyant.project2.IndirectSubClass;

public class AnotherIndirectSubClass4 extends IndirectSubClass {
  /*
   * Constructor:
   * - Private-package: Not Accessible -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  AnotherIndirectSubClass4() {
    /*
     * super(); -> Error: IndirectSubClass() is not public in com.clairvoyant.project2.IndirectSubClass. Cannot be
     *                    accessed from outside package.
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project2.IndirectSubClass
     */
    super("a", "b");
  }

  public AnotherIndirectSubClass4(String a) {
    super("a");
  }

  protected AnotherIndirectSubClass4(String a, String b) {
    this("a", "b", "c");
  }

  private AnotherIndirectSubClass4(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: IndirectSubClass(String a, String b, String c) in com.clairvoyant.project2.IndirectSubClass
     *                                 has private access
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project2.IndirectSubClass
     */
    super("a", "b");
  }


}
