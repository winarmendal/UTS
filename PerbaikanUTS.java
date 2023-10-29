import java.util.Scanner;

public class PerbaikanUTS {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "Bismillahirrahmaanirrahiim, Saya Ramadhani Win Armendal berjanji dan bersungguh-sungguh semaksimal mungkin \nmengerjakan UTS ini dengan usaha sendiri, tanpa sekalipun melihat pekerjaan teman Saya, serta mematuhi \ntata tertib selama ujian. Jika Saya melanggar janji ini, Saya berani menanggung resikonya.");
        System.out.println("__________________________________________________________________________________");
        System.out.println();
        System.out.println();

        System.out.println("Program Hitung Honor Karyawan Kontrak");
        System.out.println("PT. DAMAI SEJAHTERA");
        System.out.println("=============================================================================");
        Scanner Input1 = new Scanner(System.in);
        System.out.print("Jumlah Data Karyawan yang ingin Ditampilkan : ");
        int jum_karyawan = Input1.nextInt();

        for (int i = 1; i <= jum_karyawan; ++i) {

            float tun_golongan = 0;
            float tun_pendidikan = 0;
            float total_honor_lembur = 0;
            System.out.println("========================================================================");
            System.out.println("Layaran Masukkan");
            System.out.println("Data karyawan ke " + i);
            Scanner Input2 = new Scanner(System.in);
            System.out.print("Nama Karyawan : ");
            String nama_karyawan = Input2.nextLine();

            Scanner Input3 = new Scanner(System.in);
            System.out.print("Golongan(1/2/3) : ");
            int golongan = Input3.nextInt();

            // menghitung tunjangan golongan
            if (golongan == 1) {
                tun_golongan = (float) (0.05 * 3000000);
            } else if (golongan == 2) {
                tun_golongan = (float) (0.1 * 3000000);
            } else if (golongan == 3) {
                tun_golongan = (float) (0.15 * 3000000);
            } else {
                System.out.println("Error");
                return;
            }

            Scanner Input4 = new Scanner(System.in);
            System.out.print("Pendidikan(SMU/D3/S1): ");
            int pendidikan = Input4.nextInt();
            // menghitung tunjangan pendidikan
            if (pendidikan == 1) {
                tun_pendidikan = (float) (0.025 * 3000000);
            } else if (pendidikan == 2) {
                tun_pendidikan = (float) (0.05 * 3000000);
            } else if (pendidikan == 3) {
                tun_pendidikan = (float) (0.075 * 3000000);
            }

            Scanner Input5 = new Scanner(System.in);
            System.out.print("Jumlah Jam Kerja : ");
            float jam_kerja = Input5.nextFloat();
            // menghitung honor lembur
            if (jam_kerja > 8) {
                float honorPerJam = (float) (2500);
                float tun_lembur = (float) (jam_kerja - 8);
                total_honor_lembur = honorPerJam * tun_lembur;

            }

            System.out.println();
            System.out.println("Layaran Keluaran");
            System.out.println("Karyawan yang bernama      : " + nama_karyawan);
            System.out.println("Honor yang diterima        ");
            System.out.println("Honor Tetap                Rp.3000000");
            System.out.println("Tunjangan Jabatan          Rp." + tun_golongan);
            System.out.println("Tunjangan Pendidikan       Rp." + tun_pendidikan);
            System.out.println("Honor Lembur               Rp." + total_honor_lembur);
            System.out.println("                          ----------------------------  +");
            System.out.println(
                    "Honor yang Diterima        Rp." + (3000000 + tun_golongan + tun_pendidikan + total_honor_lembur));
            System.out.println("===============================================================");
        }

    }
}
