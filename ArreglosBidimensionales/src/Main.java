public class Main {
    public static void main(String[] args) {
        /*
        // Arreglos bidimensionales = Matrices

        String[][] mensaje = {
                {"IzyAcademy", "Te"},
                {"Enseña", "Fácil"}
        };

        System.out.println(mensaje[0][0]);
        System.out.println(mensaje[1][1]);
        */

        String[][] mensaje = new String[2][2];
        mensaje[0][0] = "IzyAcademy";
        mensaje[0][1] = "Te";
        mensaje[1][0] = "Enseña";
        mensaje[1][1] = "Fácil";

        System.out.println(mensaje[0][0]);
        System.out.println(mensaje[1][1]);

    }
}