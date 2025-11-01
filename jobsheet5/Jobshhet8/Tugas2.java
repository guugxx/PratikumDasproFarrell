import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang olahraga: ");
        int jumlahCabor = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        int i = 1;
        while (i <= jumlahCabor) {
            System.out.println("\n=== Cabang Olahraga ke-" + i + " ===");

            // Memproses 5 atlet per cabang olahraga
            int j = 1;
            while (j <= 5) {
                System.out.print("Masukkan nama atlet ke-" + j + ": ");
                String namaAtlet = sc.nextLine();

                System.out.println("Nama atlet ke-" + j + ": " + namaAtlet);
                j++;
            }

            i++;
        }

        sc.close();
    }
}
