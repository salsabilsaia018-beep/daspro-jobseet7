import java.util.Scanner;

public class KafeDoWhile25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String nama_pelanggan;
        int total_harga, harga_kopi = 12000, harga_teh =7000, harga_roti=20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            nama_pelanggan = sc.nextLine();
            if (nama_pelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("jumlah kopi : ");
            kopi = sc.nextInt();
            System.out.print("jumlah teh : ");
            teh =  sc.nextInt();
            System.out.print("jumlah roti : ");
            roti = sc.nextInt();

            total_harga = (kopi * harga_kopi) + (teh * harga_teh) + ( roti * harga_roti);
            System.err.println("Total yang harus dibayar: Rp " + total_harga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}
