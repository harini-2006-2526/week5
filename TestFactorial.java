public class TestFactorial {
    public static void main(String[] args) {
        System.out.println(Factorial.factorial(5));

        if (Factorial.factorial(5) == 120)
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");
    }
}