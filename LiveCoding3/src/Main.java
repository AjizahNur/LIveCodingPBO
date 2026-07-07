import laptop.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih merk laptop:");
        System.out.println("1. Lenovo");
        System.out.println("2. Toshiba");
        System.out.println("3. MacBook");
        System.out.println("Pilihan (1/2/3): ");
        String pilihan = scanner.nextLine();

        Laptop laptop;
        switch (pilihan) {
            case "2":
                laptop = new Toshiba();
                break;
            case "3":
                laptop = new MacBook();
                break;
            default:
                laptop = new Lenovo();
                break;
        }
        LaptopUser user = new LaptopUser(laptop);

        System.out.println("\nMasukkan perintah (ON/UP/DOWN/EXIT):");
        String input;
        do {
            System.out.println("> ");
            input = scanner.nextLine().trim().toUpperCase();

            switch (input) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilence();
                    break;
                case "EXIT":
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Perintah tidak dikenali!");
                    break;
            }
        } while (!input.equals("EXIT")); 
         
        scanner.close();
    }
    
}
