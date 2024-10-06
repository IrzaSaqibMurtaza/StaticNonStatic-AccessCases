/*
    Rules for accessing static and non-static members from:
    Static context within another class.
    Non-static context within another class.
*/
package StaticVsNonStatic;

class Second
{
    // Static members need class reference to be accessed from another class
    // Non-static members are accessed by object reference (if called through a static context, otherwise no need for object reference)
    
    public static void main(String[] args)
    {
        // Case 5: 
        // Calling static member in static context **From Another Class**
        System.out.println(First.b); // Class reference needed here
        // Case 6:
        // Calling non-static member in static context **From Another Class**
        First obj2 = new First();
        System.out.println(obj2.a); // Object reference of its class is needed
    }
    
    public void NonStatic()
    {
        // Case 7: 
        // Calling static member in non-static context **From Another Class**
        System.out.println("b: " + First.b); // Class reference needed
        // Case 8:
        // Calling non-static member from a non-static context **From Another Class**
        First obj2 = new First(); // Created instance again as obj2 was limited to the main method's scope
        // Note: The scope of an object in Java is limited to the block or method in which it is defined
        System.out.println(obj2.a);
    }
}
