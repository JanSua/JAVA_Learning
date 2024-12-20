import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion = 0;

        while(opcion!=4){
            System.out.println("***GESTOR DE TAREAS***");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Salir");

            System.out.print("Ingresa el número de la opción que deseas : ");
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();


            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado agregar tarea");
                    break;
                case 2:
                    System.out.println("Has  seleccionado mostrar tarea");
                    break;
                case 3:
                    System.out.println("Has seleccionado completar tarea");
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}