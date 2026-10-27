import java.util.Scanner;
public class star03{
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    
    System.out.print("Masukan Nilai n = ");
    int n = Sc.nextInt();

    for (int i = 2; i <= n; i+=2){
        System.out.print("*");
    }
    System.out.println();
    Sc.close();
    }
}