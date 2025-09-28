package pekan3;
import java.util.Scanner;

public class HitungVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan jari-jari tabung: ");
        float r = input.nextFloat();
        System.out.print("Masukkan tinggi tabung: ");
        float t = input.nextFloat();

        input.close();

        //Hitung volume tabung
        float volume = 3.14f * r * r * t;

        // Output
        System.out.println("Volume tabung = " + volume);
    }
}

