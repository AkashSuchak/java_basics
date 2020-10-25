public class Constructor {
    int x,y,z;

    // constructor with no parameter
    public Constructor(){
        System.out.println("Default Constructor Called");
        x = 4;
    }

    // constructor with single parameter
    public Constructor(int y){
        System.out.println("Parameterized Constructor called");
        z=y;
    }

    public static void main(String[] args) {
        // calling the constructor with no parameter
        Constructor defaultObj = new Constructor();

        // calling the constructor with single parameter
        Constructor paraObj = new Constructor(10);
        int sum = defaultObj.x + paraObj.z;
        System.out.println("X comes from Default and Y comes from Parameter : ");
        System.out.println("Sum of X and Y is : "+ sum);
    }

}
