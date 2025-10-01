import java.util.Scanner;

public class switchCetakKRS10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("Cetak KRS Semester 1");
                break;
            case 2:
                System.out.println("Cetak KRS Semester 2");
                break;
            case 3:
                System.out.println("Cetak KRS Semester 3");
                break;
            case 4:
                System.out.println("Cetak KRS Semester 4");
                break;
            case 5:
                System.out.println("Cetak KRS Semester 5");
                break;
            case 6:
                System.out.println("Cetak KRS Semester 6");
                break;
            case 7:
                System.out.println("Cetak KRS Semester 7");
                break;
            case 8:
                System.out.println("Cetak KRS Semester 8");
                break;
            default:
                System.out.println("Semester tidak valid!");
                break;
        }

        sc.close();
    }
}
//1. Sintaks break digunakan untuk menghentikan eksekusi di dalam suatu blok switch-case setelah satu case terpenuhi.
//Tanpa break, program akan melanjutkan eksekusi ke case berikutnya meskipun kondisinya tidak sesuai (disebut fall-through).
//2. default berfungsi sebagai jalan terakhir ketika tidak ada satupun case yang cocok dengan nilai yang diuji.
//Ini mirip dengan else pada struktur if-else.