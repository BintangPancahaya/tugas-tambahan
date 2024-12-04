public class ArrayChar4 {
    public static void main(String[] args) {

        char bilangan[] = new char[15];
        int p = 0;
        bilangan[p] = 'A';
        
        for (int i=0;i<5;i++) {
            for (int j=4;j>i;j--) { 
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++) {
                bilangan[k] = bilangan[p];
                System.out.print(bilangan[k]);
                bilangan[p]++;
            }
            System.out.println();
        }
    }
}