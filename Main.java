public class Main {

    // The main method will always be called first.
    public static void main(String[] args) {
        // Java is case sens so system needs to be capitalized
        System.out.println("Hello World");

        // I wonder, how does this differ from other outputs.

        System.out.print("Test");
        System.out.print("Test");
        /* Seems as though they are conjoined since the default "end" type keyword is set to null...
        Or however java describes this
        Oh yeah, this is a multi-line comment btw.*/

        System.out.println();

        System.out.println("You can represent other datatype with print commands such as: " + 3);

        // Take a look on how to create different variables:
        String name = "David";
        int age = 22;
        boolean is_male = true;
        float height = 2.99f;
        double weight = 3000.12345678d;

        System.out.println(name + age + is_male + height + weight);

        // Probably need to check on the precision and accuracy differences between floats and doubles.
    }
}