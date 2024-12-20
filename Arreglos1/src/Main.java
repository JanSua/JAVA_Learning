public class Main {
    public static void main(String[] args) {
        int[] num = new int[10];

        for(int i = 0; i < num.length; i++){
            num[i] = i * (2 + i);
            System.out.print(num[i]+ ", ");

        }
    }
}