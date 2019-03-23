public class AkademiBisnis{
	public static void main (String[] args){
		AkunBisnis data = new AkunBisnis();
		data.setnamaAkun ("Nina Nadia Syafitri Husein");
		data.settanggalLahir("16 01 1999");
		data.setalamat("Kp.serang, Desa Sumurkondang, Klari, Karawang, Jawa  Barat");
		data.setjenisKelamin("Perempuan ");
		data.setprofesi("Mahasiswa ");
		data.setnoHp("081537428450");
		data.setnoRek("1235689022");
		data.setlisensi("basic");
		data.setkodeRef("kode1234");
		data.setemail("ninanadiasyafitrihusein@gmail.com");
		
		String namaAkun = data.getnamaAkun();
		String tanggalLahir = data.gettanggalLahir();
		String alamat = data.getalamat();
		String jenisKelamin = data.getjenisKelamin();
		String profesi = data.getprofesi();
		String noHp = data.getnoHp();
		String noRek = data.getnoRek();
		String lisensi = data.getlisensi();
		String kodeRef = data.getkodeRef();
		String email = data.getemail();
		
		System.out.println("==========================================================================");
		System.out.println("Nama Akun		: " + namaAkun);
		System.out.println("Tanggal Lahir		: " + tanggalLahir);
		System.out.println("Alamat			: " + alamat);
		System.out.println("Jenis Kelamin		: " + jenisKelamin);
		System.out.println("Profesi			: " + profesi);
		System.out.println("No Handphone		: " + noHp);
		System.out.println("No Rekening		: " + noRek);
		System.out.println("Lisensi			: " + lisensi);
		System.out.println("Kode Referral		: " + kodeRef);
		System.out.println("Email			: " + email);
		System.out.println("=========================================================================");
	}
}
		
	