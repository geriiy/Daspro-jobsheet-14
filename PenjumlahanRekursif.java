import java.util.Scanner;

public class PenjumlahanRekursif {
    static int jumlahBilangan(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + jumlahBilangan(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int hasilJumlah = jumlahBilangan(n);

        System.out.println("Penjumlahan bilangan dari 1 sampai " + n + " adalah: " + hasilJumlah);

        sc.close();
    }
}
