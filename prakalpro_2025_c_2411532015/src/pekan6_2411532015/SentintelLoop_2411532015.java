package pekan6_2411532015;

import java.util.Scanner;

public class SentintelLoop_2411532015 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int sum = 0;
		int number=1;
		
		while (number != 0) {
			System.out.print("Masukkan angka (0 untuk keluar): ");
			number = console.nextInt();
			sum = sum + number;
		}
		System.out.println("totalnya adalah " + sum);
		console.close();
	}

}
