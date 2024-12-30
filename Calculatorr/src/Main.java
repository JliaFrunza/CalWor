public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Calculator calc = (Calculator)Calculator.instance.get();
        int a = (Integer)calc.plus.apply(1, 2);
        int b = (Integer)calc.minus.apply(1, 1);

        try {
            int c = (Integer)calc.divide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException var5) {
            System.out.println("Error: Division by zero");
        }

    }
}