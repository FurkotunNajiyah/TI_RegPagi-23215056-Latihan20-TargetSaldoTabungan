import java.util.Scanner;

public class TargetSaldoTabungan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan saldo awal: Rp ");
        double saldoAwal = scanner.nextDouble();

        System.out.print("Masukkan bunga per bulan (%): ");
        double bungaBulanan = scanner.nextDouble();

        System.out.print("Masukkan target saldo tabungan: Rp ");
        double targetSaldo = scanner.nextDouble();

        // Inisialisasi variabel
        int lamaMenabung = 0;
        double saldoSaatIni = saldoAwal;

        System.out.println("\nRincian Saldo dan Bunga Per Bulan:");
        
        // Hitung lama menabung hingga mencapai target saldo
        while (saldoSaatIni < targetSaldo) {
            double bunga = saldoSaatIni * (bungaBulanan / 100);
            saldoSaatIni += bunga;
            lamaMenabung++;

            // Tampilkan saldo dan bunga per bulan
            System.out.printf("Bulan %d: Bunga = Rp %.2f, Saldo = Rp %.2f%n", lamaMenabung, bunga, saldoSaatIni);
        }

        // Tampilkan hasil akhir
        System.out.println("\nLama menabung untuk mencapai saldo Rp " + targetSaldo + " adalah " + lamaMenabung + " bulan.");
        System.out.println("Saldo akhir setelah " + lamaMenabung + " bulan adalah Rp " + saldoSaatIni);
    }
}
