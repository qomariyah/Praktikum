public class CetakSiswa1 {
	
	public static void main(String[] args) {
		siswa data = new Siswa();
		data.infoSiswa();

		data.no_absen = 1;
		System.out.println(data.no_absen);

		data.setNIS("161530018");
		System.out.println(data.nis);

		data.setNama("Qomariyah");
		System.out.println(data.nama_siswa);

		data.setTtl("Pekalongan", "22-11-1998");
		System.out.println(data.tmp_lahir + ", " + data.tgl_lahir);

		data.setNilai(75.5, 80.75);
		System.out.println(data.nilai_ipa + ", " + data.nilai_ips);
	}

}