public class Calculadora {
    // Método que soma dois inteiros
    public int soma(int a, int b) {
        return a + b;
    }

    // Método que soma três inteiros
    public int soma(int a, int b, int c) {
        return a + b + c;
    }

    // Método que soma dois números de ponto flutuante
    public double soma(double a, double b) {
        return a + b;
    }

    // Método que soma três números de ponto flutuante
    public double soma(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma de dois inteiros: " + calc.soma(2, 3));
        System.out.println("Soma de três inteiros: " + calc.soma(1, 2, 3));
        System.out.println("Soma de dois doubles: " + calc.soma(2.5, 3.5));
        System.out.println("Soma de três doubles: " + calc.soma(1.1, 2.2, 3.3));
    }
}