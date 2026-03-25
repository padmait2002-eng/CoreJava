package com.padma;

/**
 * Demonstrates the order of execution for static blocks, instance blocks, and constructors.
 * <p>
 * Expected Order:
 * 1. Static Blocks (executed only once when the class is loaded)
 * 2. Instance Blocks (executed every time an object is created, before the constructor)
 * 3. Constructor (executed every time an object is created, after instance blocks)
 */
public class ExecutionOrder {

    // Static Block 1
    static {
        System.out.println("1. Static Block 1 executed");
    }

    // Instance Initialization Block 1
    {
        System.out.println("3. Instance Block 1 executed");
    }

    // Constructor
    public ExecutionOrder() {
        System.out.println("5. Constructor executed");
    }

    // Static Block 2
    static {
        System.out.println("2. Static Block 2 executed");
    }

    // Instance Initialization Block 2
    {
        System.out.println("4. Instance Block 2 executed");
    }

    public static void main(String[] args) {
        System.out.println("--- Main method started ---");
        
        System.out.println("\nCreating first object:");
        ExecutionOrder obj1 = new ExecutionOrder();

        System.out.println("\nCreating second object:");
        ExecutionOrder obj2 = new ExecutionOrder();

        System.out.println("\n--- Main method ended ---");

        int a=10;
        {
            int b=10;
            System.out.println("Final Executed");
        }
    }
}
