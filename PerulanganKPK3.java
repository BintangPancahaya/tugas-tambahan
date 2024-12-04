import java.util.Scanner;

public class PerulanganKPK3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, kpk;

        System.out.print("Masukkan bilangan pertama: ");
        a = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        b = sc.nextInt();

        kpk = (a*b)/ fpb(a,b);
        System.out.println("KPK dari "+a+ " dan "+b+" adalah " + kpk);
        sc.close();
    }
    public static int fpb(int x, int y) {
        int temp;

        while (y != 0) {
            temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
