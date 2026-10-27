import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko harus minimal 1.");
        } else {
            int totalSemua = 0;          
            int barangTerbanyak = -1;    
            int tokoTerbanyak = 0;

            for (int toko = 1; toko <= jumlahToko; toko++) {       
                System.out.println("Toko " + toko);

                int jumlahPelanggan;
                do {                                               
                    System.out.print("  Jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;                           // reset untuk setiap toko

                for (int p = 1; p <= jumlahPelanggan; p++) {       // loop dalam: pelanggan
                    int barang;
                    do {                                           // validasi: tidak boleh negatif
                        System.out.print("    Jumlah barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("    Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko);

                totalSemua += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {           // > (bukan >=) agar nomor toko terkecil dipilih
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }

            System.out.println("==============================");
            System.out.println("Total barang seluruh toko: " + totalSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}

