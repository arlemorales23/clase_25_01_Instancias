package Veterinaria;

public class ClasePrincipal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.registrarMascota();
        System.out.println("El nombre del animal es " + animal.nombreAnimal + " y tiene un peso de " + animal.peso + " Kilogramos");
    }
}
