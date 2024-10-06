/*
    Rules for accessing static and non-static members from:
    Static context within the same class.
    Non-static context within the same class.
*/
package StaticVsNonStatic;

public class First
{
    
    // Static members can be accessed directly from both static and non-static contexts within the same class, without the need for the class reference
    // Non-static members are accessed by object reference (if called through a static context, otherwise no need for object reference)
    int a;
    static int b;
    
    
    public static void main(String[] args)
    {
        // Case 1: 
        // Calling non-static member in static context
        First obj = new First();
        System.out.println(obj.a); // Need object reference
        obj.NonStatic();
        // Case 2
        // Calling static member in static method
        System.out.println(b); // No need of class reference
    }
    
    public void NonStatic()
    {
        // Case 3: 
        // Calling non-static member in non-static context
        System.out.println("a: " + a);
        // Case 4: 
        // Calling static member in non-static context **From Same Class**
        System.out.println("b: " + b); // No need of class reference
    }
}
