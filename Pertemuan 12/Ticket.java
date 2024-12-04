public class Ticket {
    protected String penumpang;
    protected double hargaDasar;

    public Ticket(String penumpang, double hargaDasar){
        this.penumpang = penumpang;
        this.hargaDasar = hargaDasar;
    }

    // Metode untuk menghitung tarif, akan dioverride di subclass
    public double calculateFare(){
        return hargaDasar;
    }

    // Menampilkan informasi tiket
    public void displayInfo(){
        System.out.println("Penumpang: " + penumpang);
        System.out.println("Harga Dasar: Rp " + hargaDasar);
        System.out.println("Tarif Akhir: Rp " + calculateFare());
    }
}
