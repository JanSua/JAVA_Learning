public class Main {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        boolean z;
        z = x==y;
        System.out.println("¿Son iguales?: "+z);
        z = x!=y;
        System.out.println("¿Son diferentes?: "+z);

        int x1 = 2;
        int y1 = 4;

        z = x1>y1;
        System.out.println("¿x1 es mayor a y1?: "+z);

        z = x1<=y1;
        System.out.println("¿x1 es menor o igual a y1?: "+z);



    }
}