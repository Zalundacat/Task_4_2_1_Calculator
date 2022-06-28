public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println((intsCalc.sub(25, 25)));
        System.out.println(intsCalc.pow(2, 10));
        System.out.println(intsCalc.mult(15, 10));
        System.out.println(intsCalc.div(100, 5));
    }
}