package ejerciciosuma;

public class PrincipalSuma {
    public static void main(String[] args) {
        Suma objeto = new Suma(); // instancia
        Suma suma = new Suma();

        objeto.numero1 = 2;
        objeto.numero2 = 5;
        System.out.println("la suma es " + objeto.sumar());
    }
}
