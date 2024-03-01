import java.util.Scanner;

public class Main {

    static String[][] users = {{"admin", "adminPassword"}, {"1234567890"}};

    // Fungsi untuk login user mahasiswa
    public static void mahasiswaLogin() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM Anda: ");
        String nim = input.next();
        if (nim.length() == 15) {
            System.out.println("Login berhasil untuk mahasiswa dengan NIM " + nim);
        } else {
            System.out.println("Panjang NIM harus 15 karakter. Silakan coba lagi.");
        }
    }

    // Fungsi untuk login user admin
    public static void adminLogin() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = input.next();
        System.out.print("Masukkan password: ");
        String password = input.next();
        if (username.equals(users[0][0]) && password.equals(users[0][1])) {
            System.out.println("Login berhasil sebagai admin");
        } else {
            System.out.println("Username atau password salah. Silakan coba lagi.");
        }
    }

    // Main program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.println(" ==== Library ====");
            System.out.println("1. Login as student");
            System.out.println("2. Login as admin");
            System.out.println("3. Exit");
            System.out.print("Pilihan: ");
            choice = input.next();

            switch (choice) {
                case "1":
                    mahasiswaLogin();
                    break;
                case "2":
                    adminLogin();
                    break;
                case "3":
                    System.out.println("Terima kasih. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (!choice.equals("3"));
    }
}