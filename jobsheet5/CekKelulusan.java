import java.util.Scanner;

public class CekKelulusan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = sc.nextInt();

        if (nilai >= 60) {
            System.out.println("Selamat, Anda LULUS!");
        } else {
            System.out.println("Maaf, Anda TIDAK LULUS.");
        }

        sc.close();
    }
}
