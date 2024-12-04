import java.util.Scanner;
public class KonversiWaktu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int detik, jam, menit, sisaDetik;

        System.out.print("Masukkan waktu(detik): ");
        detik = sc.nextInt();
        
        jam = detik/3600;
        menit = (detik%3600) / 60;
        sisaDetik = detik % 60;
            
        String waktu = String.format("%02d:%02d:%02d", jam, menit, sisaDetik);

        System.out.println("Konversi detik "+detik+" = "+waktu);
        sc.close();
    }
}
