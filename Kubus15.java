import java.util.Scanner;

public class Kubus15 {

    // Fungsi untuk menghitung luas permukaan kubus
    public static int hitungLuas(int sisi) {
        return 6 * sisi * sisi;
    }

    // Fungsi untuk menghitung volume kubus
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Sisi Kubus: ");
        int sisi = sc.nextInt();

        // Menghitung dan menampilkan luas permukaan kubus
        int luasKubus = hitungLuas(sisi);
        System.out.println("Luas Kubus adalah: " + luasKubus);

        // Menghitung dan menampilkan volume kubus
        int volumeKubus = hitungVolume(sisi);
        System.out.println("Volume Kubus adalah: " + volumeKubus);
        sc.close();
    }
}
