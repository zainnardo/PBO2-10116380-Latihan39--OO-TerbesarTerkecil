/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan39.oo.terbesarterkecil;

import java.util.Scanner;
      

/**
* @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang perhitungan nilai terbesar dan 
 * terkecil berbasis OO
 */
public class Nilai {
    
    public int nilai[] = new int[20];
    public int max, min;

    public void masukNilaiMahasiswa(int jmlSiswa) {
        int i;
        Scanner scn = new Scanner(System.in);
        for (i = 1; i <= jmlSiswa; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = scn.nextInt();
        }
    }

    public void tampilNilaiMahasiswa(int jmlSiswa) {
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= jmlSiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    }

    public void tampilNilaiTerbesarTerkecil(int jmlSiswa) {
        int i;

        //Inisialisasi Max dan Min
        min = nilai[1];
        max = nilai[1];

        //Penghitungan Nilai Terbesar dan Terkecil
        for (i = 1; i <= jmlSiswa; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            } else if (nilai[i] < min) {
                min = nilai[i];
            }
        }
    }


}
