import java.util.Scanner;
public class ArrayRata5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai[][] = new int[3][5];
        double hasilTemp = 0;
        double hasil;
        double rata, rataMhs;

        for (int i=0; i<nilai.length; i++) {
            hasil = 0;
            System.out.println("====== Mahasiswa Ke-"+(i+1)+" ======");
            for (int j=0; j<nilai[i].length; j++) {
                System.out.print("Masukkan nilai ke-"+(j+1)+": ");
                nilai[i][j] = sc.nextInt();
                hasil += nilai[i][j];
            }
            hasilTemp += hasil;
            rataMhs = hasil/5;
            System.out.println("Rata - rata dari mahasiswa ke-"+(i+1)+": "+rataMhs);
        }
        
        rata = hasilTemp/15;
        System.out.print("Rata - rata dari semua nilai mahasiswa: "+rata);
        sc.close();
    }
}