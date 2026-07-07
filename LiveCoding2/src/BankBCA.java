public class BankBCA extends Bank{
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga adalah 4.5%");
    }
    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp" + jumlah + "ke rekening" + rekeningTujuan + "di bank BCA");
    }
    @Override
    public int biayaTransfer() {
        return 3000;
    }
    
}
