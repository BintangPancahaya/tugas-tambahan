import java.util.Scanner;

public class PerulanganPrima3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int bil;
        int pembagi = 0;

        System.out.print("Masukkan bilangan: ");
        bil = input.nextInt();
                
        for (int i = 1; i <= bil; i++) {
            if (bil % i == 0) {
                pembagi++;
            }
        }        
        if (pembagi == 2) {
            System.out.println(bil + " adalah bilangan prima");
        } else {
            System.out.println(bil + " bukan bilangan prima");
        }
        input.close();
    }
}