import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        int opcion;

        System.out.println("***GESTOR DE TAREAS***");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Mostrar tareas");
        System.out.println("3. Marcar tarea como completada");
        System.out.println("4. Salir");
        System.out.print("Ingresa el número de la opción que deseas : ");
        Scanner scan = new Scanner(System.in);
        opcion = scan.nextInt();

        if (opcion==1) {
            System.out.println("has seleccionado la opción 1");
        }
        else if (opcion==2) {
            System.out.println("has seleccionado la opción 2");
        }
        else if (opcion==3) {
            System.out.println("has seleccionado la opción 3");
        }
        else if (opcion==4) {
            System.out.println("te deseamos lo mejor, hasta luego ");
        }
        else if (opcion>4 || opcion<1) {
            System.out.println("opción no válida  ");
        }
    }
}