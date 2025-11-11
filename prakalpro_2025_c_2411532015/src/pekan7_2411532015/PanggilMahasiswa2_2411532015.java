package pekan7_2411532015;

import java.util.Scanner;

public class PanggilMahasiswa2_2411532015 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("NIM: ");
		String x = input.nextLine();
		System.out.println("Nama: ");
		String y = input.nextLine();
		Mahasiswa_2411532015 a = new Mahasiswa_2411532015();
		a.setNim2(x);
		a.setNama(y);
		if(x.startsWith("25")) {
			System.out.println(a.getNama() + " anda angkatan 2025");
		}
		if (a.getNim2().contains("1153")) {
			System.out.println("Anda Mahasiswa Informatika");
		}
		a.Cetak2();
		input.close();
	}
}
