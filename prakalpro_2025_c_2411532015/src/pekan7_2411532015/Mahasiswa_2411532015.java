package pekan7_2411532015;

public class Mahasiswa_2411532015 {
	private int nim;
	private String nama, nim2;
	
	public void setNim(int nim) {
		this.nim = nim;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setNim2(String nim2) {
		this.nim2 = nim2;
	}
	public int getNim() {
		return nim;
	}
	public String getNama() {
		return nama;
	}
	public String getNim2() {
		return nim2;
	}
	public void Cetak() {
		System.out.println("Nim : "+nim);
		System.out.println("Nama : "+nama);
	}
	public void Cetak2() {
		System.out.println("Nim : "+nim2);
		System.out.println("Nama : "+nama);
		
	}
	
	

}