import java.util.Scanner;
public class Ascending2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil[] = new int[3];
        int temp;

        for (int i=0; i<3; i++) {
            System.out.print("Masukkan bilangan ke-"+(i+1)+": ");
            bil[i] = input.nextInt();
        }
        if (bil[0] > bil[1]) {
            temp = bil[0];
            bil[0] = bil[1];
            bil[1] = temp;
        }
        if (bil[1] > bil[2]) {
            temp = bil[1];
            bil[1] = bil[2];
            bil[2] = temp;
        }
        if (bil[0] > bil[1]) {
            temp = bil[0];
            bil[0] = bil[1];
            bil[1] = temp;
        }
        System.out.println("Bilangan setelah diurutkan: " + bil[0] + ", " + bil[1] + ", " + bil[2]);
        input.close();
    }
}