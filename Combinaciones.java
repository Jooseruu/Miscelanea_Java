import java.util.Scanner;

public class Combinaciones{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el valor de k: ");
        int k = scanner.nextInt();

        int combinaciones = calcularCombinaciones(n, k);
        System.out.println("El número de combinaciones posibles de " + n + " elementos tomados de " + k + " en " + k + " es: " + combinaciones);
    }

    public static int calcularCombinaciones(int n, int k) {
        int numerador = 1;
        for (int i = n; i > n - k; i--) {
            numerador *= i;
        }

        int denominador = 1;
        for (int i = 2; i <= k; i++) {
            denominador *= i;
        }

        int combinaciones = numerador / denominador;
        return combinaciones;
    }

}

