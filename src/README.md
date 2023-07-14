Nama Class: Orang
State (variabel):
- tahunUmur (variabel private)
Behavior (metode/fungsi):
- hitungUmur (metode tanpa parameter)
Jenis behavior: Fungsi (method)
Penjelasan:
State (variabel):
tahunUmur adalah variabel private bertipe int dengan nilai tetap 32.
Behavior (metode/fungsi):
hitungUmur adalah sebuah metode yang tidak mengambil parameter. Pada metode ini, terdapat perhitungan umur dalam hari dan detik berdasarkan tahunUmur. Hasil perhitungan kemudian dicetak ke layar menggunakan System.out.println.
Class ini memiliki dua metode yang digunakan dalam main.java, yaitu:
objOrang.hitungUmur(): Memanggil metode hitungUmur pada objek objOrang.
o.hitungUmur(): Memanggil metode hitungUmur pada objek o.
Metode hitungUmur adalah sebuah fungsi karena mengembalikan nilai (void) dan melakukan operasi perhitungan.
Dari pengujian program di atas, terdapat dua objek yang terbentuk:
Objek o dari kelas Orang, yang dibuat dengan pernyataan Orang o = new Orang();.
Objek objOrang dari kelas Orang, yang dibuat dengan pernyataan Orang objOrang = new Orang();.

Untuk membuat objek dari suatu kelas, Anda perlu mengikuti langkah-langkah berikut:
- Tentukan kelas yang ingin Anda gunakan untuk membuat objek. Kelas tersebut harus sudah didefinisikan sebelumnya, entah itu di dalam file yang sama atau di file terpisah yang diimpor ke dalam program Anda.
- Gunakan sintaks berikut untuk membuat objek baru dari kelas tersebut:
  NamaKelas namaObjek = new NamaKelas();
- Setelah objek dibuat, Anda dapat mengakses variabel dan metode dalam kelas tersebut dengan menggunakan nama objek yang telah Anda berikan:
  namaObjek.namaVariabel; //variabel dalam kelas yang ingin Anda akses.
  namaObjek.namaMetode(); //metode dalam kelas yang ingin Anda panggil.

Output :
umur anda adalah: 11680hari
umur anda adalah: 1009152000detik
umur anda adalah: 11680hari
umur anda adalah: 1009152000detik

===================================

Class bujurSangkar:
State (variabel):
- Tidak ada variabel yang terdefinisi di dalam class bujurSangkar.
Behavior (metode/fungsi):
- hitungLuas(int sisi): Metode ini mengambil parameter sisi yang merupakan panjang sisi bujur sangkar. Metode ini menghitung dan mengembalikan luas bujur sangkar dengan mengalikan sisi dengan sisi.
- hitungKeliling(int sisi): Metode ini mengambil parameter sisi yang merupakan panjang sisi bujur sangkar. Metode ini menghitung dan mengembalikan keliling bujur sangkar dengan mengalikan 4 dengan sisi.
Jenis behavior: Fungsi (method)

Class Persegi:
State (variabel):
- Tidak ada variabel yang terdefinisi di dalam class Persegi.
Behavior (metode/fungsi):
- hitungLuas(int panjang, int lebar): Metode ini mengambil dua parameter, yaitu panjang dan lebar. Metode ini menghitung dan mengembalikan luas persegi dengan mengalikan panjang dengan lebar.
- hitungKeliling(int panjang, int lebar): Metode ini mengambil dua parameter, yaitu panjang dan lebar. Metode ini menghitung dan mengembalikan keliling persegi dengan mengalikan 2 dengan jumlah panjang dan lebar.
Jenis behavior: Fungsi (method)
Penjelasan:
Kedua class, bujurSangkar dan Persegi, memiliki metode yang masing-masing menghitung luas dan keliling dari bangun datar yang sesuai dengan nama classnya.
Metode-metode tersebut adalah fungsi karena mereka mengembalikan nilai hasil perhitungan (luas atau keliling) dan melakukan operasi perhitungan sesuai dengan rumus yang diberikan.

Dari pengujian program di atas, terbentuk dua objek, yaitu:
Objek bujur dari kelas bujurSangkar.
Objek persegipanjang dari kelas Persegi.
Kedua objek ini digunakan untuk menghitung luas dan keliling dari dua bentuk geometri yang berbeda, yaitu bujur sangkar dan persegi panjang.

Gunakan sintaks NamaKelas namaObjek = new NamaKelas(); untuk membuat objek baru. 
bujurSangkar bujur = new bujurSangkar();
Persegi persegipanjang = new Persegi();

Output:
luas bujurSangkar16
keliling bujur sangkar20
Luas persegi24
Keliling persegi20

==============================

Output:
Keliling=12.56
Luas =28.259999999999998

Class finalWord:
State (variabel):
- phi: Sebuah konstanta bertipe double yang bernilai 3.14. Ini adalah sebuah variabel state yang menyimpan nilai tetap dan tidak dapat diubah.
Behavior (metode/fungsi):
- kelilingLingkaran(double jari): Sebuah method yang menerima parameter jari (jari-jari lingkaran) bertipe double dan mengembalikan keliling lingkaran dengan menggunakan rumus 2 * phi * jari.
- luasLingkaran(double jari): Sebuah method yang menerima parameter jari (jari-jari lingkaran) bertipe double dan mengembalikan luas lingkaran dengan menggunakan rumus phi * jari * jari.
Kedua method di atas termasuk dalam jenis behavior fungsi, karena keduanya mengembalikan nilai (keliling dan luas lingkaran) dan tidak hanya melakukan tindakan/prosedur tanpa menghasilkan nilai.

Terjadi error "cannot assign a value to final variable phi"

Fungsi specifier final pada Java adalah untuk menyatakan bahwa suatu variabel, metode, atau kelas tidak dapat diubah setelah nilai awalnya ditetapkan. Ketika suatu variabel dideklarasikan dengan kata kunci final, nilainya dianggap konstan dan tidak dapat diubah.
Pada kode yang Anda berikan, terdapat pernyataan finalWord objFinal = new finalWord(); yang membuat objek dari kelas finalWord. Kemudian Anda mencoba mengubah nilai variabel phi dengan pernyataan objFinal.phi=3.17;. Namun, karena variabel phi dideklarasikan sebagai final di dalam kelas finalWord, Anda tidak dapat mengubah nilainya setelahnya.
Untuk mengatasi kesalahan tersebut, Anda perlu menghapus pernyataan objFinal.phi=3.17; atau mempertimbangkan untuk menghapus kata kunci final pada deklarasi variabel phi di dalam kelas finalWord jika Anda ingin dapat mengubah nilainya.

