package views;

import java.util.Scanner;
import models.Person;

public class View {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n1. Agregar\n2. Mostrar\n3. Ordenar\n4. Buscar\n5. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public Person ingresarPersona() {
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        return new Person(nombre, edad);
    }

    public String ingresarNombre() {
        sc.nextLine();
        System.out.print("Nombre a buscar: ");
        return sc.nextLine();
    }

    public int ingresarEdad() {
        System.out.print("Edad a buscar: ");
        return sc.nextInt();
    }

    public void mostrarPersonas(Person[] personas) {
        for (Person p : personas) System.out.println(p);
    }

    public void mostrarResultado(Person p) {
        System.out.println(p != null ? "Encontrado: " + p : "No encontrado.");
    }

    public int elegirOrden() {
        System.out.println("1. Nombre Burbuja\n2. Nombre Selección Desc.\n3. Edad Inserción\n4. Nombre Inserción");
        System.out.print("Ordenar por: ");
        return sc.nextInt();
    }

    public int elegirBusqueda() {
        System.out.println("1. Edad\n2. Nombre");
        System.out.print("Buscar por: ");
        return sc.nextInt();
    }
}