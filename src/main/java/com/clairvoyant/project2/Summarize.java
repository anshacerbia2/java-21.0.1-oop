package com.clairvoyant.project2;


/*
 * CLASS SUMMARIZE
 *
 * Class with access modifier:
 * 1. Private-Package only accessible from any class in the same package
 * 2. Public are accessible from any class in any package
 *
 * Constructor with access modifier (On instantiation):
 * 1. Private-Package accessible by:
 *    - Any classes in same package with the class of the constructor
 * 2. Public accessible by:
 *    - Any classes in any package
 * 3. Protected accessible in:
 *    - Any classes in same package with the class of the constructor
 * 4. Private only accessible from within the class of the constructor
 * Note: Constructor are not inherited
 *
 * Non-Static Attribute/Method of an instance with access modifier (On instantiation):
 * 1. Private-Package accessible by:
 *    - Any classes in same package with the class of the instance
 *      Important: If the instance class extend any classes outside the package, the accessed instance attribute/method
 *                 should be inherited from the instance class itself or from the closest ancestor of the instance class
 *                 that still in the same package before it extends any ancestor from outside the package. E.g:
 *                 Package 1:
 *                 class a
 *                 class b extend a
 *                 class d extend c
 *                 Package 2:
 *                 class c extend a
 *                 Explanation:
 *                 - Accessing attribute/method of instance c/d within class b are not allowed even if the accessed
 *                   attribute/method inherited from class a, which is still in the same package with b
 *                 - Accessing attribute/method of instance d within class b will be allowed if d redefines
 *                   (hiding/overriding) the same attribute/method within itself
 * 2. Public accessible by:
 *    - Any classes in any package
 * 3. Protected accessible by:
 *    - Any classes (in same package with the class that inherits the accessed instance attribute/method)
 *    - Any Subclasses (in different package from the class that inherits the accessed instance attribute/method). They
 *      can only access their own and their ascendant attribute/method as well as their descendants
 * 4. Private accessible:
 *    - With setter and getter (by any classes in any package)
 *    - Without setter and getter (within the class of the instance, the accessed attribute/method should be defined
 *      on it, not inherited from another class)
 *
 * Attribute/Method with non-access modifier:
 * 1. Final   : Cannot be overridden/modified
 * 2. Static  : Belongs to the class, rather than an instance
 *
 * Static Attribute/Method (via class/instance reference) with access modifier (On instantiation):
 * 1. Private-Package accessible by:
 *    - Any classes in same package with the reference (class/class of the instance)
 *      Important: If the reference extend any classes outside the package, the accessed reference attribute/method
 *                 should be inherited from the reference itself or from the closest ancestor of the reference that still
 *                 in the same package before it extends any ancestor from outside the package. E.g:
 *                 Package 1:
 *                 class a
 *                 class b extend a
 *                 class d extend c
 *                 Package 2:
 *                 class c extend a
 *                 Explanation:
 *                 - Accessing attribute/method of class/instance c/d within class b are not allowed even if the accessed
 *                   attribute/method are inherited from class a, which is still in the same package with b
 *                 - Accessing attribute/method of class/instance d within class b will be allowed if d redefines
 *                   (hiding/overriding) the same attribute/method within itself
 * 2. Public accessible by:
 *    - Any classes in any package
 * 3. Protected accessible by:
 *    - Any classes (in same package with the class that inherits the accessed reference attribute/method)
 *    - Any subclasses of the class that inherits the accessed reference attribute/method in any package (subclasses can
 *      access each other, as long as they are under the same superclass that inherits the attribute/method to them)
 * 4. Private accessible:
 *    - With setter and getter (by any classes in any package)
 *    - Without setter and getter (within the class of the instance, the accessed attribute/method should be defined
 *      on it, not inherited from another class)
 *
 * Explanation:
 * Static Attributes (Class Variables): Static attributes are shared among all instances of a class. They are stored at
 *                                      the class level, meaning there is only one copy of the attribute regardless of
 *                                      how many instances of the class exist.
 * Instance Attributes                : Instance attributes are unique to each instance of the class. Each instance has
 *                                      its own copy of these attributes.
 * When you change the value of a static attribute, that change is reflected across all instances of the class.
 */

