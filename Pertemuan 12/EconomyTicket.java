public class EconomyTicket extends Ticket {
    
    public EconomyTicket(String penumpang, double hargaDasar){
        super(penumpang, hargaDasar);
    }

    // Menghitung tarif dengan diskon 10%
    @Override
    public double calculateFare(){
        return hargaDasar * 0.9; // Diskon 10%
    }

    // Menampilkan informasi tiket Ekonomi
    @Override
    public void displayInfo(){
        System.out.println("=== Tiket Kelas Ekonomi ===");
        super.displayInfo();
        System.out.println("Diskon 10% telah diterapkan.");
    }
}