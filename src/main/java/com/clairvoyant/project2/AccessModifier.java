package com.clairvoyant.project2;

public class AccessModifier {
  /*
   * Condition Belows (a, b, c, d, e, f, g): Same package with this class
   *
   * Superclass Root: Same package with this class
   *
   * Constructor:
   * - Private-Package -> Accessible
   * - Public          -> Accessible
   * - Protected       -> Accessible
   * - Private         -> Not Accessible
   *                      - Except b, because b is created within its own class which is this class
   *
   * Non-Static Attribute/Method,
   * Static Attribute/Method (via instance):
   * - Private-Package -> Accessible
   *                      - Except for f and g, because one of their ancestor (direct parent) is from different package
   * - Public          -> Accessible
   * - Protected       -> Accessible
   * - Private         -> Not Accessible
   *
   * Static Attribute/Method (Via superclass. e.g. Public.a):
   * - Private-Package -> Accessible
   * - Public          -> Accessible
   * - Protected       -> Accessible
   * - Private         -> Not Accessible
   */
//  public static void main(String[] args) {
//    var a = new Public();
//    Public.a();
//    Public.b();
//    Public.c();
//    Public.d();
//    System.out.println(a.fname); // Returns "Ansha"
//    System.out.println(a.lname); // Returns "Cerbia"
//    System.out.println(a.age); // Returns 17
//    System.out.println(a.country); // Returns 17
//    a.a();
//    a.b();
//    a.c();
//    a.d();
//    var b = new DirectSubClass();
//    System.out.println(b.fname); // Returns "Ansha"
//    System.out.println(b.lname); // Returns "Cerbia"
//    System.out.println(b.age); // Returns 17
//    System.out.println(b.country); // Returns 17
//    b.a();
//    b.b();
//    b.c();
//    b.d();
//    var c = new IndirectSubClass();
//    System.out.println(c.fname); // Returns "Ansha"
//    System.out.println(c.lname); // Returns "Cerbia"
//    System.out.println(c.age); // Returns 17
//    System.out.println(c.country); // Returns 17
//    c.a();
//    c.b();
//    c.c();
//    c.d();
//    var d = new AnotherIndirectSubClass1();
//    System.out.println(d.fname); // Returns "Ansha"
//    System.out.println(d.lname); // Returns "Cerbia"
//    System.out.println(d.age); // Returns 17
//    System.out.println(d.country); // Returns 17
//    d.a();
//    d.b();
//    d.c();
//    d.d();
//    var e = new AnotherIndirectSubClass2();
//    System.out.println(e.fname); // Returns "Ansha"
//    System.out.println(e.lname); // Returns "Cerbia"
//    System.out.println(e.age); // Returns 17
//    System.out.println(e.country); // Returns 17
//    e.a();
//    e.b();
//    e.c();
//    e.d();
//    var f = new AnotherIndirectSubClass3();
//    System.out.println(f.fname); // Returns 17
//    System.out.println(f.lname); // Returns "Cerbia"
//    System.out.println(f.age); // Returns 17
//    System.out.println(f.country); // Returns 17
//    f.a();
//    f.b();
//    f.c();
//    f.d();
//    var g = new AnotherIndirectSubClass4();
//    System.out.println(g.fname); // Returns 17
//    System.out.println(g.lname); // Returns "Cerbia"
//    System.out.println(g.age); // Returns 17
//    System.out.println(g.country); // Returns 17
//    g.a();
//    g.b();
//    g.c();
//    g.d();
//
//
//    var h = new com.clairvoyant.project3.DirectSubClass();
//    System.out.println(h.fname); // Returns "Ansha"
//    System.out.println(h.lname); // Returns "Cerbia"
//    System.out.println(h.age); // Returns 17
//    System.out.println(h.country); // Returns 17
//    h.a();
//    h.b();
//    h.c();
//    h.d();
//    var i = new com.clairvoyant.project3.IndirectSubClass();
//    System.out.println(i.fname); // Returns "Ansha"
//    System.out.println(i.lname); // Returns "Cerbia"
//    System.out.println(i.age); // Returns 17
//    System.out.println(i.country); // Returns 17
//    i.a();
//    i.b();
//    i.c();
//    i.d();
//    var j = new com.clairvoyant.project3.AnotherIndirectSubClass1();
//    System.out.println(j.fname); // Returns "Ansha"
//    System.out.println(j.lname); // Returns "Cerbia"
//    System.out.println(j.age); // Returns 17
//    System.out.println(j.country); // Returns 17
//    j.a();
//    j.b();
//    j.c();
//    j.d();
//    var k = new com.clairvoyant.project3.AnotherIndirectSubClass2();
//    System.out.println(k.fname); // Returns "Ansha"
//    System.out.println(k.lname); // Returns "Cerbia"
//    System.out.println(k.age); // Returns 17
//    System.out.println(k.country); // Returns 17
//    k.a();
//    k.b();
//    k.c();
//    k.d();
//    var l = new com.clairvoyant.project3.AnotherIndirectSubClass3();
//    System.out.println(l.fname); // Returns "Ansha"
//    System.out.println(l.lname); // Returns "Cerbia"
//    System.out.println(l.age); // Returns 17
//    System.out.println(l.country); // Returns 17
//    l.a();
//    l.b();
//    l.c();
//    l.d();
//    var m = new com.clairvoyant.project3.AnotherIndirectSubClass4();
//    System.out.println(m.fname); // Returns "Ansha"
//    System.out.println(m.lname); // Returns "Cerbia"
//    System.out.println(m.age); // Returns 17
//    System.out.println(m.country); // Returns 17
//    m.a();
//    m.b();
//    m.c();
//    m.d();
//  }
}
