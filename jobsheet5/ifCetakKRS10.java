import java.util.Scanner;

public class ifCetakKRS10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
    }
}



//1. Karena uktLunas sudah boolean (true/false)
//2. Tidak keluar pesan apa-apa, program langsung selesai
//3. 