package m2.s09;

public class Wrapper {
    public static void main(String[] args) {
        Boolean f1 = Boolean.valueOf(true);
        Boolean f2 = Boolean.valueOf("True");
        boolean f3 = Boolean.parseBoolean("True");
        System.out.println(f1 + ", " + f2 + ", " + f3);

        System.out.println("Is '9' a digit? " + Character.isDigit('9'));
        System.out.println("Is 'k' a letter? " + Character.isLetter('k'));
        System.out.println("Is 'x' a letter or digit? " + Character.isLetterOrDigit('k'));
        System.out.println("Is 'c' a lowercase letter? " + Character.isLowerCase('c'));
        System.out.println("Is 'W' an uppercase letter? " + Character.isUpperCase('W'));
        System.out.println("'c' to uppercase " + Character.toUpperCase('c'));
        System.out.println("'W' to lowercase " + Character.toLowerCase('W'));

        System.out.println(Integer.parseInt("42"));
        System.out.println(Integer.toHexString(65535));

        double x = Math.sqrt(-2);
        System.out.println("Is NaN? " + Double.isNaN(x));
        System.out.println(Double.NaN + ", " + x + ", " + (x == Double.NaN));
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
    }
}
