public class Main {
    public static void main(String[] args) {
        System.out.println("=== Method Overloading (Bank biasa) ===");
        Bank bank = new Bank();
        bank.transferUang(100000, "1234567890");
        bank.transferUang(200000, "1234567890", "Mandiri");
        bank.transferUang(300000, "1234567890", "Mandiri", "Bayar kos bulan ini");
        bank.sukuBunga();
        System.out.println("Biaya transfer: Rp" + bank.biayaTransfer());

        System.out.println("\n=== Method Overriding (BankBNI) ===");
        BankBNI bni = new BankBNI();
        bni.transferUang(500000, "9876543210", "ignored");
        bni.sukuBunga();
        System.out.println("Biaya transfer BNI: Rp" + bni.biayaTransfer());

        System.out.println("\n=== Method Overriding (BankBCA) ===");
        BankBCA bca = new BankBCA();
        bca.transferUang(750000, "1122334455", "ignored");
        bca.sukuBunga();
        System.out.println("Biaya transfer BCA: Rp" + bca.biayaTransfer());

        System.out.println("\n=== Polimorfisme (Bank reference) ===");
        Bank[] daftarBank = { new Bank(), new BankBNI(), new BankBCA() };
        for (Bank b : daftarBank) {
            b.sukuBunga();
            System.out.println("Biaya transfer: Rp" + b.biayaTransfer());
        }

    }
    
}
