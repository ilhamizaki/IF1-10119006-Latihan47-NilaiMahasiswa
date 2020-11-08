/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Main nilai mahasiswa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMahasiswa nilai = new NilaiMahasiswa();
        nilai.setQuiz(60.0);
        nilai.setUts(80.0);
        nilai.setUas(75.0);
        nilai.setNa(nilai.getQuiz(), nilai.getUts(), nilai.getUas());

        System.out.println("QUIZ : " + nilai.getQuiz());
        System.out.println("UTS : " + nilai.getUts());
        System.out.println("UAS : " + nilai.getUas());
        
        System.out.println("\nNilai Akhir = " + nilai.getNa());
        
        System.out.println("\nIndex = " + nilai.Addindex(nilai.getNa()));
        System.out.print("Keterangan = ");
        nilai.keterangan(nilai.Addindex(nilai.getNa()));
    }
    
}
