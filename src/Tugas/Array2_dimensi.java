package Tugas;
import java.util.Scanner;

public class Array2_dimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n;
        float jumlah, x, rata;
        System.out.println("Banyaknya data");
        n = input.nextInt();
        jumlah = 0;
        i = 1;
        while (i<=n){
            System.out.println("Data ke : "+i+ ": ");
            x = input.nextFloat();
            jumlah += x;
            i++;
        }
        rata = jumlah/n;
        System.out.println("Rata-rata :" +rata);
        System.out.println("Jumlah :" +jumlah);
    }
}
