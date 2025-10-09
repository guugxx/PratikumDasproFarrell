import java.util.Scanner;
public class ketentuankelulusan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String STATUS,STATUS2,NILAIHURUF,NILAIHURUF2;

        System.out.println("==== INPUT DATA MAHASISWA ====");

        System.out.print("NAMA\t: ");
        String NAMA = input.nextLine();
        
        System.out.print("NIM\t:");
        String NIM = input.nextLine();

        System.out.println("--- Mata Kuliah 1 : Algoritma dan Pemograman---");

        System.out.print("Nilai UTS\t: ");
        int NILAIUTS = input.nextInt();

        System.out.print("Nilai UAS\t:");
        int NILAIUAS = input.nextInt();

        System.out.print("Nilai Tugas\t:");
        int NILAITUGAS = input.nextInt();

        System.out.println("--- Mata Kuliah 2 : Algoritma dan Pemograman---");

        System.out.print("Nilai UTS\t: ");
        int NILAIUTS2 = input.nextInt();

        System.out.print("Nilai UAS\t:");
        int NILAIUAS2 = input.nextInt();

        System.out.print("Nilai Tugas\t:");
        int NILAITugas2 = input.nextInt();

        System.out.println("=========== HASIL PENILAIAN AKADEMIK==========");
        System.out.println("Nama\t " + NAMA);
        System.out.println("Nama\t " + NIM);

        Double NILAIAKHIR = (NILAITUGAS * 0.3) + (NILAIUTS * 0.3) + (NILAIUAS * 0.4);
        Double NILAIAKHIR2 = (NILAITugas2 * 0.3) + (NILAIUTS2 * 0.3) + (NILAIUAS2 * 0.4);

         if (NILAIAKHIR >= 80) {
            NILAIHURUF = "A";
            STATUS = "LULUS";
        } else if (NILAIAKHIR >= 70) {
            NILAIHURUF = "B";
            STATUS = "LULUS";
        } else if (NILAIAKHIR >= 60) {
            NILAIHURUF = "C";
            STATUS = "LULUS";
        } else if (NILAIAKHIR >= 50) {
            NILAIHURUF = "D";
            STATUS = "TIDAK LULUS";
        } else {
            NILAIHURUF = "E";
            STATUS = "TIDAK LULUS";
        }

        
        if (NILAIAKHIR2 >= 80) {
            NILAIHURUF2 = "A";
            STATUS2 = "LULUS";
        } else if (NILAIAKHIR2 >= 70) {
            NILAIHURUF2 = "B";
            STATUS2 = "LULUS";
        } else if (NILAIAKHIR2 >= 60) {
            NILAIHURUF2 = "C";
            STATUS2 = "LULUS";
        } else if (NILAIAKHIR2 >= 50) {
            NILAIHURUF2 = "D";
            STATUS2 = "TIDAK LULUS";
        } else {
            NILAIHURUF2 = "E";
            STATUS2 = "TIDAK LULUS";
        }

        
        System.out.println("Mata Kuliah\t\t\t\tUTS\tUAS\tTUGAS\tNILAI AKHIR\tNILAI HURUF\tStatus");
        System.out.println("----------------------------------------");
        
        System.out.println("Algoritma Pemrograman\t" + NILAIUTS + "\t" + NILAIUAS + "\t" + NILAITUGAS + "\t" + NILAIAKHIR + "\t" + NILAIHURUF + "\t" + STATUS);
        System.out.println("Basis Data\t\t\t" + NILAIUTS2 + "\t" + NILAIUAS2 + "\t" + NILAITugas2 + "\t" + NILAIAKHIR2 + "\t" + NILAIHURUF2 + "\t" + STATUS2);
    }
}



    
             


      
        