package eu.fincon.challenge.fibonacci;

public class App {
    public static void main(String[] args) {
        printResultsOf(new eu.fincon.challenge.fibonacci.iterativ.FibonacciImpl());
        printResultsOf(new eu.fincon.challenge.fibonacci.rekursiv.FibonacciImpl());
        printResultsOf(new eu.fincon.challenge.fibonacci.stream.FibonacciImpl());
    }

    private static void printResultsOf(Fibonacci f) {
        System.out.println("Implementierung: " + f.getClass().getTypeName());
        String delim = "";
        for (int i = -1; i < 20; i++) {
            try {
                System.out.print(delim + f.calculate(i));
                delim = ", ";
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
    }
}
