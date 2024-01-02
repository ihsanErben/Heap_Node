
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Heap x = new Heap();
        System.out.println("-----------------------------------");

        while (true) {
            System.out.println("1 - enqueue");
            System.out.print("secim :");
            int a = input.nextInt();
            switch (a) {
                case 0:
                    return;
                case 1:
                    System.out.print("data: ");
                    int data = input.nextInt();
                    x.enqueue(data);
                    x.print();
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
            System.out.println("-------------------");
        }
    }
}
