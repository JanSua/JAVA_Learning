public class Main {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = true;
        boolean z;

        System.out.println("[x: "+x+ ", y: "+y+"]");

        // Operador lógico AND
        z = x&&y; // si "x" y "y", entonces true.
        System.out.println("x and y: "+z);

        // Operador lógico OR
        z = x||y; // si "x" o "y", entonces true.
        System.out.println("x or y: "+z);

        // Operador lógico NOT
        z = !y;
        System.out.println("not y: "+z);

    }
}