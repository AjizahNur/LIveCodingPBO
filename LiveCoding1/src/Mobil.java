public class Mobil {
    boolean statusMesin;
    int kecepatan;

    public Mobil() {
        statusMesin = false;
        kecepatan = 0;
    }
    public void nyalakan() {
        statusMesin = true;
        kecepatan = 0;
        System.out.println("Mesin menyala. Kecepatan: " + kecepatan + "km/jam");
    }
    public void matikan() {
        statusMesin = false;
        kecepatan = 0;
        System.out.println("Mesin mati. Kecepatan: " + kecepatan + "km/jam");
    }
    public void gas() {
        if (statusMesin) {
            kecepatan += 5;
            System.out.println("Gas ditambah. Kecepatan: " + kecepatan + "km/jam");
        } else {
            System.out.println("Mesin belum menyala, tidak bisa gas!");
        }
    }
    public void rem() {
        if (statusMesin) {
            kecepatan -= 5;
            if (kecepatan < 0) {
                kecepatan = 0;
            }
            System.out.println("Rem ditekan. Kecepatan: " + kecepatan + "km/jam");
        } else {
            System.out.println("Mesin belum meyala, tidak bisa rem!");
        }
    }
}