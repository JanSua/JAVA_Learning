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
            System.out.println("***GESTOR DE TAREAS***");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Salir");
            System.out.print("Ingresa el número de la opción que deseas : ");
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();
            System.out.println("el dato ingresado es :" + opcion);
            switch (opcion) {
                case 1:
                    System.out.println("---- Interfaz para añadir tareas -----");
                    System.out.print("Escribe la tarea a almacenar: ");
                    Scanner dato = new Scanner(System.in);
                    tarea = dato.nextLine();
                    listaTareas.add(tarea);
                    break;
                case 2:
                    System.out.println("****** Listas de las tareas *******");
                    System.out.println("****** Pendientes *******");
                    if(listaTareas.isEmpty()==true){
                    System.out.println("lista de tareas está vacía.");
                }else{

                    int i = 1;
                    for (String tareaMostrar: listaTareas){
                        System.out.print(i+". ");
                        System.out.println(tareaMostrar);
                        i++;
                    }
                }
                    System.out.println("****** Completadas *******");
                    if(listaTareas.isEmpty()==true){
                        System.out.println("La lista de tareas está vacía.");
                    }else {
                        int i = 1;
                        for (String tareaMostrar: listaTareasCompletadas){
                            System.out.print(i+". ");
                            System.out.println(tareaMostrar);
                            i++;
                        }
                    }

                    break;
                case 3:
                    if(listaTareas.isEmpty()==true){
                        System.out.println("La lista de tareas está vacía.");
                    }else{
                        int i = 1;
                        for (String tareaMostrar: listaTareas){
                            System.out.print(i+". ");
                            System.out.println(tareaMostrar);
                            i++;
                        }
                        System.out.print(" >> Escribe la tarea a completar >> ");
                        Scanner completada = new Scanner(System.in);
                        numeroTarea = completada.nextInt();
                        listaTareasCompletadas.add(listaTareas.get(numeroTarea-1));
                        listaTareas.remove(numeroTarea-1);
                    }

                    break;
                case 4:
                    System.out.println("Hasta  luego");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}