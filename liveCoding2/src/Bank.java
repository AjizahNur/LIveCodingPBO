public class Bank {
    String namaBank = "Bank Umum";

    public void transferUang(int jumlah, String rekeninTujuan) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeninTujuan);
    }
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan + " di bang " + bankTujuan);
    }
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan + "  di bank " + bankTujuan + " dengan berita: \"" + berita + "\"");
    }
    public void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }
    public int biayaTransfer() {
        return 0;
    }
}