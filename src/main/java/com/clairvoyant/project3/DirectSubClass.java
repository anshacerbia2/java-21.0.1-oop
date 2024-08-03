package com.clairvoyant.project3;

import com.clairvoyant.project2.Public;

public class DirectSubClass extends Public {
  /*
   * Constructor:
   * - Private-package: Not Accessible -> super()
   * - Public         : Accessible     -> super("a")
   * - Protected      : Accessible     -> super("a", "b")
   * - Private        : Not Accessible -> super("a", "b", "c")
   */
  DirectSubClass() {
    /*
     * super(); -> Error: Public() is not public in com.clairvoyant.project2.Public. Cannot be accessed from outside
     *                    package.
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project2.Public
     */
    super("a");
  }

  public DirectSubClass(String a) {
    super("a");
  }

  protected DirectSubClass(String a, String b) {
    this("a", "b", "c");
  }

  private DirectSubClass(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: Public(String a, String b, String c) in com.clairvoyant.project2.Public has
     *                                 private access
     * Since the superclass parameterless constructor not accessible from here, and there are still another constructor
     * with params on parent, you need to call super within this constructor or error will occur: There is no
     * parameterless constructor available in com.clairvoyant.project2.Public
     */
    super("a", "b");
  }

//  public static void main(String[] args) {
//    var a = new Public();
//    System.out.println(a.fname); // Returns "Ansha"
//    System.out.println(a.lname); // Returns "Cerbia"
//    System.out.println(a.age); // Returns 17
//    System.out.println(a.country); // Returns 17
//
//    var b = new com.clairvoyant.project2.DirectSubClass();
//    System.out.println(b.fname); // Returns "Ansha"
//    System.out.println(b.lname); // Returns "Cerbia"
//    System.out.println(b.age); // Returns 17
//    System.out.println(b.country); // Returns 17
//
//    var c = new com.clairvoyant.project2.IndirectSubClass();
//    System.out.println(c.fname); // Returns "Ansha"
//    System.out.println(c.lname); // Returns "Cerbia"
//    System.out.println(c.age); // Returns 17
//    System.out.println(c.country); // Returns 17
//
//    var d = new com.clairvoyant.project2.AnotherIndirectSubClass1();
//    System.out.println(d.fname); // Returns "Ansha"
//    System.out.println(d.lname); // Returns "Cerbia"
//    System.out.println(d.age); // Returns 17
//    System.out.println(d.country); // Returns 17
//
//    var e = new com.clairvoyant.project2.AnotherIndirectSubClass2();
//    System.out.println(e.fname); // Returns "Ansha"
//    System.out.println(e.lname); // Returns "Cerbia"
//    System.out.println(e.age); // Returns 17
//    System.out.println(e.country); // Returns 17
//
//    var f = new com.clairvoyant.project2.AnotherIndirectSubClass3();
//    System.out.println(f.fname); // Returns "Ansha"
//    System.out.println(f.lname); // Returns "Cerbia"
//    System.out.println(f.age); // Returns 17
//    System.out.println(f.country); // Returns 17
//
//    var g = new com.clairvoyant.project2.AnotherIndirectSubClass4();
//    System.out.println(g.fname); // Returns "Ansha"
//    System.out.println(g.lname); // Returns "Cerbia"
//    System.out.println(g.age); // Returns 17
//    System.out.println(g.country); // Returns 17
//
//    var h = new DirectSubClass();
//    System.out.println(h.fname); // Returns "Ansha"
//    System.out.println(h.lname); // Returns "Cerbia"
//    System.out.println(h.age); // Returns 17
//    System.out.println(h.country); // Returns 17
//
//    var i = new IndirectSubClass();
//    System.out.println(i.fname); // Returns "Ansha"
//    System.out.println(i.lname); // Returns "Cerbia"
//    System.out.println(i.age); // Returns 17
//    System.out.println(i.country); // Returns 17
//
//    var j = new AnotherIndirectSubClass1();
//    System.out.println(j.fname); // Returns "Ansha"
//    System.out.println(j.lname); // Returns "Cerbia"
//    System.out.println(j.age); // Returns 17
//    System.out.println(j.country); // Returns 17
//
//    var k = new AnotherIndirectSubClass2();
//    System.out.println(k.fname); // Returns "Ansha"
//    System.out.println(k.lname); // Returns "Cerbia"
//    System.out.println(k.age); // Returns 17
//    System.out.println(k.country); // Returns 17
//
//    var l = new AnotherIndirectSubClass3();
//    System.out.println(l.fname); // Returns "Ansha"
//    System.out.println(l.lname); // Returns "Cerbia"
//    System.out.println(l.age); // Returns 17
//    System.out.println(l.country); // Returns 17
//
//    var m = new AnotherIndirectSubClass4();
//    System.out.println(m.fname); // Returns "Ansha"
//    System.out.println(m.lname); // Returns "Cerbia"
//    System.out.println(m.age); // Returns 17
//    System.out.println(m.country); // Returns 17
//  }
}
