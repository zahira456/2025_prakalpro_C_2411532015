package pekan7_2411532015;

import java.util.Scanner;

public class tugasAlproPekan7_2411532015 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\n===== REGISTRASI AKUN BARU =====");
		System.out.print("Masukkan Username: ");
		String usn = input.nextLine();
		
		System.out.print("Masukkan Password: ");
		String pass = input.nextLine();
		
		System.out.print("Masukkan Email: ");
		String email = input.nextLine();
		
		System.out.print("Masukkan PIN(6 digit): ");
		int pin = input.nextInt();
		input.nextLine();
		
		Akun_2411532015 a = new Akun_2411532015();
		a.setUsername(usn);
		a.setPassword(pass);
		a.setEmail(email);
		a.setPinAngka(pin);
		
		
	
		if(!a.isEmailValid()) {
            System.out.println("\n--- REGISTRASI GAGAL ---");
            System.out.println("Email Anda \"" + a.getEmail() + "\" tidak valid (harus mengandung '@' dan '.').");
            System.out.println("Silakan coba lagi.");
            return;

		} if (!a.isPasswordValid()) {
            System.out.println("\n--- REGISTRASI GAGAL ---");
            System.out.println("Password minimal 8 karakter.");
            return;
        } 
		System.out.println("\n--- REGISTRASI BERHASIL ---");
        System.out.println("Akun untuk \"" + a.getUsername() + "\" telah berhasil dibuat.\n");

        System.out.println("--- Detail Akun ---");
        System.out.println("Username (Lowercase)\t: " + a.getUsername().toLowerCase());
        System.out.println("Email (Uppercase)\t: " + a.getEmail().toUpperCase());
        
        
        String idGabungan = a.getUsername().concat(String.valueOf(a.getPinAngka()));
        System.out.println("ID Pengguna (Gabungan)\t: " + idGabungan);
        
        
        System.out.println("\n--- Uji Tipe Data (PIN Anda: " + a.getPinAngka() + ") ---");

        int pinIntResult = a.getPinAngka() + 10;
        String pinStringResult = String.valueOf(a.getPinAngka()) + "10";

        System.out.println("PIN (int) + 10\t= " + pinIntResult);
        System.out.println("PIN (String) + \"10\" = " + pinStringResult);

        input.close();
        
        }

      
    
}