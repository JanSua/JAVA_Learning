import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaAnimales = new ArrayList<>();
        listaAnimales.add("León");
        listaAnimales.add("Perro");
        listaAnimales.add("Elefante");
        listaAnimales.add("Tiburón");

        for(int i=0; i<listaAnimales.size(); i++){
            System.out.println(listaAnimales.get(i));
        }

    }
}