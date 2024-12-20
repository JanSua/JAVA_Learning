public class Main {
    public static void main(String[] args) {
        // Arreglos para almacenar varios datos.

        int[] num = {2, 3, 7, 1, 4}; // asignar valores desde la inicialización

        int[] num1 = new int[5]; // sin asignar valores (def:0), pero sí el tamaño
        num1[0] = 8;
        num1[2] = 4;
        num1[4] = 1;

        for(int i=0; i<num1.length; i++){
            System.out.println("Valor en num1["+i+"]: "+num1[i]);
        }

    }
}