import java.util.Scanner;
public class triangle03 {
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);

    System.out.print("Masukan Nilai n = ");
    int n = Sc.nextInt();

    int i = n;
    while (i <= n) {
        int j = 0;
        while (j > i) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }
    Sc.close();
    }
}
