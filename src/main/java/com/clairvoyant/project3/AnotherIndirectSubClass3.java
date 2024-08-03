package com.clairvoyant.project3;

import com.clairvoyant.project2.DirectSubClass;

public class AnotherIndirectSubClass3 extends DirectSubClass {
  /*
   * Constructor:
   * - Private-package: Not Accessible -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  AnotherIndirectSubClass3() {
    /*
     * super(); -> Error: DirectSubClass() is not public in com.clairvoyant.project2.DirectSubClass. Cannot be
     *                    accessed from outside package.
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project2.DirectSubClass
     */
    super("a", "b");
  }

  public AnotherIndirectSubClass3(String a) {
    super("a");
  }

  protected AnotherIndirectSubClass3(String a, String b) {
    this("a", "b", "c");
  }

  private AnotherIndirectSubClass3(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: DirectSubClass(String a, String b, String c) in com.clairvoyant.project2.DirectSubClass
     *                                 has private access
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project2.DirectSubClass
     */
    super("a", "b");
  }


}
