package pekan5_2411532015;

public class TugasPekan5_2411532015 {


		public static void main(String[] args) {
			 // Garis atas
	        System.out.print("#");
	        for (int i = 1; i <= 16; i++) {
	            System.out.print("=");
	        }
	        System.out.println("#");

	        // Bagian atas
	        for (int j = 0; j < 4; j++) { 
	            System.out.print("|"); // Cetak tepi kiri
	            int spasiKiri = 6 - j * 2; // Cetak spasi kiri
	            for (int k = 1; k <= spasiKiri; k++) {
	                System.out.print(" ");
	            }
	            System.out.print("<>"); // Cetak<> kiri
	            int jumlahTitik = j * 4; // Cetak titik
	            for (int l = 1; l <= jumlahTitik; l++) {
	                System.out.print(".");
	            }
	            System.out.print("<>"); // Cetak <> kanan
	            for (int m = 1; m <= spasiKiri; m++) {
	                System.out.print(" ");
	            }
	            System.out.println("|"); // Cetak tepi kanan
	        }

	        // Bagian bawah
	        for (int n = 3; n >= 0; n--) { 
	            System.out.print("|"); // Cetak tepi kiri
	            int spasiKiri = (3 - n) * 2; // Cetak spasi kiri
	            for (int o = 1; o <= spasiKiri; o++) {
	                System.out.print(" ");
	            }
	            System.out.print("<>"); // Cetak <> kiri
	            int jumlahTitik = n * 4; // Cetak titik
	            for (int p = 1; p <= jumlahTitik; p++) {
	                System.out.print(".");
	            }
	            System.out.print("<>"); // Cetak <> kanan
	            for (int q = 1; q <= spasiKiri; q++) {
	                System.out.print(" ");
	            }
	            System.out.println("|"); // Cetak tepi kanan
	        }

	        // Garis bawah
	        System.out.print("#");
	        for (int r = 1; r <= 16; r++) {
	            System.out.print("=");
	        }
	        System.out.println("#");
	    }
	}