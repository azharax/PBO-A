// Main class
public class Main {
    public static void main(String[] args) {
        // Membuat objek TicketMachine dengan harga tiket 15
        TicketMachine mesinTiket = new TicketMachine(15);

        // Memasukkan uang ke mesin
        mesinTiket.insertMoney(20);
        
        // Mencoba membeli tiket
        mesinTiket.dispenseTicket();
        
        // Menampilkan saldo saat ini
        System.out.println("Saldo tersisa: " + mesinTiket.getCurrentBalance());

        // Menampilkan status mesin
        mesinTiket.showMachineStatus();
        
        // Mengembalikan sisa saldo
        mesinTiket.refundBalance();
    }
}
