import java.util.Scanner;
public class KonversiSuhu1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celcius;
        double fahrenheit;

        System.out.print("Masukkan suhu(celcius): ");
        celcius = sc.nextInt();

        fahrenheit = (celcius * 9 / 5) + 32;
        System.out.print("Konversi suhu celcius ke Fahrenheit: "+fahrenheit+" F");
        sc.close();
    }
}