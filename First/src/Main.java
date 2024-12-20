import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        System.out.println("** TASKS MANAGER **");
        System.out.println("1. Add");
        System.out.println("2. Show tasks");
        System.out.println("3. Complete task");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Write your option: ");
        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();
        System.out.println("Selected option: " + option);
    }
}