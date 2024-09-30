import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Mengambil waktu sekarang dari perangkat
        LocalTime waktuSekarang = LocalTime.now();
        int jam = waktuSekarang.getHour();
        int menit = waktuSekarang.getMinute();

        // Membuat objek ClockDisplay dengan waktu sekarang
        ClockDisplay clock = new ClockDisplay(jam, menit);

        // Menampilkan waktu awal yang diambil dari perangkat
        System.out.println("Waktu awal dari perangkat: " + clock.ambilWaktu());

        // Loop tak hingga untuk menambah waktu tiap menit
        while (true) {
            // Tambahkan satu menit
            clock.detikWaktu();

            // Tampilkan waktu yang diperbarui
            System.out.println("Waktu sekarang: " + clock.ambilWaktu());

            // Tunggu selama satu menit (60.000 milidetik)
            try {
                Thread.sleep(60000);  // 1 menit
            } catch (InterruptedException e) {
                System.out.println("Proses dihentikan.");
                break;  // Menghentikan loop jika terjadi interrupt
            }
        }
    }
}
