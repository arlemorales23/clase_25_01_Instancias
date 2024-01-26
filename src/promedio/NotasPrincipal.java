package promedio;

import java.util.Scanner;

public class NotasPrincipal {
    public static void main(String[] args) {
        Notas notas = new Notas();
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la nota numero1: ");
        notas.n1 = lector.nextFloat();
        System.out.println("Ingrese la nota numero2: ");

        notas.n2 = lector.nextFloat();
        System.out.println("Ingrese la nota numero3: ");

        notas.n3 = lector.nextFloat();
        System.out.println("El promedio de notas es: " + notas.calcularPromedio());
    }
}
