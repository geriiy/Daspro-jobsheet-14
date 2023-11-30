import java.util.Scanner;

public class DeretDescendingRekursif {
    static void tampilDeretRekursif(int n1) {
        if (n1 >= 0) {
            System.out.print(n1 + " ");
            tampilDeretRekursif(n1 - 1);
        }
    }
    static void tampilDeretIteratif(int n2) {
        for (int i = n2; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n1: ");
        int n1 = sc.nextInt();
        System.out.print("Masukkan nilai n2: ");
        int n2 = sc.nextInt();

        System.out.println("Deret dari " + n1 + " sampai 0 (rekursif): ");
        tampilDeretRekursif(n1);
        System.out.println("\nDeret dari " + n2 + " sampai 0 (iteratif): ");
        tampilDeretIteratif(n2);

        sc.close();
    }
}
