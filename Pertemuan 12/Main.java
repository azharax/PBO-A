public class Main {
    public static void main(String[] args) {
        // Membuat objek tiket untuk masing-masing kelas
        Ticket economyTicket = new EconomyTicket("Agus", 1000000);
        Ticket businessTicket = new BusinessTicket("Bagus", 1000000);
        Ticket firstClassTicket = new FirstClassTicket("Azhar", 1000000);

        // Menampilkan informasi tiket
        System.out.println("=== Sistem Reservasi Tiket Pesawat ===\n");
        economyTicket.displayInfo();
        System.out.println();
        businessTicket.displayInfo();
        System.out.println();
        firstClassTicket.displayInfo();
    }
}
