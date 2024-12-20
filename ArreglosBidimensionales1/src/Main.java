public class Main {
    public static void main(String[] args) {
        String[][] mensaje = new String[2][2];
        mensaje[0][0] = "IzyAcademy";
        mensaje[0][1] = "Te";
        mensaje[1][0] = "Enseña";
        mensaje[1][1] = "Fácil";

        for(int i = 0; i < mensaje.length; i++){
            for(int j = 0; j < mensaje[i].length; j++){
                System.out.print(mensaje[i][j]+" ");
            }
            System.out.println();
        }
    }
}