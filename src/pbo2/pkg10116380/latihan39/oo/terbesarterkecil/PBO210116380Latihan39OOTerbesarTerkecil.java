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
public class PBO210116380Latihan39OOTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nmPetugas;
        int jmlSiswa;

        Nilai value = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        nmPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya nilai Mahasiswa :  ");
        jmlSiswa = scn.nextInt();
        System.out.println();

        value.masukNilaiMahasiswa(jmlSiswa);
        System.out.println();
        value.tampilNilaiTerbesarTerkecil(jmlSiswa);
        
        System.out.println("Nilai Terbesar : " + value.max);
        System.out.println("Nilai Terkecil : " + value.min);
        System.out.println();
        System.out.println("Nama Petugas : " + nmPetugas);
    
    }
    
}
    
    

