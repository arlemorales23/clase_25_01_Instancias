package Area;

import java.util.Scanner;

public class AreaPrincipal {
    public static void main(String[] args) {
        Area area = new Area();
        Scanner lector = new Scanner(System.in);

        System.out.println("ingrese base : ");
        area.base = lector.nextInt();

        System.out.println("ingrese la altura: ");
        area.altura = lector.nextInt();

        System.out.println("El area es " + area.calcularArea());
    }
}
