/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan21;
import java.util.Scanner;
public class Latihan21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        // Inisialisasi variabel rata-rata nilai
        double rataRataNilai = 0;

        // Input nilai mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            double nilaiMahasiswa = scanner.nextDouble();

            // Hitung total nilai mahasiswa
            rataRataNilai += nilaiMahasiswa;
        }

        // Hitung rata-rata nilai mahasiswa
        rataRataNilai /= jumlahMahasiswa;

        // Output rata-rata nilai mahasiswa
        System.out.println("Rata-rata nilai mahasiswa adalah: " + rataRataNilai);
    }
    
}
