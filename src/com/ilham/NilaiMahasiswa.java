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
 * Deskripsi Program : program untuk menentukan Nilai mahasiswa
 */
public class NilaiMahasiswa {
    private double quiz;
    private double uts;
    private double uas;
    private double na;
    private char index;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getNa() {
        return na;
    }
    
    public void setNa(double quiz, double uts, double uas) {
        this.na = (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
    }
    
    public char Addindex(double nilai) {
        if((nilai >= 80) && (nilai <= 100)) {
            return index = 'A';
        } else if ((nilai >= 68) && (nilai < 80)) {
            return index = 'B';
        } else if ((nilai >= 56) && (nilai < 68)) {
            return index = 'C';
        } else if ((nilai >= 45) && (nilai < 56)) {
            return index = 'D';
        } return index = 'E';
    }
    
    public void keterangan(char index) {
        switch(index) {
            case 'A' :
                System.out.println("Sangat Baik");
                break;
            case 'B' :
                System.out.println("Baik");
                break;
            case 'C' :
                System.out.println("Cukup");
                break;
            case 'D' :
                System.out.println("Kurang");
                break;
            default :
                System.out.println("Sangat Kurang");
        }
    }
}
