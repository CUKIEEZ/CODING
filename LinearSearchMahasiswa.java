import java.util.Scanner;

public class LinearSearchMahasiswa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        input.nextLine();

        String[] nim = new String[n];
        String[] nama = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM  : ");
            nim[i] = input.nextLine();
            System.out.print("Masukkan Nama : ");
            nama[i] = input.nextLine();
        }

        String ulang;

        do {
            System.out.print("\nMasukkan nama mahasiswa yang dicari: ");
            String target = input.nextLine();

            boolean ditemukan = false;
            int indexDitemukan = -1;
            int jumlahPerbandingan = 0;

            for (int i = 0; i < n; i++) {
                jumlahPerbandingan++;
                if (nama[i].equalsIgnoreCase(target)) {
                    ditemukan = true;
                    indexDitemukan = i;
                    break;
                }
            }

            System.out.println("\n=== HASIL PENCARIAN ===");
            if (ditemukan) {
                System.out.println("Status            : Data ditemukan");
                System.out.println("Index             : " + indexDitemukan);
                System.out.println("NIM               : " + nim[indexDitemukan]);
                System.out.println("Nama              : " + nama[indexDitemukan]);
            } else {
                System.out.println("Status            : Data tidak ditemukan");
                System.out.println("Index             : -");
            }

            System.out.println("Jumlah Perbandingan: " + jumlahPerbandingan);

            System.out.print("\nCari lagi? (y/n): ");
            ulang = input.nextLine();

        } while (ulang.equalsIgnoreCase("y"));

        input.close();
    }
}
