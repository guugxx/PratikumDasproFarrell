import java.util.Scanner;

public class nestedUjianSkripsi10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan = "";

        System.out.print("Apakah Anda bebas kompen? (Yes/No): ");
        String bebasKompen = sc.nextLine().trim();

        if (bebasKompen.equalsIgnoreCase("Yes")) {
            System.out.print("Jumlah bimbingan dengan Pembimbing 1: ");
            int bimbinganP1 = sc.nextInt();

            System.out.print("Jumlah bimbingan dengan Pembimbing 2: ");
            int bimbinganP2 = sc.nextInt();

            if (bimbinganP1 >= 8) {
                if (bimbinganP2 >= 4) {
                    pesan = "Anda dapat mendaftar ujian skripsi.";
                } else {
                    pesan = "Bimbingan dengan Pembimbing 2 belum memenuhi syarat.";
                }
            } else {
                pesan = "Bimbingan dengan Pembimbing 1 belum memenuhi syarat.";
            }
        } else {
            pesan = "Anda belum bebas kompen, tidak dapat mendaftar ujian skripsi.";
        }

        System.out.println(pesan);
        sc.close();
    }
}

//1 Anda belum bebas kompen, tidak dapat mendaftar ujian skripsi.
//2 Potongan kode ini melakukan pengecekan bersarang (nested if):
//3 Jadi alurnya bertingkat:Bebas Kompen → Bimbingan P1 → Bimbingan P2 → Hasil akhir.