/*
 * NESTED CLASS:
 *
 * 1. Static Nested Class
 *    - Static class within a class
 *    - Tied to their direct outer class (Not inherited)
 *    - Can be extended by any other classes
 *      Note: Extendable if the static nested class has public access modifier
 *    - Instantiation: new OuterClass.InnerClass()
 *      Note: Static nested class can only be instantiated through its outer class
 * 2. Inner Class
 *    - Non-Static class within a class
 *    - Tied to an instance of their direct outer class (Inherited)
 *    - Can be extended by any other inner classes (Cannot be extended by common class or static nested class)
 *      Important! Extending an inner class from a non-inner class will result in the error: "No enclosing instance of
 *                 type com.clairvoyant.project2.Public is in scope"
 *    - Instantiation: instance.new InnerClass()
 *      Note: Inner class can only be instantiated through the instance of its outer class or the instance of subclass
 *            of its outer class
 *
 * Note: Instantiate can be done in a chain.
 *       The rule is, instance.new InnerClass() cannot be followed by new OuterClass.InnerClass()
 *
 * Static Nested Class Access Modifier:
 * 1. Private-Package accessible by:
 *    - Any classes in the same package with the outer class
 * 2. Public accessible by:
 *    - Any classes in any package
 * 3. Protected accessible by:
 *    - Any classes in the same package with the outer class
 *    - Any subclasses in different package
 * 4. Private accessible by:
 *    - The very outer class and any classes within the very outer class
 *
 * Inner Class Access Modifier:
 * 1. Private-Package accessible by:
 *    - Any inner classes of any classes in the same package with the outer class
 * 2. Public accessible by:
 *    - Any inner classes of any classes in any package
 * 3. Protected accessible by:
 *    - Any inner classes of any classes in the same package with the outer class
 *    - Any inner classes of any subclasses of the outer class in different package
 * 4. Private accessible by:
 *    - Any inner classes of its very outer class
 *
 * Important! Access modifier of Constructor/Attributes/Methods of either static nested class or inner class are the
 *            same with common class access modifier for Constructor/Attributes/Methods. For private, they are all
 *            accessible by any classes within the very outer class
 * Important! Instantiation and class extension in different package cannot be chained if one of the class in chain
 *            has no public access modifier
 *
 * E.g. for instantiation in same package:
 * var a = new Public();
 * var nsip = a.new NSIP();
 * var nsipchild = new Public.NSIP.NSIPChild();
 * var nsip2 = a.new NSIP2();
 * var nsip2child = a.new NSIP2().new NSIP2Child();
 * var nsip2grandchild = new Public.NSIP2.NSIP2Child.NSIP2GrandChild();
 * var sip = new Public.SIP();
 * var sipchild = new Public.SIP().new SIPChild();
 * var sipgrandchild = new Public.SIP().new SIPChild().new SIPGrandChild();
 * var sip2 = new Public.SIP2();
 * var sip2child = new Public.SIP2.SIP2Child();
 * var sip2grandchild = new Public.SIP2.SIP2Child().new SIP2GrandChild();
 *
 * Simulation:
 * Same package       : - com.clairvoyant.project2.Public
 *                      - com.clairvoyant.project2.AccessModifier
 *                      - com.clairvoyant.project2.SubClassOfNestedClass
 *                      - com.clairvoyant.project2.SubClassOfNestedClass2
 *                      - com.clairvoyant.project2.SubClassOfNestedClass3
 * Different package  : - com.clairvoyant.project3.AccessModifier
 *                      - com.clairvoyant.project3.SubClassOfNestedClass
 *                      - com.clairvoyant.project3.SubClassOfNestedClass2
 *                      - com.clairvoyant.project3.SubClassOfNestedClass3
 *
 * GPT: https://chatgpt.com/share/c77cd65d-e69e-4838-a627-1bb6f07efcfa
 */