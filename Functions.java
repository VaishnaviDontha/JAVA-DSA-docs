
/* 

Description - Examples for the module - Functions in Java

*/

class Functions {

    // Example for passing parameters in JAVA
    // Pass by Value
    private static void passByValue(int a) {
        a++;
        System.out.println(a);
    }

    // Example for varArgs
    static void varArgsFunction(int a, String... str) {
        System.out.println( a);

        for (String string : str) {
            System.out.println(string);
        }
        

    }

    // Usage of Return keyword
    // via value
    private static int returnValue(int a, int b) {

        int sum = a + b;
        return sum;

    }

    // without any value
    private static void returnNoValue(int a, int b) {

        int sum = a + b;
        System.out.println(sum);

    }

    // return via void

    private static void returnViaVoid(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    // Main method
    public static void main(String[] args) {

        passByValue(5);
        varArgsFunction(12, "String1", "String2");
        System.out.println(returnValue(10, 20));
        returnNoValue(20, 30);
        returnViaVoid(30, 40);

    }

}