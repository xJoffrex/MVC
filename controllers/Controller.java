package controllers;

import models.Person;
import views.View;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private View vista;
    private SortingMethods orden;
    private SearchMethods busqueda;
    private List<Person> lista = new ArrayList<>();

    public Controller(View vista, SortingMethods orden, SearchMethods busqueda) {
        this.vista = vista;
        this.orden = orden;
        this.busqueda = busqueda;
    }

    public void start() {
        int op;
        while ((op = vista.mostrarMenu()) != 5) {
            if (op == 1) lista.add(vista.ingresarPersona());
            else if (op == 2) vista.mostrarPersonas(lista.toArray(new Person[0]));
            else if (op == 3) ordenar();
            else if (op == 4) buscar();
        }
    }

    private void ordenar() {
        Person[] arr = lista.toArray(new Person[0]);
        int op = vista.elegirOrden();
        if (op == 1) orden.sortByNameWithBubble(arr);
        else if (op == 2) orden.sortByNameWithSelectionDes(arr);
        else if (op == 3) orden.sortByAgeWithInsertion(arr);
        else if (op == 4) orden.sortByNameWithInsertion(arr);
        lista.clear();
        for (Person p : arr) lista.add(p);
    }

    private void buscar() {
        Person[] arr = lista.toArray(new Person[0]);
        int criterio = vista.elegirBusqueda();
        if (criterio == 1) {
            if (!busqueda.isSortedByAge(arr)) orden.sortByAgeWithInsertion(arr);
            int edad = vista.ingresarEdad();
            vista.mostrarResultado(busqueda.binarySearchByAge(arr, edad));
        } else {
            if (!busqueda.isSortedByName(arr)) orden.sortByNameWithInsertion(arr);
            String nombre = vista.ingresarNombre();
            vista.mostrarResultado(busqueda.binarySearchByName(arr, nombre));
        }
    }
}