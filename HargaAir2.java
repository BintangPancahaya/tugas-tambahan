import java.util.Scanner;
public class HargaAir2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int air, hargaAir = 0;
        int harga[] = {1000, 1500, 2000, 3000};

        System.out.print("Masukkan jumlah air PAM yang digunakan(m kubik): ");
        air = sc.nextInt();

        for (int i=0; i<=i; i++) {
            if (i>3) {
                i--;
            }
            if (air >= 50) {
                hargaAir += 50 * harga[i];
                air -= 50;
            }
            else {
                hargaAir += air * harga[i];
                break;
            }
        }
        System.out.println("Harga yang harus dibayar: Rp."+hargaAir);
        sc.close();
    }
}
