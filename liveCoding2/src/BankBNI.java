public class BankBNI extends Bank{
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga BNI adalah 4%");
    }
    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp" + " ke rekening " + rekeningTujuan + " di bank BNI ");
    }
    @Override
    public int biayaTransfer() {
        return 2500;
    }
    
}
