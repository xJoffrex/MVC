import controllers.Controller;
import controllers.SortingMethods;
import controllers.SearchMethods;
import views.View;

public class App {
    public static void main(String[] args) {
        View vista = new View();
        SortingMethods orden = new SortingMethods();
        SearchMethods busqueda = new SearchMethods();
        Controller controlador = new Controller(vista, orden, busqueda);
        controlador.start();
    }
}
