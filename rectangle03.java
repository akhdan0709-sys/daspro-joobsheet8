import java.util.Scanner;
public class rectangle03 {
    public static void main(String[] args) {
    Scanner Sc = new Scanner (System.in);
    System.out.print("Masukan Jumlah Baris: ");
    int baris = Sc.nextInt();
    System.out.print("Masukan Jumlah Kolom: ");
    int kolom = Sc.nextInt();

    for (int i = 1; i <= baris; i++){
        for (int j = 1; j <= kolom; j++){
        System.out.print("#");

        }
            System.out.println();
    }
    Sc.close();
    }
}
