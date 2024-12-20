import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listAnimales = new ArrayList<>();
        listAnimales.add("León");
        listAnimales.add("Perro");
        listAnimales.add("Elefante");
        listAnimales.add("Tiburón");

        for (String animal: listAnimales) {
            System.out.println(animal);
        }
        listAnimales.remove(2); //Quita un elemento según index
        System.out.println();

        for (String animal: listAnimales) {
            System.out.println(animal);
        }
        System.out.println();

        /*
        listAnimales.clear(); // Limpia la lista, quita todos los valores
        for (String animal: listAnimales) {
            System.out.println(animal);
        }
        */

        if(listAnimales.contains("León")==true){ // boolean .contains("")
            System.out.println("Si contiene león");
        }

        System.out.println("León se encuentra en el index: ["+ listAnimales.indexOf("León")+"]");


    }
}