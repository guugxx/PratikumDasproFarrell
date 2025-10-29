import java.util.Scanner;

public class ratanilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahMahasiswa = 5;
        int jumlahTugas = 5;
        int i = 1; // untuk while loop mahasiswa
        
        while (i <= jumlahMahasiswa) {
            System.out.println("Mahasiswa ke-" + i);
            double totalNilai = 0;
            
            for (int j = 1; j <= jumlahTugas; j++) {
                System.out.print("Masukkan nilai tugas ke-" + j + " : ");
                double nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            double rataNilai = totalNilai / jumlahTugas;
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " = " + rataNilai);
            System.out.println();
            
            i++;
        }

        sc.close();
    }
}
