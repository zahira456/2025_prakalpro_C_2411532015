package pekan5_2411532015;

public class PerulanganFor3_2411532015 {

	public static void main(String[] args) {
		int jumlah = 0;
		for (int i=1; i<=10; i++) {
			System.out.print(i);
			if (i<10) {
				System.out.print(" + ");
			}
			jumlah+=i;
		}
		System.out.println();
		System.out.println("Jumlah = "+jumlah);
	}

}
