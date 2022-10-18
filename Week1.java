public class Week1 {
    // Exercises with int
    private static void int_exercise1(){
        // Enter code for exercise 1
    }

    private static void int_exercise2(){
        // Enter code for exercise 2
    }

    private static int int_exercise3(int a, int b){
        // Enter code for exercise 3
        return -1;
    }

    private static int int_exercise4(int a, int b){
        // Enter code for exercise 4
        return -1;
    }

    private static int int_exercise5(int a, int b, int c){
        // Enter code for exercise 4
        return -1;
    }










    // Exercises with double
    private static void double_exercise1(){
        // Enter code for exercise 1
    }

    private static void double_exercise2(){
        // Enter code for exercise 2
    }

    private static double double_exercise3(double a, double b){
        // Enter code for exercise 3
        return -1;
    }

    private static int double_exercise4(double a, double b){
        // Enter code for exercise 4
        return -1;
    }

    private static int double_exercise5(double a, double b){
        // Enter code for exercise 4
        return -1;
    }










    public static void main(String[] args) {
        run_int();
    }

    private static void run_int(){
        int_exercise1();
        System.out.println("Please ask an experienced member to check your code for Exercise 1.");
        int_exercise2();
        System.out.println("Please ask an experienced member to check your code for Exercise 2.");

        for (int i = 0; i < 10; i++){
            int numInputs = 2;
            int[] inputs = new int[numInputs];
            for (int j = 0; j < numInputs; j++){
                inputs[j] = (int) (Math.random() * 100);
            }
            int expectedOutput = inputs[0] + inputs[1];
            int actualOutput = int_exercise3(inputs[0], inputs[1]);
            if (actualOutput != expectedOutput){
                System.out.println("Exercise 3 testing failed.");
                System.out.println("Inputs: " + inputs[0] + " and " + inputs[1]);
                System.out.println("Expected output: " + expectedOutput);
                System.out.println("Actual output: " + actualOutput);
                System.exit(0);
            }
        }
        System.out.println("Exercise 3 passed!");

        for (int i = 0; i < 10; i++){
            int numInputs = 2;
            int[] inputs = new int[numInputs];
            for (int j = 0; j < numInputs; j++){
                inputs[j] = (int) (Math.random() * 100);
            }
            int expectedOutput = inputs[0] * inputs[1] - inputs[0] - inputs[1];
            int actualOutput = int_exercise4(inputs[0], inputs[1]);
            if (actualOutput != expectedOutput){
                System.out.println("Exercise 4 testing failed.");
                System.out.println("Inputs: " + inputs[0] + " and " + inputs[1]);
                System.out.println("Expected output: " + expectedOutput);
                System.out.println("Actual output: " + actualOutput);
                System.exit(0);
            }
        }
        System.out.println("Exercise 4 passed!");

        for (int i = 0; i < 10; i++){
            int numInputs = 3;
            int[] inputs = new int[numInputs];
            for (int j = 0; j < numInputs; j++){
                inputs[j] = (int) (Math.random() * 100);
            }
            int expectedOutput = (inputs[1] + inputs[2]) * inputs[0];
            int actualOutput = int_exercise5(inputs[0], inputs[1], inputs[2]);
            if (actualOutput != expectedOutput){
                System.out.println("Exercise 5 testing failed.");
                System.out.println("Inputs: " + inputs[0] + " and " + inputs[1]);
                System.out.println("Expected output: " + expectedOutput);
                System.out.println("Actual output: " + actualOutput);
                System.exit(0);
            }
        }
        System.out.println("Exercise 5 passed!");
    }

    private static void run_double(){
        double_exercise1();
        System.out.println("Please ask an experienced member to check your code for Exercise 1.");
        double_exercise2();
        System.out.println("Please ask an experienced member to check your code for Exercise 2.");

        for (int i = 0; i < 10; i++){
            int numInputs = 2;
            double[] inputs = new double[numInputs];
            for (int j = 0; j < numInputs; j++){
                inputs[j] = Math.random() * 100;
            }
            double expectedOutput = inputs[0] * inputs[1];
            double actualOutput = double_exercise3(inputs[0], inputs[1]);
            if (Math.abs(actualOutput - expectedOutput) > 0.00001){
                System.out.println("Exercise 3 testing failed.");
                System.out.println("Inputs: " + inputs[0] + " and " + inputs[1]);
                System.out.println("Expected output: " + expectedOutput);
                System.out.println("Actual output: " + actualOutput);
                System.exit(0);
            }
        }
        System.out.println("Exercise 3 passed!");

        for (int i = 0; i < 10; i++){
            int numInputs = 2;
            double[] inputs = new double[numInputs];
            for (int j = 0; j < numInputs; j++){
                inputs[j] = Math.random() * 100;
            }
            double expectedOutput = inputs[0] + 2*inputs[1];
            double actualOutput = double_exercise4(inputs[0], inputs[1]);
            if (Math.abs(actualOutput - expectedOutput) > 0.00001){
                System.out.println("Exercise 4 testing failed.");
                System.out.println("Inputs: " + inputs[0] + " and " + inputs[1]);
                System.out.println("Expected output: " + expectedOutput);
                System.out.println("Actual output: " + actualOutput);
                System.exit(0);
            }
        }
        System.out.println("Exercise 4 passed!");

        System.out.println("Please ask an experienced member to check your code for Exercise 5.");
        for (int i = 0; i < 10; i++){
            int numInputs = 2;
            double[] inputs = new double[numInputs];
            for (int j = 0; j < numInputs; j++){
                inputs[j] = Math.random() * 100;
            }
            System.out.println("----- Inputs: " + inputs[0] + ", " + inputs[1] + " -----");
            double_exercise5(inputs[0], inputs[1]);
        }
        System.out.println("Please ask an experienced member to check your code for Exercise 5.");
    }
}
