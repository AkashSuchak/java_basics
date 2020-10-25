//Simple Method Example
public class Method {
    public static void main(String[] args) {
        System.out.println("This Message Displying From main() method");

        // method call
        myMethod();

        System.out.println("Method was executed successfully!");
    }

    // method definition
    private static void myMethod(){
        System.out.println("This Message Displying From myMethod() method");
    }
}
