import java.util.Scanner;

public class UKL2A {
   public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        System.out.print("Mmasukan bilanagan positif(n): ");
        int n = j.nextInt();
        if (n < 0) {
            System.out.println("Error masukan bilangan positif");
            j.close();
            return;
        }
        long hasilFaktorial = 1; 
      
        if (n == 0) {
            hasilFaktorial = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                hasilFaktorial = hasilFaktorial * i;
            }
        }
        System.out.print("\nHasil dari " + n + "! (Faktorial) adalah: ");
        System.out.println(hasilFaktorial);
        
        j.close();
}
}
