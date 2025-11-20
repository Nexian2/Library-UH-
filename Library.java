import java.util.Scanner;
import java.util.Arrays;

public class Library {
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);  
        System.out.println("=======================================================");                                                                                          
        System.out.println(" _     _ _                          \r\n" + //
                        "| |   (_) |                         \r\n" + //
                        "| |    _| |__  _ __ __ _ _ __ _   _ \r\n" + //
                        "| |   | | '_ \\| '__/ _` | '__| | | |\r\n" + //
                        "| |___| | |_) | | | (_| | |  | |_| |\r\n" + //
                        "\\_____/_|_.__/|_|  \\__,_|_|   \\__, |\r\n" + //
                        "                               __/ |\r\n" + //
                        "                              |___/ \r\n" + //
                        "           Created By Lutpi");
                        System.out.println("=======================================================");
                        System.out.println();
        String[] book = {"Avatar", "Sherlock Holmes", "Harry Potter", "Avenger", "Detective Conan", "Haikyuu", "Tutorial Hengking pemula"};
        System.out.println("==========================");
        System.out.println("    1.Daftar Buku");
        System.out.println("    2.Pinjam Buku");
        System.out.println("    3.Kembalikan Buku");
        System.out.println("    4.Keluar");
        System.out.println("==========================");
        System.out.print("Pilih Dari Kempat Daftar ini!: ");
        int pilih = input.nextInt();
        
    if (pilih == 1){
        System.out.println("");
        System.out.println("");
        System.out.println("=========================================");
        System.out.println();
        System.out.println("       DAFTAR BUKU YANG TERSEDIA        ");
        System.out.println();
        System.out.println("       1.Avatar");
        System.out.println("       2.Sherlock Holmes");
        System.out.println("       3.Harry Potter");
        System.out.println("       4.Avenger");
        System.out.println("       5.Detective Conan");
        System.out.println("       6.Haikyuu");
        System.out.println("       7.Tutorial Hengking Pemula");
        System.out.println();
        System.out.println("=========================================");
        System.out.println("");
        System.out.println("==========================");
        System.out.println("    1.Daftar Buku");
        System.out.println("    2.Pinjam Buku");
        System.out.println("    3.Kembalikan Buku");
        System.out.println("    4.Keluar");
        System.out.println("==========================");
        System.out.print("Pilih Dari Keempat Daftar Ini: ");
        int bukuh = input.nextInt();

    if (bukuh == 2){
            System.out.println("=========================================");
        System.out.println("       DAFTAR BUKU YANG TERSEDIA        ");
        System.out.println();
        System.out.println("       1.Avatar");
        System.out.println("       2.Sherlock Holmes");
        System.out.println("       3.Harry Potter");
        System.out.println("       4.Avenger");
        System.out.println("       5.Detective Conan");
        System.out.println("       6.Haikyuu");
        System.out.println("       7.Tutorial Hengking Pemula");
        System.out.println("=========================================");
            System.out.print("Silahkan Pilih Buku yang ingin dibaca: ");
        int pilihan = input.nextInt(); 
        switch (pilihan) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("Kamu memilih buku: " + book[pilihan - 1]);
                System.out.println("Kamu Sudah Memilih buku...");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                break;
            }
            
            System.out.println();
        System.out.println("==========================");
        System.out.println("    1. Daftar Buku");
        System.out.println("    2. Pinjam Buku");
        System.out.println("    3. Kembalikan Buku");
        System.out.println("    4. Keluar");
        System.out.println("==========================");
        System.out.print("Pilih Dari Keempat Daftar Ini: ");
        int buku = input.nextInt();
        input.nextLine(); 
        if (buku == 1) {
        } else if (buku == 2) {
        } else if (buku == 3) {
            System.out.println("\n=== Kembalikan Buku ===");
            System.out.print("Masukkan nama buku yang ingin dikembalikan: ");
            String namaBuku = input.nextLine();

            System.out.print("Masukkan nama peminjam: ");
            String namaPeminjam = input.nextLine();

            System.out.println("\nBuku \"" + namaBuku + "\" berhasil dikembalikan oleh " + namaPeminjam + "!");
        
        } else if (pilih == 4) {
            System.out.println("Keluar…");
        } else {
            System.out.println("Pilihan ga valid bro.");
        }
    }
    }
    }
}  