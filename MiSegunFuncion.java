import java.util.Scanner;
public class MiSegunFuncion {
    public static void main(String[] args) {
        int lado;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el lado del cuadrado que quieres dibujar: ");
        lado = entrada.nextInt();

        dibujaCuadrado(lado);
    }

    private static void dibujaCuadrado(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (j == 0 || i == 0 || j == lado -1 || i == lado -1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
