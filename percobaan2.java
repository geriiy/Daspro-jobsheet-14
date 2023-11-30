import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }

    static void cetakDeretPangkat(int x, int y) {
        System.out.print("Deret Pangkat: ");
        for (int i = 0; i < y; i++) {
            System.out.print(x);
            if (i < y - 1) {
                System.out.print("x");
            }
        }
        System.out.print(" = " + hitungPangkat(x, y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung : ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat                : ");
        int pangkat = sc.nextInt();

        cetakDeretPangkat(bilangan, pangkat);

        sc.close();
    }
}
