# Java OOP

The project is aimed to show the way, in what OOP is implemented in Java. Main possibilities and functions are used there.

## Principles of OOP in Java

 - Encapsulation is - changing functions and variables to methods and fields of classes. 
   Also it's part is implementation hiding, in Java it is implemented by access modifiers.

 - Inheritance is - possibility of getting parent's fields and methods by child. 
   In Java there are interfaces, simple and abstract classes for implementation of this principle.

 - Polymorphism is - changing object's characteristics depending on context.
   Example of Java implementation is the assignment to the parent's variable child object.


### Tree of inheritance

   abstarct Vehicle ( speed, isEco, abstract go() ) -> Bike ( speed, true, go() )
   
   abstarct Vehicle ( speed, isEco, abstract go() ) -> abstract Car ( speed, isEco, Engine, abstract go() )
   
   abstract Car ( speed, isEco, Engine, abstract go() ) -> Tesla ( speed, true, Engine, go() )
   
   abstract Car ( speed, isEco, Engine, abstract go() ) -> BMW ( speed, false, Engine, go() )
   
   Engine( model, power )
