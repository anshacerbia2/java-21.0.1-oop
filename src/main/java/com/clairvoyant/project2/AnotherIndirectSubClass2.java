package com.clairvoyant.project2;

public class AnotherIndirectSubClass2 extends IndirectSubClass {
  AnotherIndirectSubClass2() {
    super();
  }

  public AnotherIndirectSubClass2(String a) {
    super("a");
  }

  protected AnotherIndirectSubClass2(String a, String b) {
    this("a", "b", "c"); // Private Constructor only invokable within the class itself
  }

  private AnotherIndirectSubClass2(String a, String b, String c) {
    /*
     * super("a", "b", "c"); -> Error: IndirectSubClass(String a, String b, String c) in com.clairvoyant.project2 has
     *                                 private access
     */
  }

  public static void main(String[] args) {
    var a = new Public();
    System.out.println(a.fname); // Returns "Ansha"
    System.out.println(a.lname); // Returns "Cerbia"
    System.out.println(a.age); // Returns 17
    System.out.println(a.country); // Returns 17

    var b = new DirectSubClass();
    System.out.println(b.fname); // Returns "Ansha"
    System.out.println(b.lname); // Returns "Cerbia"
    System.out.println(b.age); // Returns 17
    System.out.println(b.country); // Returns 17

    var c = new IndirectSubClass();
    System.out.println(c.fname); // Returns "Ansha"
    System.out.println(c.lname); // Returns "Cerbia"
    System.out.println(c.age); // Returns 17
    System.out.println(c.country); // Returns 17

    var d = new AnotherIndirectSubClass1();
    System.out.println(d.fname); // Returns "Ansha"
    System.out.println(d.lname); // Returns "Cerbia"
    System.out.println(d.age); // Returns 17
    System.out.println(d.country); // Returns 17

    var e = new AnotherIndirectSubClass2();
    System.out.println(e.fname); // Returns "Ansha"
    System.out.println(e.lname); // Returns "Cerbia"
    System.out.println(e.age); // Returns 17
    System.out.println(e.country); // Returns 17

    var f = new AnotherIndirectSubClass3();
    System.out.println(f.fname); // Returns "Ansha"
    System.out.println(f.lname); // Returns "Cerbia"
    System.out.println(f.age); // Returns 17
    System.out.println(f.country); // Returns 17

    var g = new AnotherIndirectSubClass4();
    System.out.println(g.fname); // Returns "Ansha"
    System.out.println(g.lname); // Returns "Cerbia"
    System.out.println(g.age); // Returns 17
    System.out.println(g.country); // Returns 17

    var h = new com.clairvoyant.project3.DirectSubClass();
    System.out.println(h.fname); // Returns "Ansha"
    System.out.println(h.lname); // Returns "Cerbia"
    System.out.println(h.age); // Returns 17
    System.out.println(h.country); // Returns 17

    var i = new com.clairvoyant.project3.IndirectSubClass();
    System.out.println(i.fname); // Returns "Ansha"
    System.out.println(i.lname); // Returns "Cerbia"
    System.out.println(i.age); // Returns 17
    System.out.println(i.country); // Returns 17

    var j = new com.clairvoyant.project3.AnotherIndirectSubClass1();
    System.out.println(j.fname); // Returns "Ansha"
    System.out.println(j.lname); // Returns "Cerbia"
    System.out.println(j.age); // Returns 17
    System.out.println(j.country); // Returns 17

    var k = new com.clairvoyant.project3.AnotherIndirectSubClass2();
    System.out.println(k.fname); // Returns "Ansha"
    System.out.println(k.lname); // Returns "Cerbia"
    System.out.println(k.age); // Returns 17
    System.out.println(k.country); // Returns 17

    var l = new com.clairvoyant.project3.AnotherIndirectSubClass3();
    System.out.println(l.fname); // Returns "Ansha"
    System.out.println(l.lname); // Returns "Cerbia"
    System.out.println(l.age); // Returns 17
    System.out.println(l.country); // Returns 17

    var m = new com.clairvoyant.project3.AnotherIndirectSubClass4();
    System.out.println(m.fname); // Returns "Ansha"
    System.out.println(m.lname); // Returns "Cerbia"
    System.out.println(m.age); // Returns 17
    System.out.println(m.country); // Returns 17
  }
}
