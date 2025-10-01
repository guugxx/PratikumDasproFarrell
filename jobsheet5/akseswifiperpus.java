import java.util.Scanner;

public class akseswifiperpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sistem Perpustakaan
        System.out.print("Apakah Anda anggota perpustakaan? (Yes/No): ");
        String anggota = sc.nextLine().trim();

        if (anggota.equalsIgnoreCase("Yes")) {
            System.out.print("Apakah Anda memiliki tunggakan buku? (Yes/No): ");
            String tunggakan = sc.nextLine().trim();

            if (tunggakan.equalsIgnoreCase("No")) {
                System.out.println("Anda dapat meminjam buku di perpustakaan.");
            } else {
                System.out.println("Anda tidak dapat meminjam buku karena masih ada tunggakan.");
            }
        } else {
            System.out.println("Anda bukan anggota perpustakaan.");
        }

        // Sistem WIFI Kampus
        System.out.print("\nMasukkan NIM untuk akses WIFI: ");
        String nim = sc.nextLine().trim();
        System.out.print("Masukkan password WIFI: ");
        String password = sc.nextLine().trim();

        if (nim.equals("224172001") && password.equals("polinema123")) {
            System.out.println("Akses WIFI berhasil!");
        } else {
            System.out.println("Akses WIFI ditolak, NIM atau password salah.");
        }

        sc.close();
    }
}
