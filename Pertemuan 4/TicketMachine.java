public class MesinTiket {
    // Atribut untuk harga tiket, saldo pengguna, dan total yang dibayar
    private double harga;
    private double saldo;
    private double total;

    // Constructor untuk inisialisasi mesin tiket
    public MesinTiket(double harga, double saldo){
        this.harga = harga;
        this.saldo = saldo;
        this.total = 0.0;}

    public double getHarga(){   // Method untuk mendapatkan harga tiket
        return harga;}

    public double getSaldo(){   // Method untuk mendapatkan saldo pengguna
        return saldo;}

    public double getTotal(){   // Method untuk mendapatkan total yang dibayar
        return total;}

    public void bayarTiket(){   // Method untuk membayar tiket
        if (saldo >= harga){
            saldo -= harga;
            total += harga;
            System.out.println("Pembayaran berhasil. Saldo tersisa: " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi, perlu saldo sebanyak: " + (harga - saldo));
        }
    }

    public void tambahSaldo(double jumlah){ // Method untuk menambahkan saldo
        saldo += jumlah;
        System.out.println("Saldo berhasil ditambahkan. Saldo saat ini: " + saldo);
    }

    // Method utama untuk menjalankan program
    public static void main(String[] args){
        // Membuat objek MesinTiket dengan harga tiket 50 dan saldo awal 100
        MesinTiket mesin = new MesinTiket(50, 100);

        // Menampilkan harga tiket, saldo awal, dan total yang dibayar
        System.out.println("Harga tiket: " + mesin.getHarga());
        System.out.println("Saldo awal: " + mesin.getSaldo());
        System.out.println("Total yang dibayar: " + mesin.getTotal());

        // Mencoba membayar tiket
        mesin.bayarTiket();

        // Menampilkan saldo setelah pembayaran
        System.out.println("Saldo setelah pembayaran: " + mesin.getSaldo());
        System.out.println("Total yang dibayar setelah pembayaran: " + mesin.getTotal());

        mesin.tambahSaldo(30);   // Mencoba menambahkan saldo
        mesin.bayarTiket();      // Mencoba membayar tiket lagi setelah menambahkan saldo

        // Menampilkan saldo akhir dan total yang dibayar
        System.out.println("Saldo akhir: " + mesin.getSaldo());
        System.out.println("Total yang dibayar akhir: " + mesin.getTotal());
    }
}
```