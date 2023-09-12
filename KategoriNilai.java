import java.util.Arrays;
import java.util.Scanner;

public class KategoriNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilaiA, nilaiB, nilaiC, nilaiD;
        double nilai;

        System.out.println("====KATEGORI NILAI====");

        System.out.print("Masukkan Nilai A : ");
        nilaiA = input.nextInt();
        System.out.print("Masukkan Nilai B : ");
        nilaiB = input.nextInt();
        System.out.print("Masukkan Nilai C : ");
        nilaiC = input.nextInt();
        System.out.print("Masukkan Nilai D : ");
        nilaiD = input.nextInt();

        String kategoriA = hitungKategori(nilaiA);
        String kategoriB = hitungKategori(nilaiB);
        String kategoriC = hitungKategori(nilaiC);
        String kategoriD = hitungKategori(nilaiD);

        System.out.println("====HASIL NILAI====");
        System.out.println("Kategori Nilai A: " + kategoriA);
        System.out.println("Kategori Nilai B: " + kategoriB);
        System.out.println("Kategori Nilai C: " + kategoriC);
        System.out.println("Kategori Nilai D: " + kategoriD);

        double[] nilaiAwal = {nilaiA, nilaiB, nilaiC, nilaiD};
        nilai = Arrays.stream(nilaiAwal).average().orElse(0.0);

        String nilairatarata = hitungKategori(nilai);
        System.out.println("Kategori Rata Rata: " +nilai + " ." + nilairatarata);
        System.out.println(">_<");
    }

    public static String hitungKategori(double nilaiKategori) {
        if (nilaiKategori >= 96 && nilaiKategori <= 100) {
            return "Predikat = A";
        } else if (nilaiKategori >= 91 && nilaiKategori < 96) {
            return "Predikat = A-";
        } else if (nilaiKategori >= 86 && nilaiKategori < 91) {
            return "Predikat = B+";
        } else if (nilaiKategori >= 81 && nilaiKategori < 86) {
            return "Predikat = B";
        } else if (nilaiKategori >= 75 && nilaiKategori < 81) {
            return "Predikat = B-";
        } else if (nilaiKategori >= 70 && nilaiKategori < 75) {
            return "Predikat = C+";
        } else if (nilaiKategori >= 65 && nilaiKategori < 70) {
            return "Predikat = C";
        } else if (nilaiKategori >= 60 && nilaiKategori < 65) {
            return "Predikat = C-";
        } else if (nilaiKategori >= 55 && nilaiKategori < 60) {
            return "Predikat = D+";
        } else if (nilaiKategori >= 0 && nilaiKategori < 55) {
            return "Predikat = D";
        } else {
            return "Tidak Valid";
        }
    }
}