package pekan6_2411532015;
import java.util.*;
public class TugasPekan6_2411532015 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        boolean menang = false; // Status kemenangan
        int tries = 0;

        do {
        	tries++;
           // Lempar dua dadu
  			int dadu1 = rand.nextInt(6) +1;
   			int dadu2 = rand.nextInt(6) +1;
   			int sum = dadu1 + dadu2;
		    			
  			System.out.println(dadu1 + " + " + dadu2 + " = " +sum);
		    			

           // Periksa apakah total adalah 7
           if (sum == 7) {
             System.out.println("Anda menang setelah " + tries + " percobaan!");
             menang = true; // Set status menang
		                
            } else {
            // Jika salah, beri opsi untuk melempar lagi
               System.out.print("Tebakan anda salah");
               System.out.println();
               System.out.print("Apakah mau lempar dadu (ya/tidak?): ");
               String pilihan = scanner.next();

             if (pilihan.equalsIgnoreCase("tidak")) {
                System.out.println("Anda gagal menang");
                break; // Keluar dari loop
             } else if (!pilihan.equalsIgnoreCase("ya")) {
                System.out.println("Input tidak valid. Harap masukkan 'ya' atau 'tidak'.");
		                } 
		            }
		        } while (!menang);

		        scanner.close();
		    }
		


	


}
