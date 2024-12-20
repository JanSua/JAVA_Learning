import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaTareas = new ArrayList<>();
        ArrayList<String> listaTareasCompletadas = new ArrayList<>();
        String tarea;
        int numeroTarea;
        int opcion = 0;
        while (opcion != 4) {
            menu();
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    agregarTareas(listaTareas);
                    break;
                case 2:
                    mostrarTareas(listaTareas, listaTareasCompletadas);
                    break;
                case 3:
                    marcarTareaCompletada(listaTareas, listaTareasCompletadas);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    public static  void menu(){
        System.out.println("***GESTOR DE TAREAS***");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Mostrar tareas");
        System.out.println("3. Marcar tarea como completada");
        System.out.println("4. Salir");
        System.out.print("Ingresa el número de la opción que deseas >> ");
    }
    public static void agregarTareas(ArrayList<String> listaTareas){
        System.out.println("Escribe la tarea a almacenar: ");
        Scanner dato = new Scanner(System.in);
        String tarea = dato.nextLine();
        listaTareas.add(tarea);
    }
    public static void mostrarTareas(ArrayList<String> listaTareas, ArrayList<String> listaTareasCompletadas){
        if (listaTareas.isEmpty() == true) {
            System.out.println("No hay tareas completadas");
        } else {
            System.out.println("Lista de tareas almacenadas: ");
            int i = 1;
            for (String tareaAlmacenada : listaTareas) {
                System.out.println(i + " . " + tareaAlmacenada);
                i++;
            }
            if (listaTareasCompletadas.isEmpty() == true) {
                System.out.println("No hay tareas completadas");
            }
            else{
                System.out.println("Tareas completadas: ");
                int j = 1;
                for (String tareaLista : listaTareasCompletadas) {
                    System.out.println(j + " . " + tareaLista);
                    j++;
                }
            }

        }
    }
    public static void marcarTareaCompletada(ArrayList<String> listaTareas, ArrayList<String> listaTareasCompletadas){
        System.out.println("Escribe el numero de la tarea");
        if (listaTareas.isEmpty() == true) {
            System.out.println("No hay tareas almacenadas");
        } else {
            System.out.println("Tareas almacenadas: ");
            int k = 1;
            for (String tareaAlmacenada : listaTareas) {
                System.out.println(k + " . " + tareaAlmacenada);
                k++;
            }
            Scanner completada = new Scanner(System.in);
            int numeroTarea = completada.nextInt();
            listaTareasCompletadas.add(listaTareas.get(numeroTarea - 1));
            listaTareas.remove(numeroTarea - 1);
        }
    }
}