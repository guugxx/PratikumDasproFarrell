import java.util.Scanner;

public class ifCetakKRS10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        
        String hasil = (uktLunas) 
                        ? "Silakan cetak KRS Anda." 
                        : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";

        System.out.println(hasil);

        sc.close();
    }
}




//1. Karena uktLunas sudah boolean (true/false)
//2. Tidak keluar pesan apa-apa, program langsung selesai
//3. 