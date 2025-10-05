package pekan4;
import java.util.Scanner;
public class TugasAlproPekan4_2411532015 {
		public static void main(String[] args) {
			Scanner a=new Scanner(System.in);
			System.out.println("Masukkan nama pembeli: ");
			String pembeli = a.nextLine();
			System.out.println("Masukkan jumlah tiket: ");
			int tiket = a.nextInt();
			System.out.println("Masukkan kode hari(1-3): ");
			int hari = a.nextInt();
			System.out.println("Masukkan kode waktu(1-3): ");
			int waktu = a.nextInt();
			System.out.println("Masukkan Jenis studio(1-3): ");
			int studio = a.nextInt();
			System.out.println();
			System.out.println("====PEMBELIAN TIKET BIOSKOP====");
			System.out.println("Nama Pembeli : "+pembeli);
			System.out.println("Jumlah tiket : "+tiket);

			System.out.print("Hari         : ");
			switch(hari) {
			case 1:
				System.out.println("Senin-Kamis");
				break;
			case 2:
				System.out.println("Jumat");
				break;
			case 3:
				System.out.println("Sabtu-Minggu");
				break;  
			default:
				System.out.println("input tidak valid");
		}
			System.out.print("Waktu Tayang : ");

			switch(waktu) {
			case 1:
				System.out.println("Pagi");
				break;
			case 2:
				System.out.println("Siang");
				break;
			case 3:
				System.out.println("Malam");
				break;  
			default:
				System.out.println("input tidak valid");
			
			}
			int hargaDasar = 0;
			System.out.print("Jenis studio : ");

			switch(studio) {
			case 1:
				hargaDasar = 40000;
				System.out.println("Regular");
				break;
			case 2:
				hargaDasar = 50000;
				System.out.println("Deluxe");
				break;
			case 3:
				hargaDasar = 70000;
				System.out.println("Premium");
				break;  
			default:
				System.out.println("input tidak valid");
			
			}
			int persenHari = 0;
			int persenWaktu = 0;
			
	        if (hari == 2) {
	            persenHari = 10;
	        } else if (hari == 3) { 
	        	persenHari = 30;
	        }

	      
	       
	        if (waktu == 2) { 
	        	persenWaktu = 10;
	        } else if (waktu == 3) { 
	        	persenWaktu = 20;
	        }
	        
	        double biayaHari = (persenHari / 100.0) * hargaDasar;
	        double biayaWaktu = (persenWaktu / 100.0) * hargaDasar;

	        // Harga per tiket
	        double hargaTiket = hargaDasar + biayaHari + biayaWaktu;
	        
	        int subtotal = tiket * (int)hargaTiket;
	        int diskon = 0;
	        if (tiket >= 5) {
	            diskon = subtotal * 20 / 100; 
	        } else {
	            diskon = 0; 
	        }
	        int totalBayar = subtotal - diskon;
	        
	        
	        System.out.println("-----------------------");
	        System.out.println("Harga Dasar     : Rp " + hargaDasar + "/tiket");
	        System.out.println("Biaya Hari      : + " +persenHari +"%");
	        System.out.println("Biaya Waktu     : + " +persenWaktu +"%");
	        System.out.println("Harga per Tiket : Rp " + (int)hargaTiket);
	        System.out.println("Subtotal        : Rp " + subtotal);
	        if (diskon > 0) {
	            System.out.println("Diskon (20%)    : Rp " + diskon);
	        } else {
	            System.out.println("Diskon          : Rp 0");
	        }
	        System.out.println("-----------------------");
	        System.out.println("TOTAL BAYAR     : Rp " + totalBayar);

	        a.close();
	    
		}
}
