public class FirstClassTicket extends Ticket {
    
    public FirstClassTicket(String penumpang, double hargaDasar){
        super(penumpang, hargaDasar);
    }

    // Menghitung tarif dengan biaya tambahan 50%
    @Override
    public double calculateFare(){
        return hargaDasar * 1.5; // Tambahan 50%
    }

    // Menampilkan informasi tiket First Class
    @Override
    public void displayInfo(){
        System.out.println("=== Tiket First Class ===");
        super.displayInfo();
        System.out.println("Biaya tambahan 50% telah diterapkan.");
    }
}