public class CetakSiswa2 {

	public static void main(String[] args) {
		siswa data = new Siswa(); //deklarasi object class siswa dengan nama objectnya data
		data.infoSiswa(); // memanggil method infoSiswa() pada class siswa

		data.no_absen = 1; //variabel no absen object class siswa diberi nilai 1
		System.out.println("No. Absen\t\t: " + data.no_absen);

		data.setNIS("161530018"); //pemanggilan nama method object class siswa dengan nilai parameternya 161530018
		System.out.println("NIS\t\t: " + data.nis);

		data.setNama("Qomariyah");
		System.out.println("Nama Siswa\t\t: " + data.nama_siswa);

		data.setTtl("Pekalongan", "22-11-1998");
		System.out.println("Tempat, tanggal lahir\t: " + data.tmp_lahir + ", " + data.tgl_lahir);

		//pemanggilan nama method object class siswa dengan nilai parameter nilai ipa=75.5 dan nilai ips=80.75
		data.setNilai(75.5, 80.75);
		System.out.println("Nilai IPA\t\t: " + data.nilai_ipa);
		System.out.println("Nilai IPS\t\t: " + data.nilai_ips);
	}
	
}