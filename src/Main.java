public class Main {
    public static void main(String[] args) {
        int a = 462;
        int b = 1071;
        int g = EuclideanAlgorithm.gcd(a, b);

        System.out.println("Greatest Common Divisor (GCD) of two integers A = " + a +
                " and B = " + b + " is " + g);
    }
}