import java.util.Scanner;
public class nilaikelompok03 {
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);

    System.out.print("Masukan Jumlah Kelompok: ");
    int kelompok = Sc.nextInt();
    System.out.print("MAssukan Jumlah Penilai: ");
    int penilai = Sc.nextInt();

    if (kelompok <= 0 || penilai <= 0){
        System.out.print("Jumlah Kelompok dan Penilai Harus > 0");
    } else {
        int nomorkelompok = 1;
        double rataTertinggi = -1;
        int kelompokTerbaik = 1;

        while (nomorkelompok <= kelompok) {
            System.out.print("Kelompok " + nomorkelompok + ":");
            int totalNilai = 0;
            for (int j = 1; j <= penilai; j++) {
                int nilai;
                do{
                    System.out.print("Nilai dari Penilai " + j + ":");
                    nilai = Sc.nextInt();
                    if (nilai < 0 || nilai > 100){
                        System.out.print("NIlai Harus 0-100,ULANGI INPUT!");
                    }
                } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
            }
                
                int rataNilai = totalNilai / 2;
                System.out.println("Kelompok " + nomorkelompok + " Nilai Rata Rata " + rataNilai);

                if (rataNilai > rataTertinggi){
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorkelompok;
                }
                 
            
                nomorkelompok++;
        }
        System.out.println("====================");
        System.out.println("Kelompok Terbaik: " + kelompokTerbaik);
        System.out.println("Rata Rata Tertinggi: " + rataTertinggi);
    }
    }
}
